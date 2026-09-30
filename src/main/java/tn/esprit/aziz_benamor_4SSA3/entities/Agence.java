package tn.esprit.aziz_benamor_4SSA3.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Agence {
    @OneToMany(mappedBy = "Employe")
    Set<Employe>E;
    @OneToMany(mappedBy = "Vehicule")
    Set<Vehicule> V;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAgence;
    String nom;
    String ville;
    String adresse;
    String telephone;
}
