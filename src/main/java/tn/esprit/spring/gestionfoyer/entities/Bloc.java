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
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idBloc;
    String nomBloc;
    long capaciteBloc;
    @ManyToOne
    @JsonIgnore
    Foyer foyer;
    @OneToMany(mappedBy = "bloc")
    List<Chambre>chambres;
}
