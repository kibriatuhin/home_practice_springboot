package com.example.home_practice_springboot;

import com.example.home_practice_springboot.model.Simple;
import com.example.home_practice_springboot.model.Student;
import com.example.home_practice_springboot.model.Student2;
import com.example.home_practice_springboot.model.ThreadScopeTestBean;
import com.example.home_practice_springboot.service.CommandExecutorService;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.Arrays;

@SpringBootApplication
public class HomePracticeSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomePracticeSpringBootApplication.class,args);
        System.exit(0);
      /*  ApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");
        System.out.println(context.getBeanDefinitionCount());
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
       // System.out.println(context.getBean(Student.class));*/

    }

}


/**/
/*
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.example.home_practice_springboot.model","com.example.home_practice_springboot.scope");


        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        context.refresh();
        Object ob = context.getBean("simple");
        System.out.println(ob);*/

/*ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);*/

/*ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        Simple simple = context.getBean(Simple.class);
        System.out.println(simple);

        //PropertyPlaceholderConfigurer
       // PropertySourcesPlaceholderConfigurer*/
/*ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        Student2 student2 = context.getBean("student",Student2.class);
        System.out.println(student2.getAddress());
        Student2 student3 = context.getBean("student",Student2.class);
        System.out.println(student3.getAddress());*/
/*  //SpringApplication.run(HomePracticeSpringBootApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(context.getBeanDefinitionCount());

        Student student = context.getBean("student1", Student.class);
        System.out.println(student);
        //Student student1 =   context.getBean("student1",Student.class);

        //System.out.println(student1);

        // ((ClassPathXmlApplicationContext)context).registerShutdownHook();
*/