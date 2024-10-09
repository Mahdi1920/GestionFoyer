package tn.esprit.spring.gestionfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyer.ServicesInterfaces.chambreInterface;
import tn.esprit.spring.gestionfoyer.entities.Chambre;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/chambre")
public class chambreController {
    chambreInterface chambreInterface;
    @GetMapping("/getChambres")
    public List<Chambre> retrieveAllChambres() {
        return chambreInterface.retrieveAllChambres();
    }
    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        return chambreInterface.addChambre(c);
    }
    @PutMapping("/putChambre")
    public Chambre updateChambre(@RequestBody Chambre c) {
        return chambreInterface.updateChambre(c);
    }
    @GetMapping("/getChambreById/{idChambre}")
    public Chambre retrieveChambre(@PathVariable long idChambre) {
        return chambreInterface.retrieveChambre(idChambre);
    }


}
