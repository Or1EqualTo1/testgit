package com.jyq.dao.oracle;

import com.jyq.po.BdcQlrlb;
import com.jyq.po.BdcQlrlbExample;
import com.jyq.po.BdcQlrlbKey;
import com.jyq.po.access.QlrlbExample;

import java.util.List;

public interface BdcQlrlbMapper {
    int deleteByPrimaryKey(BdcQlrlbKey key);

    int insert(QlrlbExample qlrlbExample);

    int insertSelective(BdcQlrlb record);

    List<BdcQlrlb> selectByExample(BdcQlrlbExample example);

    BdcQlrlb selectByPrimaryKey(BdcQlrlbKey key);

    int updateByPrimaryKeySelective(BdcQlrlb record);

    int updateByPrimaryKey(BdcQlrlb record);
}