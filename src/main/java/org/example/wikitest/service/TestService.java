package org.example.wikitest.service;

import jakarta.annotation.Resource;
import org.example.wikitest.domain.Test;
import org.example.wikitest.mapper.TestMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }

}
