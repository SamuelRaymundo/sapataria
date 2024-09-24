package org.samuelraymundo.sapataria.repositories;

import org.samuelraymundo.sapataria.model.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
