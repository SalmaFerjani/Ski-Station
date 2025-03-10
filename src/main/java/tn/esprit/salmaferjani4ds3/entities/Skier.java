package tn.esprit.salmaferjani4ds3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numSkier;
    String firstname;
    String lastname;
    LocalDate dateOfBirth;
    String city;

    @OneToOne
    Subscription subscription;

    @OneToMany(mappedBy = "skier")
    Set<Registration> registrations;

    @ManyToMany(mappedBy = "skiers")
    Set<Piste> pistes;
}