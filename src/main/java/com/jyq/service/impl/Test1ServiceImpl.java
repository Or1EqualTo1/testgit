package com.jyq.service.impl;


import com.jyq.dao.access.TestAccessMapper;
import com.jyq.dao.oracle.Test1Mapper;
import com.jyq.po.Test1;
import com.jyq.po.Test1Example;
import com.jyq.po.access.AccessExample;
import com.jyq.po.access.JtcyExample;
import com.jyq.po.access.QlrlbExample;
import com.jyq.service.Test1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class Test1ServiceImpl implements Test1Service {

    @Autowired
    private Test1Mapper test1Dao;

    @Autowired
    private TestAccessMapper accessDao;

    @Override
    public Integer cbjyqzdjbcbjyqzbm() {
        return accessDao.cbjyqzdjbcbjyqzbm();
    }

    @Override
    public Integer cbjyqzdjbfbfbm() {
        return accessDao.cbjyqzdjbfbfbm();
    }

    @Override
    public Integer cbjyqzdjbcbfbm() {
        return accessDao.cbjyqzdjbcbfbm();
    }

    @Override
    public Integer cbjyqzdjbcbfs() {
        return accessDao.cbjyqzdjbcbfs();
    }

    @Override
    public Integer cbjyqzdjbcbqx() {
        return accessDao.cbjyqzdjbcbqx();
    }

    @Override
    public Integer cbjyqzdjbcbqxq() {
        return accessDao.cbjyqzdjbcbqxq();
    }

    @Override
    public Integer cbjyqzdjbcbqxz() {
        return accessDao.cbjyqzdjbcbqxz();
    }

    @Override
    public Integer cbjyqzdjbdbr() {
        return accessDao.cbjyqzdjbdbr();
    }

    @Override
    public Integer cbjyqzdjbdjsj() {
        return accessDao.cbjyqzdjbdjsj();
    }

    @Override
    public Integer cbdkxxdkbm() {
        return accessDao.cbdkxxdkbm();
    }

    @Override
    public Integer cbdkxxfbfbm() {
        return accessDao.cbdkxxfbfbm();
    }

    @Override
    public Integer cbdkxxcbfbm() {
        return accessDao.cbdkxxcbfbm();
    }

    @Override
    public Integer cbdkxxcbjyqqdfs() {
        return accessDao.cbdkxxcbjyqqdfs();
    }

    @Override
    public Integer cbdkxxcbhtbm() {
        return accessDao.cbdkxxcbhtbm();
    }

    @Override
    public Integer cbdkxxcbjyqzbm() {
        return accessDao.cbdkxxcbjyqzbm();
    }

    @Override
    public Integer cbdkxxhtmj() {
        return accessDao.cbdkxxhtmj();
    }

    @Override
    public Integer cbfjtcycbfbm() {
        return accessDao.cbfjtcycbfbm();
    }

    @Override
    public Integer cbfjtcycyxm() {
        return accessDao.cbfjtcycyxm();
    }

    @Override
    public Integer cbfjtcycyxb() {
        return accessDao.cbfjtcycyxb();
    }

    @Override
    public Integer cbfjtcycyzjlx() {
        return accessDao.cbfjtcycyzjlx();
    }

    @Override
    public Integer cbfjtcycyzjhm() {
        return accessDao.cbfjtcycyzjhm();
    }

    @Override
    public Integer cbfjtcyyhzgx() {
        return accessDao.cbfjtcyyhzgx();
    }

    @Override
    public Integer cbjyqzdjbcbjyqzlsh() {
        return accessDao.cbjyqzdjbcbjyqzlsh();
    }

    @Override
    public Integer cbjyqzdjbdksyt() {
        return accessDao.cbjyqzdjbdksyt();
    }

    @Override
    public List<Test1> selectByExample(Test1Example example) {
        return test1Dao.selectByExample(example);
    }

    @Override
    public String selectByPrimaryKey(Integer jId) {
        return test1Dao.selectByPrimaryKey(jId);
    }

    @Override
    public int updateByPrimaryKeySelective(Test1 record) {
        return test1Dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insert(Test1 record) {
        return test1Dao.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer jId) {
        return test1Dao.deleteByPrimaryKey(jId);
    }


    @Override
    public Test1 selectById(Integer jId) {
        return test1Dao.selectById(jId);
    }

    @Override
    public Test1 selectByUnion(Integer jId) {
        return test1Dao.selectByUnion(jId);
    }

    @Override
    public AccessExample selectByHtmj(String jId) {
        return accessDao.selectByHtmj(jId);
    }

    @Override
    public Integer selectAccessCt() {
        return accessDao.selectAccessCt();
    }

    @Override
    public String selectByAll(String cbfbm) {
        return accessDao.selectByAll(cbfbm);
    }

    @Override
    public Integer selectAccessCt2(String cbfbm) {
        return accessDao.selectAccessCt2(cbfbm);
    }


    @Override
    public String selectByDkbm(AccessExample accessExample) {
        return accessDao.selectByDkbm(accessExample);
    }
    @Override
    public String selectByDkbm1(AccessExample accessExample) {
        return accessDao.selectByDkbm1(accessExample);
    }

    @Override
    public AccessExample selectAccessDjb(AccessExample accessExample) {
        return accessDao.selectAccessDjb(accessExample);
    }

    @Override
    public Integer updateByPrimaryKey(String dkbm) {
        return accessDao.updateByPrimaryKey(dkbm);
    }

    @Override
    public Integer updateByDjb(String cbfbm) {
        return accessDao.updateByDjb(cbfbm);
    }

    @Override
    public QlrlbExample selectqlrlb(QlrlbExample qlrlbExample) {
        return accessDao.selectqlrlb(qlrlbExample);
    }

    @Override
    public QlrlbExample selectywrlb(QlrlbExample qlrlbExample) {
        return accessDao.selectywrlb(qlrlbExample);
    }

    @Override
    public Integer selectJtcyCt(String cbfbm) {
        return accessDao.selectJtcyCt(cbfbm);
    }

    @Override
    public JtcyExample selectJtcy(JtcyExample jtcyExample) {
        return accessDao.selectJtcy(jtcyExample);
    }

    @Override
    public JtcyExample selectJtcy1(JtcyExample jtcyExample) {
        return accessDao.selectJtcy1(jtcyExample);
    }

    @Override
    public Integer updateJtcy(String sfzhm) {
        return accessDao.updateJtcy(sfzhm);
    }

}

