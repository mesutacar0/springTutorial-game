package com.udemy.examples.d1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
}

@Component
@Lazy
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Initializing ClassB");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Something happened");
    }
}

@Configuration
@ComponentScan
public class LazyInitSpringContextLanuncher {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LazyInitSpringContextLanuncher.class)) {

            // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println("Context init completed");

            context.getBean(ClassB.class).doSomething();

        } catch (BeansException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}