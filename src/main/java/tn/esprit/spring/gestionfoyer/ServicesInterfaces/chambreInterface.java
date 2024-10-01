package tn.esprit.spring.gestionfoyer.ServicesInterfaces;

import tn.esprit.spring.gestionfoyer.entities.Chambre;

import java.util.List;

public interface chambreInterface {
    List<Chambre> retrieveAllChambres();

    Chambre  addChambre(Chambre c);

    Chambre updateChambre (Chambre  c);

    Chambre retrieveChambre (long idChambre);

}
