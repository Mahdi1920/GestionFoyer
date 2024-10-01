package tn.esprit.spring.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.gestionfoyer.entities.Foyer;

public interface foyerRepository extends JpaRepository<Foyer,Long> {
}
