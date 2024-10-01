package org.samuelraymundo.sapataria.controller;

import org.samuelraymundo.sapataria.model.dto.ClientRegisterDto;
import org.samuelraymundo.sapataria.model.entities.Client;
import org.samuelraymundo.sapataria.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.samuelraymundo.sapataria.util.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"},consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public Client update(@RequestBody Client client) {
        return clientService.update(client);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"},consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public ClientRegisterDto registerClient(@RequestBody ClientRegisterDto client) {
        return clientService.registerClient(client);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clientService.delete(id);
    }
}
