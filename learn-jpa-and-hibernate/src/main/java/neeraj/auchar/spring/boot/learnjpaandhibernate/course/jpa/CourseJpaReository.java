package neeraj.auchar.spring.boot.learnjpaandhibernate.course.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import neeraj.auchar.spring.boot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaReository {
    @PersistenceContext
    EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(long id){
       return entityManager.find(Course.class , id);
    }

    public void deleteById(long id){
        Course course = entityManager.find(Course.class , id);
         entityManager.remove(course);
    }
}
