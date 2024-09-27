package org.samuelraymundo.sapataria.controller;

import org.samuelraymundo.sapataria.model.entities.Client;
import org.samuelraymundo.sapataria.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.samuelraymundo.sapataria.util.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client/v1")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public Client findById(
            @PathVariable Long id
    ) {
        return clientService.findById(id);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public List<Client> findAll() {
        return clientService.findAll();
    }
}
