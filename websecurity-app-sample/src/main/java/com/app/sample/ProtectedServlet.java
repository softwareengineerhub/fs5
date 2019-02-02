package com.app.sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProtectedServlet", urlPatterns = {"/ProtectedServlet"})
public class ProtectedServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user=req.getRemoteUser();
        String ahref = "<a href='/LogoutServlet'>Logout</a>";
        resp.getWriter().write("Hello,"+user+"! Your are inside ProtectedServlet;   "+ahref);

    }
}
