package tn.esprit.spring.gestionfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyer.ServicesInterfaces.reservationInterface;
import tn.esprit.spring.gestionfoyer.entities.Reservation;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/reservations")
public class reservationController {
    reservationInterface reservationInterface;
    @GetMapping("/getReservations")
    public List<Reservation> retrieveAllReservation() {
        return reservationInterface.retrieveAllReservation();
    }
    @PutMapping("/putReservation")
    public Reservation updateReservation(@RequestBody Reservation res) {
        return reservationInterface.updateReservation(res);
    }
    @GetMapping("/getReservationById/{idReservation}")
    public Reservation retrieveReservation(@PathVariable String idReservation) {
        return reservationInterface.retrieveReservation(idReservation);
    }
}
