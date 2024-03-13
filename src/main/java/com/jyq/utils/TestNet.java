package com.jyq.utils;


import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;


public class TestNet {


    public  TestNet(String qxdm) {

        StringBuffer buffer = new StringBuffer();
        String params = "asdfsae";

        String proxyHost = null;
        Integer proxyPort = null;
        HttpURLConnection conn = null;
        try {
            URL url = new URL("https://www.fxdshen.cn/action.do?qxdm=" + qxdm);                        // 判断是否需要代理模式请求http
            if (proxyHost != null && proxyPort != null) {
               } else {
                conn = (HttpURLConnection) url.openConnection();
            }

            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            conn.setConnectTimeout(5000);

            conn.setDoInput(true);
            if (params != null) {
                conn.setRequestProperty("Content-type", "application/json");
                OutputStream os = conn.getOutputStream();
                try {
                    os.write(params.getBytes("UTF-8"));

                } catch (Exception e) {
//                    System.out.println("HttpPostUtils doPost error: " + e);
                } finally {
                    try {
                        if (os != null) {
                            os.close();
                        }
                    } catch (IOException e) {
//                        System.out.println("HttpPostUtils doPost error: " + e);
                    }
                }
            }
            InputStream is = null;
            InputStreamReader inputReader = null;
            BufferedReader reader = null;
            try {
                is = conn.getInputStream();
                inputReader = new InputStreamReader(is, "UTF-8");
                reader = new BufferedReader(inputReader);
                String temp;
                while ((temp = reader.readLine()) != null) {
                    buffer.append(temp);
                    StringBuffer append = buffer.append(temp);
                    System.out.println("append.toString()="+append.toString());


                }
            } catch (Exception e) {
//                System.out.println("HttpPostUtils doPost error: " + e);
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                    if (inputReader != null) {
                        inputReader.close();
                    }
                    if (is != null) {
                        is.close();
                    }
                } catch (IOException e) {
                    System.out.println("HttpPostUtils doPost error: " + e);
                }
            }

        } catch (MalformedURLException e) {
//            e.printStackTrace();
        } catch (IOException e) {
//            e.printStackTrace();
        } finally {
            // 当http连接空闲时, 释放资源
            if (conn != null) {
                conn.disconnect();
            }
        }
    }
}
