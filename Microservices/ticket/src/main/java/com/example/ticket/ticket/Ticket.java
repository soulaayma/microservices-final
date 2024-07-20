package com.example.ticket.ticket;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tickets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ticket {

    @Id
    private Long ticketID;

    private String category;
    private String Age;
    private String Pricing;
    private Long idEvent;

}
