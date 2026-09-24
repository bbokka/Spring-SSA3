package tn.esprit.aziz_benamor_4SSA3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Client {
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
