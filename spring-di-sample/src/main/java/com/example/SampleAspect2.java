package com.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * Created by ikeya on 15/11/15.
 */
@Aspect
// @Order(0)
public class SampleAspect2 {

    @Pointcut("execution(* com.example.SampleBean.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before2() {
        System.out.println("before2");
    }

    @After("pointcut()")
    public void after2() {
        System.out.println("after2");
    }

    @AfterReturning("pointcut()")
    public void afterReturning2() {
        System.out.println("afterReturning2");
    }

    @AfterThrowing("pointcut()")
    public void afterThrowing2() {
        System.out.println("afterThrowing2");
    }

    @Around("pointcut()")
    public void around2(ProceedingJoinPoint jointPoint) throws Throwable {
        System.out.println("around2-before");
        jointPoint.proceed();
        System.out.println("around2-after");
    }
}
