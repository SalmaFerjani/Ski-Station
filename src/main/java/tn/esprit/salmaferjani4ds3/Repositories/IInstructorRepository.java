package tn.esprit.salmaferjani4ds3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.salmaferjani4ds3.entities.Instructor;

public interface IInstructorRepository extends JpaRepository<Instructor,Long> {
}
