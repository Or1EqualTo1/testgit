package com.jyq.dao.oracle;

import com.jyq.po.Rsbdc;
import com.jyq.po.RsbdcExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface RsbdcMapper {
    int insert(Rsbdc record);

    int insertSelective(Rsbdc record);

    List<Rsbdc> selectByExample(RsbdcExample example);
}