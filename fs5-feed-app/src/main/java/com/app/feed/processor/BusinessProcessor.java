package com.app.feed.processor;

import com.app.feed.model.Employee;
import com.app.feed.persistent.EmployeeRepository;
import com.app.feed.validation.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BusinessProcessor {
    @Autowired
    private ValidationService validationService;
    @Autowired
    private EmployeeRepository repository;

    public void process(Employee employee){
        Set set = validationService.validate(employee);
        if(set.isEmpty()){
            repository.saveValidData(employee);
        } else {
            repository.saveInValidData(employee);
        }
    }

}
