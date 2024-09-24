package org.samuelraymundo.sapataria.repositories;

import org.samuelraymundo.sapataria.model.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
