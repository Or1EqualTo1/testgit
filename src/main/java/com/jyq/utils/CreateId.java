package com.jyq.utils;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Transactional
@Service
public class CreateId {
    static char st;

    public String CreateId() {
        String rAnd = "37JYQ";
        int length = 12;
        Random random = new Random();
        StringBuffer valSb = new StringBuffer();
        String charStr = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXVZ";
        int charLength = charStr.length();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charLength);
            valSb.append(charStr.charAt(index));
            st = charStr.charAt(index);
            rAnd = rAnd + st;
        }


        System.out.println("1231");
        return rAnd;
    }

}
