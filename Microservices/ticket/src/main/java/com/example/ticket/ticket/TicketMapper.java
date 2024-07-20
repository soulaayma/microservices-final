package com.example.ticket.ticket;

import com.example.ticket.ticket.TicketDTO;
import com.example.ticket.ticket.Ticket;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TicketMapper {
    TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);
    @Mapping(source = "ticketID", target = "ticketID")
    TicketDTO toDto(Ticket ticket);
    @Mapping(source = "ticketID", target = "ticketID")
    Ticket toEntity(TicketDTO ticketDTO);
}

