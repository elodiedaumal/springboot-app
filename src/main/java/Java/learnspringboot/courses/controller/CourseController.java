package Java.learnspringboot.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Java.learnspringboot.courses.bean.Course;
import Java.learnspringboot.courses.repository.CourseRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

     @GetMapping("/courses/{id}")
     public Course getCourseDetails(@PathVariable long id) {

          Optional<Course> course = repository.findById(id);

          if (course.isEmpty()) {
               throw new RuntimeException("No course with id: " + id);
          }
          return course.get();
     }

     @PostMapping("/courses")
     public void createCourse(@RequestBody Course course) {
          repository.save(course);
     }

     @PutMapping("/courses/{id}")
     public void updateCourse(@PathVariable long id, @RequestBody Course course) {
          repository.save(course);
     }

     @DeleteMapping("/courses/{id}")
     public void deleteCourse(@PathVariable long id) {
          repository.deleteById(id);
     }

};