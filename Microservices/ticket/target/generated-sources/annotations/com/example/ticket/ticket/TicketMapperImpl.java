package com.example.ticket.ticket;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-20T02:08:07+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
@Component
public class TicketMapperImpl implements TicketMapper {

    @Override
    public TicketDTO toDto(Ticket ticket) {
        if ( ticket == null ) {
            return null;
        }

        TicketDTO.TicketDTOBuilder ticketDTO = TicketDTO.builder();

        ticketDTO.ticketID( ticket.getTicketID() );

        return ticketDTO.build();
    }

    @Override
    public Ticket toEntity(TicketDTO ticketDTO) {
        if ( ticketDTO == null ) {
            return null;
        }

        Ticket ticket = new Ticket();

        ticket.setTicketID( ticketDTO.ticketID() );

        return ticket;
    }
}
