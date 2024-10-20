package tn.esprit.spring.gestionfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyer.ServicesInterfaces.blocInterface;
import tn.esprit.spring.gestionfoyer.entities.Bloc;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/bloc")
public class blocController {
    blocInterface blocInterface;
    @GetMapping("/GetBlocs")
    public List<Bloc> retrieveBlocs() {
        return blocInterface.retrieveBlocs();
    }
    @PutMapping("/putBloc")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocInterface.updateBloc(bloc);
    }
    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocInterface.addBloc(bloc);
    }
    @GetMapping("/getBlocById/{idBloc}")
    public Bloc retrieveBloc(@PathVariable long idBloc) {
        return blocInterface.retrieveBloc(idBloc);
    }
    @DeleteMapping("/deleteBloc/{idBloc}")
    public void removeBloc(@PathVariable long idBloc) {
        blocInterface.removeBloc(idBloc);
    }

    @GetMapping("/getBlocByNomUniversite/{nom}")
    public List<Bloc> getBlocByNomUniv(@PathVariable String nom) {
        return blocInterface.getBlocByNomUniv(nom);
    }
}
