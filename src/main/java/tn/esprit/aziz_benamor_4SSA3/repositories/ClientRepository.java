package tn.esprit.aziz_benamor_4SSA3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.aziz_benamor_4SSA3.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
