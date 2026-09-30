package tn.esprit.aziz_benamor_4SSA3.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private LocalDate dateSignature;

    private BigDecimal montantTotal;

    private Boolean valide;

    @OneToOne(mappedBy = "contrat")
    private Reservation reservation;
}