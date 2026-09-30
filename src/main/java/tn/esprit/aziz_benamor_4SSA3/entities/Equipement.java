package tn.esprit.aziz_benamor_4SSA3.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Equipement {
    @ManyToMany(mappedBy = "Vehicule")
    Set<Vehicule> vehicules;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipement;
    String libelle;

}
