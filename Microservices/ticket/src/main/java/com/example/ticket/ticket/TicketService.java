package com.example.ticket.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    private TicketRepository ticketRepository;
    private EventClient eventClient;
    private TicketMapper ticketMapper;


    @Autowired
    public TicketService(TicketRepository ticketRepository, EventClient eventClient, TicketMapper ticketMapper) {
        this.ticketRepository = ticketRepository;
        this.eventClient = eventClient;
        this.ticketMapper = ticketMapper;
    }


    public TicketDTO getTicketById(Long id) {
        return ticketRepository.findById(id).map(ticket -> {
            System.out.println("Ticket found: " + ticket);

            EventDTO eventDTO = eventClient.getEventById(ticket.getIdEvent());
            System.out.println("Event fetched: " + eventDTO);

            TicketDTO ticketDTO = ticketMapper.toDto(ticket);
            System.out.println("TicketDTO created: " + ticketDTO);

            return new TicketDTO(ticketDTO.ticketID(), ticketDTO.name(), eventDTO);
        }).orElseThrow(() -> new IllegalArgumentException("Ticket not found"));
    }

    public TicketDTO saveTicket(TicketDTO ticketDTO) {
        Ticket ticket = ticketMapper.toEntity(ticketDTO);
        ticket = ticketRepository.save(ticket);
        return ticketMapper.toDto(ticket);
    }
    

}