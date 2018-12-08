package com.app.controller;

import com.app.converter.JSONPersonConverter;
import com.app.converter.PersonConverter;
import com.app.model.Person;
import com.app.service.PersonService;
import com.app.service.PersonServiceDefulatImpl;
import com.app.service.PersonServiceRelationalImpl;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "PersonController", urlPatterns = {"/person"})
public class PersonController extends HttpServlet {

    private PersonService personService;
    private PersonConverter personConverter;

    //@Resource(name = "personDS")
    //private DataSource ds;

    public void init(){

        //personService = new PersonServiceDefulatImpl();
        personService = new PersonServiceRelationalImpl();
        personConverter = new JSONPersonConverter();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        int id=Integer.parseInt(req.getParameter("id"));
        Person person = personService.get(id);
        String content = personConverter.to(person);
        PrintWriter writer = resp.getWriter();
        writer.write(content);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(InputStream in = req.getInputStream();){
            byte[] data = new byte[in.available()];
            in.read(data);
            String content = new String(data);
            Person p = personConverter.from(content);
            personService.create(p);
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        Person oldPerson = personService.delete(id);
        String content = personConverter.to(oldPerson);
        resp.getWriter().write(content);
    }
}
