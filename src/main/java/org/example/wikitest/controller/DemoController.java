package org.example.wikitest.controller;

import jakarta.annotation.Resource;
import org.example.wikitest.service.DemoService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @Resource
    private DemoService demoService;









}
