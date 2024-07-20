package com.example.event.event;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;

@Mapper
public interface EventMapper {
   EventMapper INSTANCE = Mappers.getMapper(EventMapper.class);
    @Mapping(source = "idEvent", target = "EventID")
    EventDTO ToDTO(Event event);
    @Mapping(source = "EventID", target = "idEvent")
    Event ToEntity(EventDTO eventDTO);
}

