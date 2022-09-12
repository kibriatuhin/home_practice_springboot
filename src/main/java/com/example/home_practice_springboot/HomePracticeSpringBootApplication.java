package com.example.home_practice_springboot;

import com.example.home_practice_springboot.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HomePracticeSpringBootApplication {

    public static void main(String[] args) {
        //SpringApplication.run(HomePracticeSpringBootApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(context.getBeanDefinitionCount());

        Student student = context.getBean("student1", Student.class);
        System.out.println(student);
        //Student student1 =   context.getBean("student1",Student.class);

        //System.out.println(student1);

        // ((ClassPathXmlApplicationContext)context).registerShutdownHook();




    }

}
