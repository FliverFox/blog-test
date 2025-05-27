package org.example.wikitest.controller;

import jakarta.annotation.Resource;
import org.example.wikitest.domain.Test;
import org.example.wikitest.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TestController {

    @Value("${test.hello}")
    private String testHello;

    @Resource
    private TestService testService;
    @GetMapping("/hello")
    public String hello() {
        return "HELLO WORLD!!!"+testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "HELLO WORLD!!POST!"+name;
    }


    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }



}
