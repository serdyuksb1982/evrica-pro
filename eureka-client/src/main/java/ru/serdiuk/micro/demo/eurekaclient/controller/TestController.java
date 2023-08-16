package ru.serdiuk.micro.demo.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class TestController {

    @GetMapping("/actuator/info")
    public String test() {
        //TODO .......
        LocalDate localDate = LocalDate.now();
        return localDate.toString();
    }
}
