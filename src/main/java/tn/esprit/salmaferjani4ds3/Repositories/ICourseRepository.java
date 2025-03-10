package tn.esprit.salmaferjani4ds3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.salmaferjani4ds3.entities.Course;

public interface ICourseRepository extends JpaRepository<Course,Long> {
}
