package tn.esprit.spring.gestionfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.gestionfoyer.ServicesInterfaces.foyerInterface;
import tn.esprit.spring.gestionfoyer.entities.Foyer;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/foyer")
public class foyerController {
    foyerInterface foyerInterface;
    @GetMapping("/getAllFoyer")
    public List<Foyer> retrieveAllFoyers() {
        return foyerInterface.retrieveAllFoyers();
    }
    @PostMapping("/addFoyer")
    public Foyer addFoyer(Foyer f) {
        return foyerInterface.addFoyer(f);
    }

    public Foyer updateFoyer(Foyer f) {
        return foyerInterface.updateFoyer(f);
    }

    public Foyer retrieveFoyer(long idFoyer) {
        return foyerInterface.retrieveFoyer(idFoyer);
    }

    public void removeFoyer(long idFoyer) {
        foyerInterface.removeFoyer(idFoyer);
    }


}
