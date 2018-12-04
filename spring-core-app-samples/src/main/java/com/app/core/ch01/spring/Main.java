package com.app.core.ch01.spring;

import com.app.core.ch01.nospring.MyDefultRepositoryImpl;
import com.app.core.ch01.nospring.MyRepository;
import com.app.core.ch01.nospring.PersonDefaultServiceImpl;
import com.app.core.ch01.nospring.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //PersonService service= (PersonService) ctx.getBean("");

        String[] names=ctx.getBeanDefinitionNames();
        for(String s: names){
            System.out.println(s);
        }
        System.out.println("-----------------------");

        MyRepository myRepository = (MyRepository) ctx.getBean("myRepository");
        MyRepository myRepository1 = (MyRepository) ctx.getBean("myRepository");
        MyRepository myRepository2 = (MyRepository) ctx.getBean("myRepository");
        System.out.println(myRepository);
        System.out.println(myRepository1);
        System.out.println(myRepository2);

        MyRepository myRepository3 = new MyDefultRepositoryImpl();
        System.out.println(myRepository3);
        System.out.println("------------------");
        PersonDefaultServiceImpl service3 = (PersonDefaultServiceImpl) ctx.getBean("myService3");
        PersonService service4 = (PersonService) ctx.getBean("myService4");
    }

}
