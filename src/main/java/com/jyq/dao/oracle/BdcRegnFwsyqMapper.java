package com.jyq.dao.oracle;

import com.jyq.po.BdcRegnFwsyq;
import com.jyq.po.BdcRegnFwsyqExample;
import com.jyq.po.BdcRegnFwsyqKey;

import java.util.List;

public interface BdcRegnFwsyqMapper {
    int deleteByPrimaryKey(BdcRegnFwsyqKey key);

    int insert(BdcRegnFwsyq record);

    int insertSelective(BdcRegnFwsyq record);

    List<BdcRegnFwsyq> selectByExample(BdcRegnFwsyqExample example);

    BdcRegnFwsyq selectByPrimaryKey(BdcRegnFwsyqKey key);

    int updateByPrimaryKeySelective(BdcRegnFwsyq record);

    int updateByPrimaryKey(BdcRegnFwsyq record);

    String selectByDate();
}