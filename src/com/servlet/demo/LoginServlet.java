package com.servlet.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // 获取提交过来的数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
//        PrintWriter out = res.getWriter();
//        out.append("username: " + username + "   password: " + password);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        // 如果 username == admin password == 123 就跳转到 success 页面，否则跳转到 error 页面
        // 1. 通过转发实现跳转
        if ("admin".equals(username) && "123".equals(password)) {
            req.getRequestDispatcher("/success.jsp").forward(req, res);
        } else {
//             req.getRequestDispatcher("/fail.jsp").forward(req, res);
            // 失败的话使用重定向进行跳转
            res.sendRedirect("/servlet_demo_war_exploded/fail.jsp");
        }

        // 转发和重定向的区别
        // 1. 实现转发调用的 request.getRequestDispatcher 方法，而重定向调用的 response.sendRedirect 方法
        // 2. 转发时，浏览器的地址栏不会发生改变，但是重定向的时候 url 会发生改变
        // 3. 转发的话，浏览器只会请求一次服务，而重定向浏览器会请求两次
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}