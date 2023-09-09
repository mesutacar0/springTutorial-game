package com.udemy.examples.e1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BeanScopeContextLanuncher {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BeanScopeContextLanuncher.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}