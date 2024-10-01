package tn.esprit.spring.gestionfoyer.ServicesInterfaces;

import tn.esprit.spring.gestionfoyer.entities.Bloc;

import java.util.List;

public interface blocInterface {
    List<Bloc> retrieveBlocs();

    Bloc updateBloc (Bloc  bloc);

    Bloc addBloc (Bloc bloc);

    Bloc retrieveBloc (long  idBloc);

    void removeBloc (long idBloc);

}
