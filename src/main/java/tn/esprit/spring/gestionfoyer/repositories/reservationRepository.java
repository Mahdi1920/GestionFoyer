package tn.esprit.spring.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyer.entities.Reservation;
@Repository
public interface reservationRepository extends JpaRepository<Reservation,String> {
}
