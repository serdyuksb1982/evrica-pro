package ru.serdiuk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/main")
public class TestController {

    @GetMapping("/date")
    public String test() {
        //TODO .......
        LocalDate localDate = LocalDate.now().plusMonths(1);
        return localDate.toString();
    }
}
