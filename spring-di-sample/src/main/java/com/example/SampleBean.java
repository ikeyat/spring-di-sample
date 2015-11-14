package com.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by ikeya on 15/11/15.
 */
public class SampleBean implements InitializingBean, DisposableBean {

    public void initMethod() {
        System.out.println("init-method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("@PostConstruct");
    }


    public void destroyMethod() {
        System.out.println("destroy-method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy");
    }

    public void hoge() {
        // do nothing
    }

    public void fuga() {
        throw new RuntimeException();
    }
}
