package tn.esprit.salmaferjani4ds3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.salmaferjani4ds3.entities.Course;
import tn.esprit.salmaferjani4ds3.services.ICourseServices;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("course")
public class CourseController {

    private ICourseServices courseServices;

    @GetMapping("all")
    public List<Course> retrieveAll(){
        return courseServices.retrieveAll();
    }
    @PostMapping("add")
    public Course addCourse(@RequestBody Course course){
        return courseServices.addCourse(course);
    }
    @PutMapping("update")
    public Course updateCourse(@RequestBody Course course){
        return courseServices.updateCourse(course);
    }
    @GetMapping("get/{numCourse}")
    public Course retrieveCourse(@PathVariable Long numCourse){
        return courseServices.retrieveCourse(numCourse);
    }
    @DeleteMapping("delete/{numCourse}")
    public void removeCourse(@PathVariable Long numCourse){
        courseServices.removeCourse(numCourse);
    }


}
