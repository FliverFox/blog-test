package org.example.wikitest.controller;

import jakarta.annotation.Resource;
import org.example.wikitest.domain.Demo;
import org.example.wikitest.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/list")
    public List<Demo> list() {
        return demoService.list();
    }








}
