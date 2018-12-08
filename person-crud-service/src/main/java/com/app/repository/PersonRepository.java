package com.app.repository;

import com.app.model.Person;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonRepository {

    private DataSource ds;

    public PersonRepository() {
        try {
            InitialContext ctx = new InitialContext();
            ds =  (DataSource) ctx.lookup("java:comp/env/personDS");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public void create(Person person){
        try(Connection c = ds.getConnection()){
            String sql = "INSERT INTO person(name, age)  VALUES(?,?)";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, person.getName());
            ps.setInt(2, person.getAge());
            ps.execute();
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }

    public Person get(int id){
        try(Connection c = ds.getConnection()){
            String sql = "SELECT * FROM person where ID=?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Person p = new Person();
            while(rs.next()){
                String name = rs.getString("name");
                int age = rs.getInt("age");
                p.setAge(age);
                p.setName(name);
            }
            return p;
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
