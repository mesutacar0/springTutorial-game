package com.udemy.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiuration.class)) {

            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address2"));
            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean("person2"));
            System.out.println(context.getBean("person3"));

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}
