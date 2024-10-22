package tn.esprit.spring.gestionfoyer.servicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyer.ServicesInterfaces.chambreInterface;
import tn.esprit.spring.gestionfoyer.entities.Bloc;
import tn.esprit.spring.gestionfoyer.entities.Chambre;
import tn.esprit.spring.gestionfoyer.entities.TypeChambre;
import tn.esprit.spring.gestionfoyer.repositories.blocRepository;
import tn.esprit.spring.gestionfoyer.repositories.chambreRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class chambreInterfaceImpl implements chambreInterface {
    chambreRepository chambreRepo;
    blocRepository blocRepo;
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

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {
        System.out.println("idbloc :" +idBloc);
        Bloc bloc =blocRepo.findById(idBloc).orElse(null);
        //System.out.println("bloc :" +bloc);
        for (Long num :numChambre ){
            Chambre chambre = chambreRepo.findByNumeroChambre(num);
            chambre.setBloc(bloc);
            //bloc.getChambres().add(chambre);
            chambreRepo.save(chambre);

        }
        blocRepo.save(bloc);
        //bloc.setChambres(numChambre);
        return bloc;
    }

   @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {
        List<Chambre> chambres = chambreRepo.findByBlocIdBlocAndBlocChambresTypC(idBloc, typeC);
        return chambres;
    }

    @Override
    public List<Chambre> getChambresParBlocEtTypeJpql(long idBloc, TypeChambre typeC) {
        return chambreRepo.getChambreByIdBlocAndTypeChambre(idBloc, typeC);
    }

    @Override
    public List<Chambre> getChambresParNomUniversite(String nomUniversite) {
        return chambreRepo.findByBlocFoyerUniversiteNomUniversiteLike(nomUniversite);
    }
}
