package tn.esprit.spring.gestionfoyer.ServicesInterfaces;

import tn.esprit.spring.gestionfoyer.entities.Etudiant;

import java.util.List;

public interface etudiantInterface {
    List<Etudiant> retrieveAllEtudiants();
    List<Etudiant> addEtudiants (List<Etudiant> etudiants);
    Etudiant updateEtudiant (Etudiant e);
    Etudiant retrieveEtudiant(long idEtudiant);

    void removeEtudiant(long idEtudiant);

}
