package com.jyq.dao.access;

import com.jyq.po.access.AccessExample;
import com.jyq.po.access.JtcyExample;
import com.jyq.po.access.QlrlbExample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestAccessMapper {
    Integer cbjyqzdjbcbjyqzbm();
    Integer cbjyqzdjbfbfbm();
    Integer cbjyqzdjbcbfbm();
    Integer cbjyqzdjbcbfs();
    Integer cbjyqzdjbcbqx();
    Integer cbjyqzdjbcbqxq();
    Integer cbjyqzdjbcbqxz();
    Integer cbjyqzdjbdbr();
    Integer cbjyqzdjbdjsj();
    Integer cbdkxxdkbm();
    Integer cbdkxxfbfbm();
    Integer cbdkxxcbfbm();
    Integer cbdkxxcbjyqqdfs();
    Integer cbdkxxcbhtbm();
    Integer cbdkxxcbjyqzbm();
    Integer cbdkxxhtmj();
    Integer cbfjtcycbfbm();
    Integer cbfjtcycyxm();
    Integer cbfjtcycyxb();
    Integer cbfjtcycyzjlx();
    Integer cbfjtcycyzjhm();
    Integer cbfjtcyyhzgx();

    Integer cbjyqzdjbcbjyqzlsh();
    Integer cbjyqzdjbdksyt();

    AccessExample selectByHtmj(String jId);

    Integer selectAccessCt();

    String selectByAll(String cbfbm);

    Integer selectAccessCt2(String cbfbm);

    String selectByDkbm(AccessExample accessExample);
    String selectByDkbm1(AccessExample accessExample);

    AccessExample selectAccessDjb(AccessExample accessExample);

    Integer updateByPrimaryKey(String dkbm);

    Integer updateByDjb(String cbfbm);

    QlrlbExample selectqlrlb(QlrlbExample qlrlbExample);//

    QlrlbExample selectywrlb(QlrlbExample qlrlbExample);//

    Integer selectJtcyCt(String cbfbm);

    JtcyExample selectJtcy(JtcyExample jtcyExample);

    JtcyExample selectJtcy1(JtcyExample jtcyExample);

    Integer updateJtcy(String sfzhm);
}
