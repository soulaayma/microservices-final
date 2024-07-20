package com.example.ticket.ticket;

import lombok.Builder;
import com.example.ticket.ticket.TicketMapper;
import lombok.Getter;
import lombok.Setter;

@Builder
public record TicketDTO(Long ticketID, String name, EventDTO event) {

}