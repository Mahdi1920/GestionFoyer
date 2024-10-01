package tn.esprit.spring.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.gestionfoyer.entities.Reservation;

public interface reservationRepository extends JpaRepository<Reservation,Long> {
}
