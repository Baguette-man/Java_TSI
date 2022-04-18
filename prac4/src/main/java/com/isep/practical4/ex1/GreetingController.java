package com.raca.prac4.ex1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "Hello, my name is %s!";

    @GetMapping(path="/greeting")
    public Greeting greeting(
            @RequestParam(
                    value = "name",
                    defaultValue = "Spring")String name){
            return new Greeting(String.format(template, name));
    }
}
