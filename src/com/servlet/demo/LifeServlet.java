package com.servlet.demo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LifeServlet")
public class LifeServlet extends HttpServlet {

    @Override
    public void init (ServletConfig config) throws ServletException {
        System.out.println("Servlet init 方法调用");
    }

    @Override
    public void service (HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        System.out.println("Servlet service 方法调用");
    }

    @Override
    public void destroy () {
        System.out.println("Servlet destroy 方法调用");
    }
}
