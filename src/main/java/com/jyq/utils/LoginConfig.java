//package com.test.utils;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class LoginConfig implements WebMvcConfigurer {
//
//    @Bean
//    public LoginInterceptor getloginInterceptor(){
//        return new LoginInterceptor();
//    }
//
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        InterceptorRegistration registration = registry.addInterceptor(getloginInterceptor());
//        registration.addPathPatterns("/**");//拦截所有
//        registration.excludePathPatterns(
//                "/login.html", //放行登录页面
//                "/toLogin.do", //放行登录请求
//                "/css/**",  //放行css
//                "/js/**", //放行js
//                "/err/**" //放行错误页面
//        );
//    }
//}
