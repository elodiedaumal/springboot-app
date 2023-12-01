package Java.learnspringboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Java.learnspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
