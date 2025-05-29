package org.example.wikitest.service;

import jakarta.annotation.Resource;
import org.example.wikitest.domain.Demo;
import org.example.wikitest.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Resource
    private DemoMapper DemoMapper;

    public List<Demo> list() {
        return DemoMapper.selectByExample(null);
    }
}
