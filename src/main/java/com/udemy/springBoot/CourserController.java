package com.udemy.springBoot;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

record Course(int id, String name, String author) {
}

@RestController
public class CourserController {

    @GetMapping("/course")
    public List<Course> getCourses() {

        var courses = List.of(new Course(1, "Spring Boot", "Cahit Sitki Taranci"),
                new Course(2, "Spring Data", "Ahmet Hamdi Tanpinar"));
        return courses;
    }
}
