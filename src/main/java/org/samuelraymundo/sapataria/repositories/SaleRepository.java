package org.samuelraymundo.sapataria.repositories;

import org.samuelraymundo.sapataria.model.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
