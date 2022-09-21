package com.example.home_practice_springboot;

import com.example.home_practice_springboot.model.Student;
import com.example.home_practice_springboot.model.Student2;
import com.example.home_practice_springboot.model.ThreadScopeTestBean;
import com.example.home_practice_springboot.service.CommandExecutorService;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HomePracticeSpringBootApplication {

    public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");

        ThreadScopeTestBean testBean = context.getBean("threadScopeTestBean",ThreadScopeTestBean.class);

        System.out.println("object 1 : " + Thread.currentThread().getName() + " :: "+ testBean);

        new Thread(()-> {
                ThreadScopeTestBean testBean1 =context.getBean("threadScopeTestBean",ThreadScopeTestBean.class);

                System.out.println("Object 2 :: " +Thread.currentThread().getName()+ " :: " + testBean1);

        }).start();



    }

}
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