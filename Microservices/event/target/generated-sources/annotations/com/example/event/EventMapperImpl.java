package com.example.event;

import com.example.event.event.Event;
import com.example.event.event.EventDTO;
import com.example.event.event.EventMapper;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-19T19:09:14+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
public class EventMapperImpl implements EventMapper {

    @Override
    public EventDTO ToDTO(Event event) {
        if ( event == null ) {
            return null;
        }

        EventDTO.EventDTOBuilder eventDTO = EventDTO.builder();

        eventDTO.EventID( event.getIdEvent() );

        return eventDTO.build();
    }

    @Override
    public Event ToEntity(EventDTO eventDTO) {
        if ( eventDTO == null ) {
            return null;
        }

        Event event = new Event();

        event.setIdEvent( eventDTO.EventID() );

        return event;
    }
}
