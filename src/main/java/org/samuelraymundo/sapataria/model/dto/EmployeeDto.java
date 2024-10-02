package org.samuelraymundo.sapataria.model.dto;

import org.samuelraymundo.sapataria.model.entities.Purchase;
import org.samuelraymundo.sapataria.model.entities.Sale;

import java.io.Serializable;

import java.util.Objects;
import java.util.Set;

public class EmployeeDto implements Serializable {

    private Long id;

    private String phoneNumber;

    private String name;

    public EmployeeDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDto that = (EmployeeDto) o;
        return Objects.equals(id, that.id) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneNumber, name);
    }
}
