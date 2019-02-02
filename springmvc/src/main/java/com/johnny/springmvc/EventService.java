package com.johnny.springmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents() {
        Event event1 = Event.builder()
                .name("스프링 MVC 스터디 1차")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019, 1, 10, 10, 0))
                .endDateTime(LocalDateTime.of(2019, 1, 10, 12, 0))
                .build();

        Event event2 = Event.builder()
                .name("스프링 MVC 스터디 2차")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019, 1, 17, 10, 0))
                .endDateTime(LocalDateTime.of(2019, 1, 17, 12, 0))
                .build();


        List<Event> list = new ArrayList<Event>();
        list.add(event1);
        list.add(event2);

        return list;
    }
}
