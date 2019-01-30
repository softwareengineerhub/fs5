package com.app.feed.persistent;

import com.app.feed.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    private List<Employee> validData = new ArrayList();
    private List<Employee> inValidData = new ArrayList();


    public void saveValidData(Employee employee) {
        validData.add(employee);
    }

    public void saveInValidData(Employee employee) {
        inValidData.add(employee);
    }

    public int invalidCount(){
        return inValidData.size();
    }
}
