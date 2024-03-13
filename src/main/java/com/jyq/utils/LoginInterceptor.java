//package com.test.utils;
//
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class LoginInterceptor implements HandlerInterceptor {
//
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//
//        Object user = request.getSession().getAttribute("user");
//        if (user!=null){
//            return true;
//        }
//        //重定向到登录
//        response.sendRedirect(request.getContextPath()+"login.html");
//
//        return false;
//    }
//}
