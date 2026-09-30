package tn.esprit.aziz_benamor_4SSA3.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;


    // Vehicule 1 ---- * Reservation
    @ManyToOne
    private Vehicule vehicule;


    // Client 1 ---- * Reservation
    @ManyToOne
    private Client client;


    // Reservation 1 ---- 1 Contrat
    @OneToOne
    private Contrat contrat;
}