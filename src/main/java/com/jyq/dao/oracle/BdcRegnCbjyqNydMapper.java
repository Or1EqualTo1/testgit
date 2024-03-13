package com.jyq.dao.oracle;

import com.jyq.po.BdcRegnCbjyqNyd;
import com.jyq.po.BdcRegnCbjyqNydExample;
import com.jyq.po.BdcRegnCbjyqNydKey;
import com.jyq.po.access.AccessExample;
import com.jyq.po.access.JtcyExample;

import java.util.List;

public interface BdcRegnCbjyqNydMapper {
    int deleteByPrimaryKey(BdcRegnCbjyqNydKey key);

    int insert(AccessExample accessExample);

    int insertSelective(BdcRegnCbjyqNyd record);

    List<BdcRegnCbjyqNyd> selectByExample(BdcRegnCbjyqNydExample example);

    BdcRegnCbjyqNyd selectByPrimaryKey(BdcRegnCbjyqNydKey key);

    int updateByPrimaryKeySelective(BdcRegnCbjyqNyd record);

    int updateByPrimaryKey(BdcRegnCbjyqNyd record);
}