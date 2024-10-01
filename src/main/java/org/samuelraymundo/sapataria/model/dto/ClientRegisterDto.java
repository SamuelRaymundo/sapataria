package org.samuelraymundo.sapataria.model.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ClientRegisterDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Date birthDate;

    private String cpf;

    private String name;

    private String password;

    private String email;

    private String cellphoneNumber;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientRegisterDto that = (ClientRegisterDto) o;
        return Objects.equals(id, that.id) && Objects.equals(birthDate, that.birthDate) && Objects.equals(cpf, that.cpf) && Objects.equals(name, that.name) && Objects.equals(password, that.password) && Objects.equals(email, that.email) && Objects.equals(cellphoneNumber, that.cellphoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, birthDate, cpf, name, password, email, cellphoneNumber);
    }
}
