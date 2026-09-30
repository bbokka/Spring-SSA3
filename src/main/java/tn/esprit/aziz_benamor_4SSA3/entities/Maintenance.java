package tn.esprit.aziz_benamor_4SSA3.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Maintenance {
    @ManyToOne
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMaintenance;
    LocalDate dateDebut;
    LocalDate dateFin;
    String description;
}
