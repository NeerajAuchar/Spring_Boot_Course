package neeraj.auchar.spring.boot.learnjpaandhibernate.course;

import neeraj.auchar.spring.boot.learnjpaandhibernate.course.Course;
import neeraj.auchar.spring.boot.learnjpaandhibernate.course.jdbc.CourseRepository;
import neeraj.auchar.spring.boot.learnjpaandhibernate.course.jpa.CourseJpaReository;
import neeraj.auchar.spring.boot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

//    private CourseRepository repository;

//        @Autowired
//    private CourseJpaReository repository;
@Autowired
private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn Spring JPA " , "Auchar"));
        repository.save(new Course(2,"Learn VLSI JPA " , "SRK"));
        repository.save(new Course(3,"Learn JAVA JPA" , "SK"));

        repository.deleteById(2l);
        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("SK"));


    }
}
