package tn.esprit.spring.gestionfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyer.ServicesInterfaces.chambreInterface;
import tn.esprit.spring.gestionfoyer.entities.Bloc;
import tn.esprit.spring.gestionfoyer.entities.Chambre;
import tn.esprit.spring.gestionfoyer.entities.TypeChambre;

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

    @PutMapping("/affecterChambresABloc/{idBloc}")
    public Bloc affecterChambresABloc(@RequestBody List<Long> numChambre, @PathVariable long idBloc) {
        return chambreInterface.affecterChambresABloc(numChambre, idBloc);
    }
    @GetMapping("/getChambresParBlocEtType/{idBloc}/{typeC}")
    public List<Chambre> getChambresParBlocEtType(@PathVariable long idBloc, @PathVariable TypeChambre typeC) {
        return chambreInterface.getChambresParBlocEtType(idBloc, typeC);
    }
    @GetMapping("/getChambresParBlocEtTypeJpql/{idBloc}/{typeC}")
    public List<Chambre> getChambresParBlocEtTypeJpql(@PathVariable long idBloc, @PathVariable TypeChambre typeC) {
        return chambreInterface.getChambresParBlocEtTypeJpql(idBloc, typeC);
    }

    @GetMapping("/getChambresParNomUniversite/{nomUniversite}")
    public List<Chambre> getChambresParNomUniversite(String nomUniversite) {
        return chambreInterface.getChambresParNomUniversite(nomUniversite);
    }

}
