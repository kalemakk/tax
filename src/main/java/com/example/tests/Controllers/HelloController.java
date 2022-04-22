package com.example.tests.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
@Slf4j
public class HelloController {

    @GetMapping
    public String sayHello(){
        log.info("This is great");
        return "Hello World I HOPE this is an update";
    }


}
