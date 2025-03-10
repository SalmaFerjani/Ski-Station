package tn.esprit.salmaferjani4ds3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.salmaferjani4ds3.entities.Subscription;

public interface ISubscriptionRepository extends JpaRepository<Subscription,Long> {
}
