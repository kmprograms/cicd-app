package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @GetMapping({"", "/"})
    public List<String> test1() {
        return List.of("INDEX");
    }

    @GetMapping("/test")
    public List<String> test2() {
        return List.of("TEST");
    }

}
