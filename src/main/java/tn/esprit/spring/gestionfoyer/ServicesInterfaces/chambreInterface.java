package tn.esprit.spring.gestionfoyer.ServicesInterfaces;

import tn.esprit.spring.gestionfoyer.entities.Bloc;
import tn.esprit.spring.gestionfoyer.entities.Chambre;
import tn.esprit.spring.gestionfoyer.entities.TypeChambre;

import java.util.List;

public interface chambreInterface {
    List<Chambre> retrieveAllChambres();

    Chambre  addChambre(Chambre c);

    Chambre updateChambre (Chambre  c);

    Chambre retrieveChambre (long idChambre);

    Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) ;
   // List<Chambre> getChambresParBlocEtType (long idBloc, TypeChambre typeC) ;
}
