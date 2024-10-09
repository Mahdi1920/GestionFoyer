package tn.esprit.spring.gestionfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyer.ServicesInterfaces.etudiantInterface;
import tn.esprit.spring.gestionfoyer.entities.Etudiant;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/etudiant")
public class etudiantController {
    etudiantInterface etudiantInterface;
    @GetMapping("/getEtudiants")
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantInterface.retrieveAllEtudiants();
    }
    @PostMapping("/addEtudiants")
    public List<Etudiant> addEtudiants(@RequestBody List<Etudiant> etudiants) {
        return etudiantInterface.addEtudiants(etudiants);
    }
    @PutMapping("/putEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        return etudiantInterface.updateEtudiant(e);
    }
    @GetMapping("/getEtudiantById/{idEtudiant}")
    public Etudiant retrieveEtudiant(@PathVariable long idEtudiant) {
        return etudiantInterface.retrieveEtudiant(idEtudiant);
    }
    @DeleteMapping("/deleteEtudiant/{idEtudiant}")
    public void removeEtudiant(@PathVariable long idEtudiant) {
        etudiantInterface.removeEtudiant(idEtudiant);
    }
}
