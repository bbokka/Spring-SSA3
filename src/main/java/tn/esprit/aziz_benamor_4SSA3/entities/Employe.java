package tn.esprit.aziz_benamor_4SSA3.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employe {
    @ManyToOne
    private Agence agence;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;
    String nom;
    String prenom;
    @Enumerated(EnumType.STRING) RoleEmploye role;
}
