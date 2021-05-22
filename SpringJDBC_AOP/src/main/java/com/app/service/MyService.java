package com.app.service;
public class MyService {

    public void validate1(){
        System.out.println("Hello from validate1() from MyService");
    }

    public void validate2(){
        System.out.println("Hello from validate2() from MyService");
    }

    public void validate3(){
        System.out.println("Hello from validate3() from MyService");
    }

    public  void testAround(){
        System.out.println("Hello from testAround() method of MyService");
    }

    public  void exceptionAdviceTest(int val) throws Exception{
        if(val <18){
            throw new ArithmeticException("Value should be greater than 18");
        }else{
            System.out.println("Value looks good from exceptionAdviceTest()");
        }
    }

    public String returnHello(){
        return "Hello from returnHello() method of MyService";
    }
    public String returnHelloAgain(){
        return "Hello hello from returnHelloAgain() method of MyService";
    }

    public MyService(){}
}
