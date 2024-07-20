package com.example.ticket.ticket;

import lombok.Builder;

@Builder
public record EventDTO(String EventID, String name) {}