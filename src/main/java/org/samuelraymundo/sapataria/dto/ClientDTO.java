package org.samuelraymundo.sapataria.dto;


import jakarta.persistence.Column;

import java.io.Serializable;
import java.util.Date;

public class ClientDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Date birthDate;

    private String name;

    private String email;
    private String cellphoneNumber;

    private String phoneNumber;

    private String address;
    private String addresNumber;


    private String neighborhood;

    private String complement;

    private String city;

    private String cep;

    private String uf;

}
