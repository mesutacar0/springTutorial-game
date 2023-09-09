package com.udemy.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
};

record Address(String streeString, String city) {
};

@Configuration
public class HelloWorldConfiuration {

    @Bean
    public String name() {
        return "Mesut2";
    }

    @Bean
    public int age() {
        return 27;
    }

    @Bean
    public Person person() {
        return new Person("Mesut", 39, new Address("Street 1", "Van"));
    }

    @Bean
    public Person person2() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Huzur Mah", "Istanbul");
    }

    @Bean(name = "address3")
    @Primary
    public Address address3() {
        return new Address("Huzur Mah", "Istanbul");
    }
}
