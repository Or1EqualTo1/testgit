package com.jyq.service.impl;

import com.jyq.dao.oracle.BdcQlrlbMapper;
import com.jyq.dao.oracle.BdcRegnCbjyqNydJtcyMapper;
import com.jyq.dao.oracle.BdcRegnCbjyqNydMapper;
import com.jyq.dao.oracle.Test1Mapper;
import com.jyq.po.BdcQlr;
import com.jyq.po.access.JtcyExample;
import com.jyq.service.BdcRegnCbjyqNydJtcySrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class BdcRegnCbjyqNydJtcyServiceImpl implements BdcRegnCbjyqNydJtcySrevice {
    @Autowired
    private  BdcRegnCbjyqNydJtcyMapper bdcRegnCbjyqNydJtcyMapper;

    @Override
    public Integer insert(JtcyExample jtcyExample) {
        return bdcRegnCbjyqNydJtcyMapper.insert(jtcyExample);
    }
}
