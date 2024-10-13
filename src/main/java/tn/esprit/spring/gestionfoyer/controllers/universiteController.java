package tn.esprit.spring.gestionfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyer.ServicesInterfaces.universiteInterface;
import tn.esprit.spring.gestionfoyer.entities.TypeChambre;
import tn.esprit.spring.gestionfoyer.entities.Universite;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/universite")
public class universiteController {
    universiteInterface universiteInterface;
    @GetMapping("/getUniversites")
    public List<Universite> retrieveAllUniversities() {
        return universiteInterface.retrieveAllUniversities();
    }
    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite u) {
        return universiteInterface.addUniversite(u);
    }
    @PutMapping ("/putUniversite")
    public Universite updateUniversite(@RequestBody Universite u) {
        return universiteInterface.updateUniversite(u);
    }
    @GetMapping("/getUniversitById/{idUniversite}")
    public Universite retrieveUniversite(@PathVariable long idUniversite) {
        return universiteInterface.retrieveUniversite(idUniversite);
    }
    @GetMapping("/getUniversiteByTypeChambre/{type}")
    public List<Universite> getUnivByTypeChambre(@PathVariable TypeChambre type) {
        return universiteInterface.getUnivByTypeChambre(type);
    }
    @PutMapping("/affecterFoyerUniversiter/{idFoyer}/{nomUniversite}")
    public Universite affecterFoyerAUniversite(@PathVariable long idFoyer, @PathVariable String nomUniversite) {
        return universiteInterface.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }
}
