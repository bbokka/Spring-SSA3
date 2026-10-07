package tn.esprit.aziz_benamor_4SSA3.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Agence {

    @OneToMany(mappedBy = "agence")
    private Set<Employe> employes;
    @OneToMany(mappedBy = "agence")
    private Set<Vehicule> vehicules;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    private String nom;
    private String ville;
    private String adresse;
    private String telephone;
}
