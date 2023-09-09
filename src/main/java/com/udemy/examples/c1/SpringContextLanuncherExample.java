package com.udemy.examples.c1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringContextLanuncherExample {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(SpringContextLanuncherExample.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("-------------------");
            System.out.println(context.getBean(CalculationService.class).findMax());

        } catch (BeansException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}