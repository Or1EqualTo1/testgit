package com.jyq.service.impl;

import com.jyq.dao.oracle.BdcQlrMapper;
import com.jyq.dao.oracle.BdcQlrlbMapper;
import com.jyq.po.access.QlrlbExample;
import com.jyq.service.BdcQlrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class BdcQlrServiceImpl implements BdcQlrService {
    @Autowired
    private BdcQlrMapper bdcQlrMapper;
    @Override
    public Integer insert(QlrlbExample qlrlbExample) {
        return bdcQlrMapper.insert(qlrlbExample);
    }
}
