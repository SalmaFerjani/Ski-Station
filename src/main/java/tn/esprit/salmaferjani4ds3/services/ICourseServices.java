package tn.esprit.salmaferjani4ds3.services;

import tn.esprit.salmaferjani4ds3.entities.Course;

import java.util.List;

public interface ICourseServices {
    Course addCourse (Course course);
    Course updateCourse (Course course);
    Course retrieveCourse (Long numCourse);
    void removeCourse(Long numCourse);
    List<Course> retrieveAll ();

}
