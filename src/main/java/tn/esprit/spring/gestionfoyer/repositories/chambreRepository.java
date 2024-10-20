package tn.esprit.spring.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyer.entities.Bloc;
import tn.esprit.spring.gestionfoyer.entities.Chambre;
import tn.esprit.spring.gestionfoyer.entities.TypeChambre;

import java.util.List;

@Repository
public interface chambreRepository extends JpaRepository<Chambre,Long> {
    //List<Chambre> findByBlocIdBlocAndChambreTypC(long idBloc, TypeChambre typeC);
}
