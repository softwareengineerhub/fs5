package com.app.controller;


import com.app.dao.Dao;
import com.app.dao.DaoImpl;
import com.app.dao.DaoImpl2;

import javax.annotation.Resource;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet(name = "personController", urlPatterns = {"/person"})
public class PersonController2 extends HttpServlet {
    private Dao dao = new DaoImpl2();

    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        dao.findPersonsByNameAndAge(name, age);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp){

    }

}
