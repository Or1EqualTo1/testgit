package com.jyq.dao.oracle;

import com.jyq.po.Test1;
import com.jyq.po.Test1Example;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface Test1Mapper {
    int deleteByPrimaryKey(Integer jId);

    int insert(Test1 record);

    int insertSelective(Test1 record);

    List<Test1> selectByExample(Test1Example example);

    String selectByPrimaryKey(Integer jId);

    int updateByPrimaryKeySelective(Test1 record);

    int updateByPrimaryKey(Test1 record);
    Test1 selectById(Integer jId);
    Test1 selectByUnion(Integer jId);
}