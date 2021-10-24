package co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.controller;

import co.edu.udem.loscalidosos.devopscalidad.Foo;
import co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.service.IFooService;
import co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.service.ILoggingService;
import co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.service.LoggingService;
import co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.service.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loggings")
public class LoggingController {
    //private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);


    @Autowired
    private ILoggingService loggingService;

    @GetMapping
    public String findAll() {
        return "Hi";
    }

    @GetMapping(value = "/warning")
    public String warning() {
        return loggingService.warning();
    }

    @GetMapping(value = "/error")
    public String error() {
        return loggingService.error();
    }

    @GetMapping(value = "/info")
    public String info() {
        return loggingService.info();
    }

    @GetMapping(value = "/debug")
    public String debug() {
        return loggingService.debug();
    }
}
