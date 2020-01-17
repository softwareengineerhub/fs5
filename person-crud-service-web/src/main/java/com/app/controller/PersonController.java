package com.app.controller;


import com.app.dao.Dao;
import com.app.dao.DaoImpl;
import com.app.model.Person;

import javax.annotation.Resource;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "personController", urlPatterns = {"/person"})
public class PersonController extends HttpServlet {
    @Resource(name="myPersonDataSource")
    private DataSource dataSource;
    private Dao dao;
    public void init(){
        dao = new DaoImpl(dataSource);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        try {
            String name = req.getParameter("name");
            int age = Integer.parseInt(req.getParameter("age"));
            List<Person> list = dao.findPersonsByNameAndAge(name, age);
            resp.getWriter().println(list);
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        dao.save(person);
    }

}
