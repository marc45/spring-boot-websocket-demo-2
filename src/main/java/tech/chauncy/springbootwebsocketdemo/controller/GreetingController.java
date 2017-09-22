package tech.chauncy.springbootwebsocketdemo.controller;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @MessageMapping("/greeting") 
    public String handle(String greeting) {
        return "[" + getTimestamp() + ": " + greeting;
    }
	
    
    private String getTimestamp() {
    	return new Date().toString();
    }
}
