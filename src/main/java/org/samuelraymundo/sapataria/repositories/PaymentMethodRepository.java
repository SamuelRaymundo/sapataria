package org.samuelraymundo.sapataria.repositories;

import org.samuelraymundo.sapataria.model.entities.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
}
