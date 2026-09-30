package tn.esprit.aziz_benamor_4SSA3.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
public class Client {
    @OneToMany(mappedBy = "Reservation")
    Set<Reservation> reservations;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClient;
    String nom ;
    String prenom;
    String email;
    String telephone;
    String numPermis;
    LocalDate dateInscription;
}
