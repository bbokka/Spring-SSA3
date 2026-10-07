package tn.esprit.aziz_benamor_4SSA3.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Maintenance {
    @ManyToOne
    private Vehicule vehicule;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;
    LocalDate dateDebut;
    LocalDate dateFin;
    String description;
}
