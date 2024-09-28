package tn.esprit.spring.gestionfoyer.entities;

import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Table
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum TypeChambre {
    SIMPLE,DOUBLE,TRIPLE
}
