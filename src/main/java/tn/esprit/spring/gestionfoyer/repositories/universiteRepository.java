package tn.esprit.spring.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyer.entities.TypeChambre;
import tn.esprit.spring.gestionfoyer.entities.Universite;

import java.util.List;

@Repository
public interface universiteRepository extends JpaRepository<Universite,Long> {
    List<Universite> findByFoyerBlocsChambresTypC(TypeChambre type);
    Universite findByNomUniversiteLike(String NomUniversite);
}
