package com.udemy.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.udemy.game")
public class App04GamingSpringComponent {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App04GamingSpringComponent.class)) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        } catch (BeansException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}