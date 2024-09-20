package org.samuelraymundo.sapataria.repositories;

import org.samuelraymundo.sapataria.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
