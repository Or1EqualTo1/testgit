package com.jyq.dao.oracle;

import com.jyq.po.BdcRegnCbjyqNydJtcy;
import com.jyq.po.BdcRegnCbjyqNydJtcyExample;
import com.jyq.po.BdcRegnCbjyqNydJtcyKey;
import com.jyq.po.access.JtcyExample;

import java.util.List;

public interface BdcRegnCbjyqNydJtcyMapper {
    int deleteByPrimaryKey(BdcRegnCbjyqNydJtcyKey key);

    int insert(JtcyExample jtcyExample);

    int insertSelective(BdcRegnCbjyqNydJtcy record);

    List<BdcRegnCbjyqNydJtcy> selectByExample(BdcRegnCbjyqNydJtcyExample example);

    BdcRegnCbjyqNydJtcy selectByPrimaryKey(BdcRegnCbjyqNydJtcyKey key);

    int updateByPrimaryKeySelective(BdcRegnCbjyqNydJtcy record);

    int updateByPrimaryKey(BdcRegnCbjyqNydJtcy record);
}