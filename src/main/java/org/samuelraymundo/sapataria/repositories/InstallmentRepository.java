package org.samuelraymundo.sapataria.repositories;

import org.samuelraymundo.sapataria.model.entities.Installment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstallmentRepository extends JpaRepository<Installment, Long> {
}
