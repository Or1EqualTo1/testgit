package com.jyq.service.impl;

import com.jyq.dao.oracle.BdcQlrlbMapper;
import com.jyq.dao.oracle.BdcRegnCbjyqNydJtcyMapper;
import com.jyq.po.access.QlrlbExample;
import com.jyq.service.BdcQlrlbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class BdcQlrlbServiceImpl implements BdcQlrlbService {
    @Autowired
    private BdcQlrlbMapper bdcQlrlbMapper;
    @Override
    public Integer insert(QlrlbExample qlrlbExample) {

        return bdcQlrlbMapper.insert(qlrlbExample);
    }


}
