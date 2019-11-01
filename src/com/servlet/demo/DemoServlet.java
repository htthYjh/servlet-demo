package com.servlet.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 转发带数据给某个 jsp 页面
        // req.setAttribute("username", "guest");
        // req.getRequestDispatcher("/demo.jsp").forward(req, resp);

        // 通过重定向将数据带过去
        ServletContext sc = req.getServletContext();
        sc.setAttribute("goods", "电脑");
        resp.sendRedirect("/servlet_demo_war_exploded/demo.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
