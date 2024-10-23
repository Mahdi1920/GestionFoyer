package tn.esprit.spring.gestionfoyer.servicesImpl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyer.ServicesInterfaces.reservationInterface;
import tn.esprit.spring.gestionfoyer.entities.Bloc;
import tn.esprit.spring.gestionfoyer.entities.Chambre;
import tn.esprit.spring.gestionfoyer.entities.Etudiant;
import tn.esprit.spring.gestionfoyer.entities.Reservation;
import tn.esprit.spring.gestionfoyer.repositories.chambreRepository;
import tn.esprit.spring.gestionfoyer.repositories.etudiantRepository;
import tn.esprit.spring.gestionfoyer.repositories.reservationRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
@Builder
public class reservationInterfaceImpl implements reservationInterface {
    reservationRepository reservationRepo;
    chambreRepository chambreRepo;
    etudiantRepository etudiantRepo;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepo.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepo.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepo.findById(idReservation).orElse(null);
    }

    @Override
    public Reservation ajouterReservation(long idChambre, long cinEtudiant) {
        Etudiant etudiant = etudiantRepo.findByCin(cinEtudiant);
        Chambre chambre = chambreRepo.findById(idChambre).orElse(null);
        Bloc bloc = chambre.getBloc();
        String idReservation = chambre.getNumeroChambre()+bloc.getNomBloc()+LocalDate.now().getYear();
        Reservation reservation = Reservation.builder()
                .idReservation(idReservation)
                .etudiants(new ArrayList<>())
                .anneeUniversite(LocalDate.now())
                .estValide(true)
                .build();
        reservation.getEtudiants().add(etudiant);
        chambre.getReservations().add(reservation);
        //reservation.setEstValide(true);
        //reservation.setIdReservation(idReservation);
        return reservationRepo.save(reservation);
    }

    @Override
    public Reservation annulerReservation(long cinEtudiant) {
        Etudiant etudiant = etudiantRepo.findByCin(cinEtudiant);
        //Reservation reservation =reservationRepo.findAll();
        Reservation reservation = reservationRepo.findByEtudiantsCin(cinEtudiant);
        Chambre chambre = chambreRepo.findByReservationsEtudiantsCin(cinEtudiant);
        reservation.setEstValide(false);
        //List<Etudiant> etudiants = reservation.getEtudiants();
        reservation.getEtudiants().remove(etudiant);
        chambre.getReservations().remove(reservation);
        //System.out.println(reservation);
        return reservationRepo.save(reservation);
    }
}
