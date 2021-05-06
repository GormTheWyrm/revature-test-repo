package org.example;
public class Demo {
    public void sayHello(){
        System.out.println("Hello");
    }
    public static void main(String args[]){
        Demo demo = new Demo();
        demo.sayHello();
        int testInt = demo.returnOne();
    }
    public int returnOne(){
        return 1;
//        gives me something easy to test
    }
}


/*
this project is for studying how gradle project builds work.
I assume this is like Node...

https://docs.gradle.org/current/userguide/build_lifecycle.html


 */