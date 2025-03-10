package tn.esprit.salmaferjani4ds3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.salmaferjani4ds3.entities.Color;
import tn.esprit.salmaferjani4ds3.entities.Piste;

import java.util.List;

public interface IPisteRepository extends JpaRepository<Piste,Long> {

    List<Piste> findByColor(Color color);
    List<Piste> findByNamePisteAndColor(String name, Color color);
}
