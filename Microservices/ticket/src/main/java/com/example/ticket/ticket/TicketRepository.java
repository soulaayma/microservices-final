package com.example.ticket.ticket;

import com.example.ticket.ticket.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, Long> {
}