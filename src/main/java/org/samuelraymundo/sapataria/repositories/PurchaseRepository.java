package org.samuelraymundo.sapataria.repositories;

import org.samuelraymundo.sapataria.model.entities.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
