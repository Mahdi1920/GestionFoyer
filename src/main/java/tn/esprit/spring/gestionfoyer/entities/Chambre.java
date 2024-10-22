package tn.esprit.spring.gestionfoyer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idChambre ;
    long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typC;
    @OneToMany
    List<Reservation> reservations;
    @ManyToOne
    @JsonIgnore
    Bloc bloc ;
}
