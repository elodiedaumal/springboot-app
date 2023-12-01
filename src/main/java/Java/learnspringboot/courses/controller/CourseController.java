package Java.learnspringboot.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Java.learnspringboot.courses.bean.Course;
import Java.learnspringboot.courses.repository.CourseRepository;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

     @Autowired
     private CourseRepository repository;

     @GetMapping("/courses")
     public List<Course> getAllCourses() {
          // return Arrays.asList(
          // new Course(1, "Learn Microservices", "Elodie"),
          // new Course(2, "Learn REST API", "Elodie"),
          // new Course(3, "Learn to code", "Elodie"),
          // new Course(4, "Learn everything", "Elodie"));

          return repository.findAll();
     }

     @GetMapping("/courses/1")
     public Course getSomeCourse() {
          return new Course(1, "Learn Microservices", "Elodie");
     }

};