package tn.esprit.spring.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyer.entities.Reservation;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface reservationRepository extends JpaRepository<Reservation,String> {
    Reservation findByEtudiantsCin(long cin);
}
