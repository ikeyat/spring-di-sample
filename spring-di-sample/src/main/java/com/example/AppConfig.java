package com.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Hello world!
 */
@EnableAspectJAutoProxy
@Configuration
public class AppConfig {
    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public SampleBean hoge() {
        return new SampleBean();
    }

    @Bean
    public SampleAspect1 sampleAspect1() {
        return new SampleAspect1();
    }

    @Bean
    public SampleAspect2 sampleAspect2() {
        return new SampleAspect2();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SampleBean hoge = context.getBean(SampleBean.class);

        System.out.println("-----------------");
        hoge.hoge();

        System.out.println("-----------------");
        try {
            hoge.fuga();
        } catch (Exception e) {
            // ignore
        }
        System.out.println("-----------------");

        context.close();
    }
}
