package com.example.ticket.ticket;

import com.example.ticket.ticket.TicketDTO;
import com.example.ticket.ticket.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/{id}")
    public TicketDTO getTicketById(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

    @PostMapping
    public TicketDTO createTicket(@RequestBody TicketDTO ticketDTO) {
        return ticketService.saveTicket(ticketDTO);
    }

    @PutMapping("/{id}")
    public TicketDTO updateTicket(@PathVariable Long id, @RequestBody TicketDTO ticketDTO) {
        // Create a new TicketDTO with the updated id
        TicketDTO updatedTicketDTO = new TicketDTO(id, ticketDTO.name(), ticketDTO.event());
        return ticketService.saveTicket(updatedTicketDTO);
    }
}