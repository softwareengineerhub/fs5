package com.app.dao;

import com.app.model.Person;

import javax.annotation.Resource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements Dao {

    private DataSource dataSource;

    public DaoImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Person> findPersonsByNameAndAge(String name, int age) {
        try(Connection c = dataSource.getConnection()){
            String sql = "SELECT * FROM person WHERE name=? AND age=?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setObject(1, name);
            ps.setObject(2, age);
            ResultSet rs = ps.executeQuery();
            List<Person> list = new ArrayList<>();
            while(rs.next()){
                String pName = rs.getString("name");
                int pAge = rs.getInt("age");
                Person person = new Person();
                person.setName(pName);
                person.setAge(pAge);
                list.add(person);
            }
            return list;
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void save(Person person) {
        try(Connection c = dataSource.getConnection()){
            String sql = "INSERT INTO person(name,age) VALUES(?,?)";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setObject(1, person.getName());
            ps.setObject(2, person.getAge());
            ps.execute();
        }catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
