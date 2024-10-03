package org.samuelraymundo.sapataria.model.dto;
import java.io.Serializable;
import java.util.Objects;

public class PhoneDto implements Serializable {

    private Long id;

    private String number;

    private String contact;

    private String email;

    private SupplierDto supplier;

    public PhoneDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SupplierDto getSupplier() {
        return supplier;
    }

    public void setSupplier(SupplierDto supplier) {
        this.supplier = supplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneDto phoneDto = (PhoneDto) o;
        return Objects.equals(id, phoneDto.id) && Objects.equals(number, phoneDto.number) && Objects.equals(contact, phoneDto.contact) && Objects.equals(email, phoneDto.email) && Objects.equals(supplier, phoneDto.supplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, contact, email, supplier);
    }
}
