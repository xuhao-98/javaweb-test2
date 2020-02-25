package com.stx.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决中文乱码
        response.setContentType("text/html");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        //cookie,服务器从客户端获取
        Cookie[] cookies = request.getCookies();
        //判断cookie是否存在
        if (cookies != null) {
            out.write("你上次访问的时间是：");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (cookie.getName().equals("lastLogin")) {
                    long lastLogin = Long.parseLong(cookie.getValue());
                    Date d = new Date(lastLogin);
                    out.write(d.toLocaleString());
                }
            }
        } else {
            out.print("这是你第一次访问！");
        }
        //服务器响应一个cookie
        Cookie cookie = new Cookie("lastLogin", System.currentTimeMillis() + "");
        response.addCookie(cookie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
