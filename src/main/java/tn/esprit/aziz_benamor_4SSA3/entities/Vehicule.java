package tn.esprit.aziz_benamor_4SSA3.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;
    private String marque;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;


    @ManyToOne
    private Agence agence;


    @OneToMany(mappedBy = "vehicule")
    private Set<Maintenance> maintenances;


    @ManyToMany
    private Set<Equipement> equipements;



    @OneToMany(mappedBy = "vehicule")
    private Set<Reservation> reservations;
}