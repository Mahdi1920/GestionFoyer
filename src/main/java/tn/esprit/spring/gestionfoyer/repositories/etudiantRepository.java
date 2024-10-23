package tn.esprit.spring.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyer.entities.Bloc;
import tn.esprit.spring.gestionfoyer.entities.Etudiant;

@Repository
public interface etudiantRepository extends JpaRepository<Etudiant,Long> {
    Etudiant findByCin(long cin);
}
