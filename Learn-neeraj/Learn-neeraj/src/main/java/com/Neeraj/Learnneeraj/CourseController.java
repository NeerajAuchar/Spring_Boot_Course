package com.Neeraj.Learnneeraj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllcourses(){
        return Arrays.asList(
                new Course (1, "Lear AWS" , "Neeraj"),
                new Course(2, "Learn Java" , "Auchar")

        );

    }

}
