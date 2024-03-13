package com.jyq.dao.oracle;

import com.jyq.po.BdcQlr;
import com.jyq.po.BdcQlrExample;
import com.jyq.po.access.QlrlbExample;

import java.util.List;

public interface BdcQlrMapper {
    int deleteByPrimaryKey(String qlrid);

    int insert(QlrlbExample qlrlbExample);

    int insertSelective(BdcQlr record);

    List<BdcQlr> selectByExample(BdcQlrExample example);

    BdcQlr selectByPrimaryKey(String qlrid);

    int updateByPrimaryKeySelective(BdcQlr record);

    int updateByPrimaryKey(BdcQlr record);
}