package tn.esprit.aziz_benamor_4SSA3.repositories;

import org.hibernate.boot.jaxb.mapping.spi.JaxbPersistentAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.aziz_benamor_4SSA3.entities.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> {

}
