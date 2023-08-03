package neeraj.auchar.spring.boot.learnjpaandhibernate.course.springdatajpa;

import neeraj.auchar.spring.boot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository <Course , Long> {
    List<Course> findByAuthor(String author);

}
