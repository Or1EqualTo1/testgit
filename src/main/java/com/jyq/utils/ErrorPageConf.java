//package com.test.utils;
//
//import org.springframework.boot.web.server.ErrorPage;
//import org.springframework.boot.web.server.ErrorPageRegistrar;
//import org.springframework.boot.web.server.ErrorPageRegistry;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;
//
//@Configuration
//public class ErrorPageConf implements ErrorPageRegistrar {
//    @Override
//    public void registerErrorPages(ErrorPageRegistry registry) {
//
//        ErrorPage errorPage404 = new ErrorPage(HttpStatus.NOT_FOUND,"/err/404.html");
//        ErrorPage errorPage401 = new ErrorPage(HttpStatus.UNAUTHORIZED,"/err/401.html");
//        ErrorPage errorPage402 = new ErrorPage(HttpStatus.PAYMENT_REQUIRED,"/err/402.html");
//        ErrorPage errorPage400 = new ErrorPage(HttpStatus.BAD_REQUEST,"/err/400.html");
//        ErrorPage errorPage500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/err/500.html");
//        registry.addErrorPages(errorPage404,errorPage401,errorPage402,errorPage400,errorPage500);
//
//
//    }
//}
