package tn.esprit.spring.gestionfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {
    @Id
    @Setter(AccessLevel.NONE)
    String idReservation;
    Date anneeUniversite;
    long capaciteBloc;
    @ManyToMany
    List<Etudiant> etudiants;

}
