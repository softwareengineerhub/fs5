package com.app.dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CheckerServlet", urlPatterns = {"/checker"})
public class CheckerServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("CheckerServlet.service().start");
        RequestDispatcher dispatcher =
                getServletContext().getNamedDispatcher("ServletA");
        dispatcher.include(req, resp);
        resp.getWriter().write("CheckerServlet");
        System.out.println("CheckerServlet.service().finish");
    }
}
