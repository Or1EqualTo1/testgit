package com.jyq.service.impl;

import com.jyq.dao.oracle.BdcRegnCbjyqNydMapper;
import com.jyq.dao.oracle.BdcRegnFwsyqMapper;
import com.jyq.service.BdcRegnFwsyqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class BdcRegnFwsyqServiceImpl implements BdcRegnFwsyqService {

    @Autowired
    private BdcRegnFwsyqMapper bdcRegnFwsyqMapper;

    @Override
    public String selectByDate() {
        return bdcRegnFwsyqMapper.selectByDate();
    }
}
