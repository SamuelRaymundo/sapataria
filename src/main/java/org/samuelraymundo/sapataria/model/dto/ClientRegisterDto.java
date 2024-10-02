package org.samuelraymundo.sapataria.model.dto;

import java.io.Serializable;
import java.util.Date;

import java.util.Objects;


public class ClientRegisterDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Date birthDate;

    private String rg;

    private String cpf;

    private String name;

    private String password;

    private String email;

    private String cellphoneNumber;

    private String phoneNumber;

    private String address;

    private String addressNumber;

    private String neighborhood;

    private String complement;

    private String city;

    private String cep;

    private String uf;

    public ClientRegisterDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientRegisterDto that = (ClientRegisterDto) o;
        return Objects.equals(id, that.id) && Objects.equals(birthDate, that.birthDate) && Objects.equals(rg, that.rg) && Objects.equals(cpf, that.cpf) && Objects.equals(name, that.name) && Objects.equals(password, that.password) && Objects.equals(email, that.email) && Objects.equals(cellphoneNumber, that.cellphoneNumber) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(address, that.address) && Objects.equals(addressNumber, that.addressNumber) && Objects.equals(neighborhood, that.neighborhood) && Objects.equals(complement, that.complement) && Objects.equals(city, that.city) && Objects.equals(cep, that.cep) && Objects.equals(uf, that.uf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, birthDate, rg, cpf, name, password, email, cellphoneNumber, phoneNumber, address, addressNumber, neighborhood, complement, city, cep, uf);
    }
}
