package tn.esprit.spring.gestionfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyer.ServicesInterfaces.foyerInterface;
import tn.esprit.spring.gestionfoyer.entities.Foyer;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/foyer")
public class foyerController {
    foyerInterface foyerInterface;
    @GetMapping("/getFoyers")
    public List<Foyer> retrieveAllFoyers() {
        return foyerInterface.retrieveAllFoyers();
    }
    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return foyerInterface.addFoyer(f);
    }
    @PutMapping("/putFoyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        return foyerInterface.updateFoyer(f);
    }
    @GetMapping("/GetFoyerById/{idFoyer}")
    public Foyer retrieveFoyer(@PathVariable long idFoyer) {
        return foyerInterface.retrieveFoyer(idFoyer);
    }
    @DeleteMapping("/DeleteFoyer/{idFoyer}")
    public void removeFoyer(@PathVariable long idFoyer) {
        foyerInterface.removeFoyer(idFoyer);
    }
    @PostMapping("/addFoyerAffecterUniversite/{idUniversite}")
    public Foyer ajouterFoyerEtAffecterAUniversite(@RequestBody Foyer foyer, @PathVariable long idUniversite) {
        return foyerInterface.ajouterFoyerEtAffecterAUniversite(foyer, idUniversite);
    }
}
