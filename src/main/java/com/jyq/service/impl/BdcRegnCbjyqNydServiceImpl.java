package com.jyq.service.impl;

import com.jyq.dao.oracle.BdcQlrMapper;
import com.jyq.dao.oracle.BdcRegnCbjyqNydMapper;
import com.jyq.po.access.AccessExample;
import com.jyq.service.BdcRegnCbjyqNydService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class BdcRegnCbjyqNydServiceImpl implements BdcRegnCbjyqNydService {
    @Autowired
    private BdcRegnCbjyqNydMapper bdcRegnCbjyqNydMapper;
    @Override
    public Integer insert(AccessExample accessExample) {
        return bdcRegnCbjyqNydMapper.insert(accessExample);
    }
}
