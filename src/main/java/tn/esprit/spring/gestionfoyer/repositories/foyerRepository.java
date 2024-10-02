package tn.esprit.spring.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyer.entities.Foyer;
@Repository
public interface foyerRepository extends JpaRepository<Foyer,Long> {
}
