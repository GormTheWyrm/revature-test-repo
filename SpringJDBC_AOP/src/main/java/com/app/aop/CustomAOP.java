package com.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class CustomAOP {

    @Pointcut("execution(* com.app.service.MyService.v*(..))")
    public void myService(){}

    @Pointcut("execution(* com.app.service.MyService.t*(..))")
    public void myServiceAround(){}

    @Pointcut("execution(* com.app.service.MyService.e*(..))")
    public void myServiceException(){}

    @Pointcut("execution(* com.app.service.MyService.r*(..))")
    public void myServiceReturn(){}


    @After("myService()")
    public void afterAdvice(JoinPoint jp){
        System.out.println("After the execution of the method : "+jp.getSignature());
    }

    @Before("myService()")
    public void beforeAdvice(JoinPoint jp){
        System.out.println("Before the execution of the method : "+jp.getSignature());
    }


    @Around("myServiceAround()")
    public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Before calling the actual method -> "+pjp.getSignature());
        pjp.proceed(); //actual method will be executed
        System.out.println("After execution of the actual method which is -> "+pjp.getSignature());
    }

    @AfterThrowing(value = "myServiceException()", throwing = "t")
    public void throwingAdvice(JoinPoint jp, Exception t){
        System.out.println("Executing throwingAdvice() now");
        System.out.println("Method signature where the exception occured : "+jp.getSignature());
        System.out.println("Exception is "+t);
    }

    @AfterReturning(value = "myServiceReturn()", returning = "res")
    public void afterReturnAdvice(JoinPoint jp, String res){
        System.out.println("Method called in afterReturnAdvice is "+jp.getSignature());
        System.out.println("Result returned by the above  method is "+res);
    }
}
