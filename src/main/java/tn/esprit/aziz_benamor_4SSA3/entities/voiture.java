package tn.esprit.aziz_benamor_4SSA3.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "car")
public class voiture {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public long id;
    @Enumerated(EnumType.STRING)
    public couleurs C ;
}
