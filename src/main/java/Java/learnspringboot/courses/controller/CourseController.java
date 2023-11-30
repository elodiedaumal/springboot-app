package Java.learnspringboot.courses.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Java.learnspringboot.courses.controller.bean.Course;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

     @GetMapping("/courses")
     public List<Course> getAllCourses() {
          return Arrays.asList(new Course(1, "Learn Microservices", "Elodie"));
     }
}