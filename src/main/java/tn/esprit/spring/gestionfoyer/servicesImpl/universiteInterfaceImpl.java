package tn.esprit.spring.gestionfoyer.servicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyer.ServicesInterfaces.universiteInterface;
import tn.esprit.spring.gestionfoyer.entities.Foyer;
import tn.esprit.spring.gestionfoyer.entities.TypeChambre;
import tn.esprit.spring.gestionfoyer.entities.Universite;
import tn.esprit.spring.gestionfoyer.repositories.foyerRepository;
import tn.esprit.spring.gestionfoyer.repositories.universiteRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class universiteInterfaceImpl implements universiteInterface {
    universiteRepository universiteRepo;
    foyerRepository foyerRepository;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return universiteRepo.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return universiteRepo.findById(idUniversite).orElse(null);
    }

    @Override
    public List<Universite> getUnivByTypeChambre(TypeChambre type) {
        return universiteRepo.findByFoyerBlocsChambresTypC(type);
    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Foyer foyer =foyerRepository.findById(idFoyer).orElse(null);
        Universite universite =universiteRepo.findByNomUniversiteLike(nomUniversite);
        universite.setFoyer(foyer);
        universiteRepo.save(universite);
        return universite;
    }
}
