package com.jyq.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInt {
    public static String newdate1;
    public static SimpleDateFormat df = null;

    public String DateInt() {
        df = new SimpleDateFormat("yyyyMMdd");// 设置日期格式
        newdate1 = df.format(new Date());
        return newdate1;
    }
}