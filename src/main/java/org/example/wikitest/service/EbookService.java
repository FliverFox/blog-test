package org.example.wikitest.service;

import jakarta.annotation.Resource;
import org.example.wikitest.domain.Ebook;
import org.example.wikitest.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper EbookMapper;

    public List<Ebook> list() {
        return EbookMapper.selectByExample(null);
    }
}
