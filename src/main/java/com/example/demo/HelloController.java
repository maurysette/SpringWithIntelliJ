package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// defini le controller
@RestController
public class HelloController {

    // raccourci , remplace la synthaxe @RequestMapping(method=RequestMethod.GET)
    // a utiliser si une seul valeur , sinon @GetMapping(value="hello")
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
