package io.pivotal.workshop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    //for yaml property custom.message
    //@Value("${custom.message}")
    @Value("${message}")
    private String message;
    @GetMapping("/")
    public String greeting() {
        return message;
    }
}