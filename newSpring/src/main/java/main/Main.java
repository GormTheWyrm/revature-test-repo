package main;

import models.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("mybeans.xml");
        Employee carla = (Employee) context.getBean("carla");
        Employee bob = (Employee) context.getBean("bob");
        System.out.println(bob);

    }
}
