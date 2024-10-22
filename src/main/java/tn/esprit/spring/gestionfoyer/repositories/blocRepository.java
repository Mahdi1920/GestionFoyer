package tn.esprit.spring.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyer.entities.Bloc;

import java.util.List;

@Repository
public interface blocRepository extends JpaRepository<Bloc,Long> {
    //List<Bloc> findByFoyerUniversiteNomUniversite(String nom);
}
