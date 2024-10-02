package tn.esprit.spring.gestionfoyer.servicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyer.ServicesInterfaces.chambreInterface;
import tn.esprit.spring.gestionfoyer.entities.Chambre;
import tn.esprit.spring.gestionfoyer.repositories.chambreRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class chambreInterfaceImpl implements chambreInterface {
    chambreRepository chambreRepo;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepo.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepo.findById(idChambre).orElse(null);
    }
}
