package com.stx.controller;

import com.stx.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决乱码问题
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //得到session
        HttpSession session = request.getSession();
        //存入东西
        session.setAttribute("name",new Student("许昊",1));
        //获取sessionID
        String sessionId=session.getId();
        //判断session是不是新建
        if (session.isNew()){
            response.getWriter().write("session创建成功，ID是"+sessionId);
        }else {
            response.getWriter().write("session已经在服务器中创建，ID是"+sessionId);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}
