package org.samuelraymundo.sapataria.repositories;

import org.samuelraymundo.sapataria.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
