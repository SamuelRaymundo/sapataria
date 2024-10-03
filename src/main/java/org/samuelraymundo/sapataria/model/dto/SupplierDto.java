package org.samuelraymundo.sapataria.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class SupplierDto {


    private Long id;

    private String cnpj;

    private String ie;

    private String fantasyName;

    private String socialReason;

    private String address;

    private String addressNumber;

    private String complement;

    private String neighborhood;

    private String city;

    private String uf;

    private String cep;

    public SupplierDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getSocialReason() {
        return socialReason;
    }

    public void setSocialReason(String socialReason) {
        this.socialReason = socialReason;
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

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierDto that = (SupplierDto) o;
        return Objects.equals(id, that.id) && Objects.equals(cnpj, that.cnpj) && Objects.equals(ie, that.ie) && Objects.equals(fantasyName, that.fantasyName) && Objects.equals(socialReason, that.socialReason) && Objects.equals(address, that.address) && Objects.equals(addressNumber, that.addressNumber) && Objects.equals(complement, that.complement) && Objects.equals(neighborhood, that.neighborhood) && Objects.equals(city, that.city) && Objects.equals(uf, that.uf) && Objects.equals(cep, that.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cnpj, ie, fantasyName, socialReason, address, addressNumber, complement, neighborhood, city, uf, cep);
    }
}

