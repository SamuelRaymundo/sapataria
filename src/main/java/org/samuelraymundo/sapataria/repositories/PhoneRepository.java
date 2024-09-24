package org.samuelraymundo.sapataria.repositories;

import org.samuelraymundo.sapataria.model.entities.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
