package org.samuelraymundo.sapataria.repositories;

import org.samuelraymundo.sapataria.model.entities.ProductPurchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPurchaseRepository extends JpaRepository<ProductPurchase, Long> {
}
