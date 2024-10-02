package org.samuelraymundo.sapataria.controller;

import org.samuelraymundo.sapataria.model.dto.ClientDto;
import org.samuelraymundo.sapataria.model.dto.ClientRegisterDto;
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
    public ClientDto findById(
            @PathVariable Long id
    ) {
        return clientService.findById(id);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public List<ClientDto> findAll() {
        return clientService.findAll();
    }

    @PutMapping(produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"},consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public ClientRegisterDto update(@RequestBody ClientRegisterDto client) {
        return clientService.updateRegisterClient(client);
    }

    @PostMapping(value ="/register",produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"},consumes = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,"application/x-yml"})
    public ClientRegisterDto registerClient(@RequestBody ClientRegisterDto client) {
        return clientService.registerClient(client);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clientService.delete(id);
    }
}
