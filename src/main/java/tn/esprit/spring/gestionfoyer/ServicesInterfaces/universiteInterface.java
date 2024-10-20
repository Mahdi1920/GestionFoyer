package tn.esprit.spring.gestionfoyer.ServicesInterfaces;

import tn.esprit.spring.gestionfoyer.entities.TypeChambre;
import tn.esprit.spring.gestionfoyer.entities.Universite;

import java.util.List;

public interface universiteInterface {
    List<Universite> retrieveAllUniversities();

    Universite addUniversite (Universite u);

    Universite updateUniversite (Universite u);

    Universite retrieveUniversite (long idUniversite);

    List<Universite>getUnivByTypeChambre(TypeChambre type);

    Universite affecterFoyerAUniversite(long idFoyer ,String nomUniversite);
    //Universite desaffecterFoyerAUniversite (long idUniversite) ;
}
