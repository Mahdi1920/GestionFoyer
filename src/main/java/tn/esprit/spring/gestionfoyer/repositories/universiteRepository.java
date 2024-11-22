package tn.esprit.spring.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyer.entities.Reservation;
import tn.esprit.spring.gestionfoyer.entities.TypeChambre;
import tn.esprit.spring.gestionfoyer.entities.Universite;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface universiteRepository extends JpaRepository<Universite,Long> {
    List<Universite> findByFoyerBlocsChambresTypC(TypeChambre type);
    Universite findByNomUniversiteLike(String NomUniversite);
    List<Reservation> findByFoyerBlocsChambresReservationsAnneeUniversiteAndNomUniversite(LocalDate anneeUniversite,String NomUniversite);

}
