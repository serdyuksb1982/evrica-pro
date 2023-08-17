package ru.serdiuk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/main")
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String id;

    @GetMapping("/date")
    public String test() {
        //TODO .......
        LocalDate localDate = LocalDate.now();
        return localDate + " id = " + id;
    }
}
