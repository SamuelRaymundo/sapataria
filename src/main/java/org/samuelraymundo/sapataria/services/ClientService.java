package org.samuelraymundo.sapataria.services;

import org.samuelraymundo.sapataria.model.entities.Client;
import org.samuelraymundo.sapataria.exceptions.ResourceNotFoundException;
import org.samuelraymundo.sapataria.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client findById(Long id) {
        var client = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no client with the id " + id));
        return client;
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client create(Client client) {
        return clientRepository.save(client);
    }

    public Client update(Client client) {
        var updateClient = clientRepository.findById(client.getId())
                .orElseThrow(() -> new ResourceNotFoundException("There is no client with the id " + client.getId()));
        return updateClient;
    }

    public void delete(Long id) {
        var client = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no client with the id " + id));
        clientRepository.delete(client);
    }
}
