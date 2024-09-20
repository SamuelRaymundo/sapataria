package org.samuelraymundo.sapataria.repositories;

import org.samuelraymundo.sapataria.entities.ProductPurchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPurchaseRepository extends JpaRepository<ProductPurchase, Long> {
}
