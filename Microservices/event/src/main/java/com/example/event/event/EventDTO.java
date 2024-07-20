package com.example.event.event;

import lombok.Builder;

@Builder
public record EventDTO(Long EventID, String name) {

    public static EventDTO mapFromEntity(Event event) {
        return EventMapper.INSTANCE.ToDTO(event);
    }

    public static Event mapToEntity(EventDTO eventDTO) {
        return EventMapper.INSTANCE.ToEntity(eventDTO);
    }
}

