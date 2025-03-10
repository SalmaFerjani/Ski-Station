package tn.esprit.salmaferjani4ds3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.salmaferjani4ds3.entities.Registration;

public interface IRegistrationRepository extends JpaRepository<Registration,Long> {
}
