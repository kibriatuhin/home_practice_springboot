package com.example.home_practice_springboot;

import com.example.home_practice_springboot.model2.Studentt;
import com.example.home_practice_springboot.model2.ThreadScopeTestbean;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.Arrays;

@SpringBootApplication
public class HomePracticeSpringBootApplication {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans6.xml");

        Studentt ob = context.getBean(Studentt.class);
        System.out.println(ob);
        //PropertySourcesPlaceholderConfigurer





    }

}
  /*String[] names = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(names));

        Studentt student = context.getBean("studentt",Studentt.class);
        System.out.println(student);
        Studentt student1 = context.getBean("studentt",Studentt.class);
        System.out.println(student1);*/

    /*    ThreadScopeTestbean testbean = context.getBean(ThreadScopeTestbean.class);
        System.out.println(testbean);
        ThreadScopeTestbean testbean1 = context.getBean(ThreadScopeTestbean.class);
        System.out.println(testbean1);*/


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