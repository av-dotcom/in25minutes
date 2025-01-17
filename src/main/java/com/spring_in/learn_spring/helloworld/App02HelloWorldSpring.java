package com.spring_in.learn_spring.helloworld;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class App02HelloWorldSpring {
    public static void main (String[] args) {
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person5Qualifier"));

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
