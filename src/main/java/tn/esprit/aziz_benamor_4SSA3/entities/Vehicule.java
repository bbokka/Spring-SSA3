package tn.esprit.aziz_benamor_4SSA3.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idVehicule;
    String immatriculation;
    String marque;
    BigDecimal tarifJournalier;
    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;
    @Enumerated(EnumType.STRING) private StatutVehicule statut;
}
