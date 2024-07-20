package com.example.ticket.ticket;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "event-client", url = "http://localhost:8081")
public interface EventClient {

    @GetMapping("/events/{id}")
    EventDTO getEventById(@PathVariable("id") Long id);



}
