package com.rollbot.secretstore.filestore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/")
    public String home() {
        return "Hello, Foreigner";
    }

    @GetMapping("greet")
    public String greetings(@RequestParam String name) {
        return "Hello, "+name;
    }
}
