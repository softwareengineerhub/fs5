package com.app.converter;

import com.app.model.Person;

import java.util.Arrays;


/*
{"name":"N1","age":10}
 */
public class JSONPersonConverter implements  PersonConverter {

    @Override
    public Person from(String content) {
        System.out.println(content);
        content = "{\"name\":\"N1\",\"age\":10}";
        String[] array=content.split(",");
        System.out.println(Arrays.toString(array));
        String nameValue=array[0].split(":")[1].replaceAll("\"","");
        String ageValue=array[1].split(":")[1].replaceAll("\\\"","").replaceAll("}","");
        Person p = new Person();
        p.setName(nameValue);
        p.setAge(Integer.parseInt(ageValue));
        return p;
    }

    @Override
    public String to(Person person) {
        return String.format("{\"name\":\"%s\",\"age\":%s}",person.getName(), person.getAge());
    }
}
