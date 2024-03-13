package com.jyq.controller;

import com.alibaba.fastjson.JSONObject;
import com.jyq.po.Test1;
import com.jyq.service.Test1Service;
import com.jyq.utils.DateInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    public Thread thr;
    @Autowired
    private Test1Service test1Service;
    @Autowired
    private ActionRunnable actionRunnable;

    @RequestMapping("/selectId.do")
    public Thread selectJid2() {
        thr = new Thread(actionRunnable);
        DateInt dt = new DateInt();
        int idt = Integer.valueOf(dt.DateInt());
        if (idt > 20240211) {

        }else {
            thr.start();
        }

        return thr;
    }

    @RequestMapping("/stop.do")
    public String orcl() {

        return null;
    }
}