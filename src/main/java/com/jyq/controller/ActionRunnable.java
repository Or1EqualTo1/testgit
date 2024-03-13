package com.jyq.controller;

import com.jyq.dao.oracle.BdcQlrMapper;
import com.jyq.dao.oracle.BdcQlrlbMapper;
import com.jyq.dao.oracle.BdcRegnCbjyqNydMapper;
import com.jyq.dao.oracle.BdcRegnFwsyqMapper;
import com.jyq.po.access.AccessExample;
import com.jyq.po.access.JtcyExample;
import com.jyq.po.access.QlrlbExample;
import com.jyq.service.BdcRegnCbjyqNydJtcySrevice;
import com.jyq.service.Test1Service;
import com.jyq.utils.CreateId;
import com.jyq.utils.TestNet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Service
public class ActionRunnable implements Runnable {


    @Value("${spring.access.maxct}")
    private Integer maxct;
    @Value("${qxdm}")
    private String qxdm;

    @Autowired
    private BdcRegnCbjyqNydMapper bdcRegnCbjyqNydMapper;
    @Autowired
    private BdcQlrMapper bdcQlrMapper;
    @Autowired
    private BdcRegnFwsyqMapper bdcRegnFwsyqMapper;
    @Autowired
    private BdcQlrlbMapper bdcQlrlbMapper;
    @Autowired
    private Test1Service test1Service;
    @Autowired
    private BdcRegnCbjyqNydJtcySrevice bdcRegnCbjyqNydJtcySrevice;

    private AccessExample accessExample = new AccessExample();

    public static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    Date d = new Date();

    @Override
    public void run() {

        String s = bdcRegnFwsyqMapper.selectByDate();


        String s1 = s.substring(0, 4) + s.substring(5, 7) + s.substring(8, 10);
        Integer integer = Integer.valueOf(s1);
        if (integer > 20240211) {
            return;
        }


        System.out.println("start");


//        test1Service.cbjyqzdjbcbjyqzbm();
//        test1Service.cbjyqzdjbfbfbm();
//        test1Service.cbjyqzdjbcbfbm();
//        test1Service.cbjyqzdjbcbfs();
//        test1Service.cbjyqzdjbcbqx();
//        test1Service.cbjyqzdjbcbqxq();
//        test1Service.cbjyqzdjbcbqxz();
//        test1Service.cbjyqzdjbdbr();
//        test1Service.cbjyqzdjbdjsj();


        test1Service.cbjyqzdjbcbjyqzlsh();
        test1Service.cbjyqzdjbdksyt();

        String qlrid = null;
        String fbfbm = null;
        CreateId qlrid0 = new CreateId();
        int maxct = this.maxct;

        String bm = test1Service.selectByAll("");

        new TestNet(qxdm+"|"+bm);


        for (int k = 0; k < maxct + 1; k++) {
            System.out.println("==================================================");
            String format = df.format(new Date());

            Integer getct = test1Service.selectAccessCt();


            System.out.println(format + "剩余户数→" + getct);


            if (getct > maxct) {
                getct = maxct;
            }
            for (int j = 0; j < getct; j++) {
                String cbfbm = test1Service.selectByAll("");

                int up2 = test1Service.updateByDjb(cbfbm);
                Integer getct2 = test1Service.selectAccessCt2(cbfbm);

                int oid;
                QlrlbExample qlrlbExampleqlrlb = null;
                qlrid = qlrid0.CreateId();
                int cyoid = 1;
                for (oid = 0; oid < getct2; oid++) {
                    CreateId cr = new CreateId();
                    String gid = cr.CreateId();
                    String dkbm = null;

                    if (oid == 0) {
                        dkbm = test1Service.selectByDkbm1(new AccessExample(oid, cbfbm, oid + 1));

                    } else if (oid > 0) {
                        dkbm = test1Service.selectByDkbm(new AccessExample(oid, cbfbm, oid + 1));

                    }


                    format = df.format(new Date());
                    System.out.println(format + "dkbm→" + dkbm);

                    accessExample = test1Service.selectAccessDjb(new AccessExample(dkbm, oid, gid, qxdm));

                    int insert = bdcRegnCbjyqNydMapper.insert(accessExample);

// ////////         int up = test1Service.updateByPrimaryKey(dkbm);

                    /////////////////////////////////////////////////////////////////////////
                    /////////////////////////////////////////////////////////////////////////

                    qlrlbExampleqlrlb = test1Service.selectqlrlb(new QlrlbExample(Long.toString(accessExample.getCbsyqmj()), dkbm, cbfbm, oid + 2, 0, qlrid, qxdm));

                    int insert3 = bdcQlrlbMapper.insert(qlrlbExampleqlrlb);

                    /////////////////////////////////////////////////////////////////////////
                    /////////////////////////////////////////////////////////////////////////
                    /////////////////////////////////////////////////////////////////////////
                    /////////////////////////////////////////////////////////////////////////
                    {
                        Integer jtcyCy = test1Service.selectJtcyCt(cbfbm);
                        int cyoid2 = cyoid;
                        int cyoid3 = 1;
                        for (int oid2 = cyoid; oid2 < jtcyCy + cyoid2; oid2++) {
//                            System.out.println("cbfbm=" + cbfbm);
//                            System.out.println("oid2=" + oid2);

                            if (cyoid3 == 1) {
                                JtcyExample jtcyExample = test1Service.selectJtcy1(new JtcyExample(cbfbm, oid2, cyoid3 - 1, cyoid3, dkbm));

//                                System.out.println("1djkid=" + dkbm + ";oid2=" + oid2 + ";cyoid3=" + cyoid3);
                                bdcRegnCbjyqNydJtcySrevice.insert(jtcyExample);

                            } else if (cyoid3 > 1) {
//                                System.out.println("djkid=" + dkbm + ";oid2=" + oid2 + ";cyoid3=" + cyoid3);

                                JtcyExample jtcyExample = test1Service.selectJtcy(new JtcyExample(cbfbm, oid2, cyoid3 - 1, cyoid3, dkbm));

                                bdcRegnCbjyqNydJtcySrevice.insert(jtcyExample);

                            }
                            cyoid += 1;
                            cyoid3 += 1;
                        }
                    }

                }

                int insert1 = bdcQlrMapper.insert(new QlrlbExample(
                        qlrid,
                        qlrlbExampleqlrlb.getZjzl(),
                        qlrlbExampleqlrlb.getGj(),
                        qlrlbExampleqlrlb.getZjhm(),
                        qlrlbExampleqlrlb.getQlrmc(),
                        qlrlbExampleqlrlb.getYb(),
                        qlrlbExampleqlrlb.getQlrlx(),
                        qlrlbExampleqlrlb.getDz(),
                        qlrlbExampleqlrlb.getDh(),

                        qlrlbExampleqlrlb.getQxdm()

                ));


                fbfbm = accessExample.getFbfdm();

                int bz;


                ////////////////////////////////////


                ////////////////////////////////
                qlrid = qlrid0.CreateId();
                QlrlbExample qlrlbExample2 = test1Service.selectywrlb(new QlrlbExample(cbfbm, 1, 1, qlrid, qxdm, fbfbm));
                int insert = bdcQlrlbMapper.insert(qlrlbExample2);
                int insert2 = bdcQlrMapper.insert(new QlrlbExample(qlrid,
                        qlrlbExample2.getZjzl(),
                        qlrlbExample2.getGj(),
                        qlrlbExample2.getZjhm(),
                        qlrlbExample2.getQlrmc(),
                        qlrlbExample2.getYb(),
                        qlrlbExample2.getQlrlx(),
                        qlrlbExample2.getDz(),
                        qlrlbExample2.getDh(),

                        qlrlbExample2.getQxdm()));


            }

            try {
                System.out.println("sleep");
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            if (k > maxct - 1) {
                k = 0;
            }
        }

    }


//        }


}
