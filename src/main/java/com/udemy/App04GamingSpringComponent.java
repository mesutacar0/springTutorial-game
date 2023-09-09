package com.udemy;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.udemy.game.GameRunner;
import com.udemy.game.GamingConsole;

@Configuration
@ComponentScan("com.udemy.game")
public class App04GamingSpringBeans {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App04GamingSpringBeans.class)) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        } catch (BeansException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}