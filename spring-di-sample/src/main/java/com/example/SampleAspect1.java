package com.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * Created by ikeya on 15/11/15.
 */
@Aspect
// @Order(1)
public class SampleAspect1 {

    @Pointcut("execution(* com.example.SampleBean.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before1() {
        System.out.println("before1");
    }

    @After("pointcut()")
    public void after1() {
        System.out.println("after1");
    }

    @AfterReturning("pointcut()")
    public void afterReturning1() {
        System.out.println("afterReturning1");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing1() {
        System.out.println("afterThrowing1");
    }

    @Around("pointcut()")
    public void around1(ProceedingJoinPoint jointPoint) throws Throwable {
        System.out.println("around1-before");
        jointPoint.proceed();
        System.out.println("around1-after");
    }
}
