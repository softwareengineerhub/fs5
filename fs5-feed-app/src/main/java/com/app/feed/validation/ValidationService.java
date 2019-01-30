package com.app.feed.validation;

import com.app.feed.model.Employee;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Service
public class ValidationService {

    private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    public Set<ConstraintViolation<Employee>> validate(Employee employee){
        Validator validator = factory.getValidator();
        return validator.validate(employee);
    }
}
