package tn.esprit.aziz_benamor_4SSA3.repositories;

import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.aziz_benamor_4SSA3.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
