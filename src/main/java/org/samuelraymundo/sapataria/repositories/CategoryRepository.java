package org.samuelraymundo.sapataria.repositories;

import org.samuelraymundo.sapataria.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
