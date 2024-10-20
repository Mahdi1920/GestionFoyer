package tn.esprit.spring.gestionfoyer.servicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyer.ServicesInterfaces.foyerInterface;
import tn.esprit.spring.gestionfoyer.entities.Bloc;
import tn.esprit.spring.gestionfoyer.entities.Foyer;
import tn.esprit.spring.gestionfoyer.entities.Universite;
import tn.esprit.spring.gestionfoyer.repositories.blocRepository;
import tn.esprit.spring.gestionfoyer.repositories.foyerRepository;
import tn.esprit.spring.gestionfoyer.repositories.universiteRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class foyerInterfaceImpl implements foyerInterface {
    foyerRepository foyerRepo;
    blocRepository blocRepo;
    universiteRepository universiteRepo;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepo.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepo.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepo.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepo.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepo.deleteById(idFoyer);
    }

    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        foyerRepo.save(foyer);
        for (Bloc bloc :foyer.getBlocs() ){
            bloc.setFoyer(foyer);
            blocRepo.save(bloc);
        }
        Universite universite = universiteRepo.findById(idUniversite).orElse(null);
        assert universite != null;
        universite.setFoyer(foyer);
        universiteRepo.save(universite);
        return foyer;
    }
}
