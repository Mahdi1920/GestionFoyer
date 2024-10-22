package tn.esprit.spring.gestionfoyer.ServicesInterfaces;

import tn.esprit.spring.gestionfoyer.entities.Reservation;

import java.util.List;

public interface reservationInterface {
    List<Reservation> retrieveAllReservation();

    Reservation updateReservation (Reservation  res);

    Reservation retrieveReservation (String idReservation);

    public Reservation ajouterReservation (long idChambre, long cinEtudiant) ;

}
