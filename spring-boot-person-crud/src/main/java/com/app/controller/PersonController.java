package com.app.controller;

import com.app.model.Person;
import com.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller(value = "/person")
@ResponseBody
//@RestController(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.POST, consumes = {"application/json"})
    public void create(@RequestBody Person person){
        System.out.println("person="+person);
        personService.create(person);
    }

    @RequestMapping(value = "create",method = RequestMethod.POST, consumes = {"application/json"})
    public void create2(@RequestBody Person person){
        System.out.println("person="+person);
        personService.create(person);
    }

    @GetMapping(produces = {"application/json"})
    //@ResponseBody
    public Person read(@RequestParam(value = "id", required = true) int id){
        System.out.println("id="+id);
        return personService.get(id);
    }



}
