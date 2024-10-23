package tn.esprit.spring.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.service.annotation.PatchExchange;
import tn.esprit.spring.gestionfoyer.entities.Bloc;
import tn.esprit.spring.gestionfoyer.entities.Chambre;
import tn.esprit.spring.gestionfoyer.entities.TypeChambre;

import java.util.List;

@Repository
public interface chambreRepository extends JpaRepository<Chambre,Long> {

    // with Keywords
    List<Chambre> findByBlocIdBlocAndBlocChambresTypC(long idBloc, TypeChambre typeC);

    // with JPQl
    @Query("select chambre from Chambre chambre where chambre.bloc.idBloc = :idBloc and chambre.typC = :typeC")
    List<Chambre> getChambreByIdBlocAndTypeChambre(@Param("idBloc") long idBloc, @Param("typeC")TypeChambre typeC);
    List<Chambre> findByBlocFoyerUniversiteNomUniversiteLike(String nomUniversite);
    Chambre findByNumeroChambre(long numeroChambre);
    Chambre findByReservationsEtudiantsCin(long cin);
}
