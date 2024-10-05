package org.samuelraymundo.sapataria;

import org.samuelraymundo.sapataria.model.entities.Installment;
import org.samuelraymundo.sapataria.repositories.InstallmentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SapatariaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SapatariaApplication.class, args);
    }

}
