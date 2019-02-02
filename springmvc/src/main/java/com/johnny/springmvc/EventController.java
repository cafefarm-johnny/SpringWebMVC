package com.johnny.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

    @Autowired
    EventService eventService;

    // "/events"라는 URL에 RequestMethod로 GET 요청이 들어오면 요청을 처리하는 이벤트 핸들러가 된다.
    // Spring 4.3 버전 이후로는 @GetMapping을 사용하여 좀 더 짧고 직관적이게 사용할 수 있다.
    //@RequestMapping(value = "/events", method = RequestMethod.GET)
    @GetMapping("/events")
    public String event(Model model) {
        // 뷰에 전달할 모델 데이터
        model.addAttribute("events", eventService.getEvents());

        // view의 이름
        return "events";
    }
}
