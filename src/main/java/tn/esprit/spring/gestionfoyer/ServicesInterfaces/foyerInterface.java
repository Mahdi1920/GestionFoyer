package tn.esprit.spring.gestionfoyer.ServicesInterfaces;

import tn.esprit.spring.gestionfoyer.entities.Foyer;

import java.util.List;

public interface foyerInterface {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer (Foyer f);

    Foyer updateFoyer (Foyer f);

    Foyer retrieveFoyer (long  idFoyer);

    void removeFoyer (long idFoyer);


}
