package tn.esprit.spring.gestionfoyer.servicesImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyer.ServicesInterfaces.reservationInterface;
import tn.esprit.spring.gestionfoyer.entities.Reservation;
import tn.esprit.spring.gestionfoyer.repositories.reservationRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class reservationInterfaceImpl implements reservationInterface {
    reservationRepository reservationRepo;
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
}
