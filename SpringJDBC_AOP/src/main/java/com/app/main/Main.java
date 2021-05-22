package com.app.main;

import com.app.service.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("aopbeans.xml");
        MyService myService=(MyService) context.getBean("service");

        myService.validate1();

        myService.validate2();


        myService.validate3();


        myService.testAround();

        try {
            myService.exceptionAdviceTest(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        myService.returnHello();
        myService.returnHelloAgain();
    }
}
