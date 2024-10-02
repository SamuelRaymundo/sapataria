package org.samuelraymundo.sapataria.services;

import org.samuelraymundo.sapataria.mapper.DozerMapper;

import org.samuelraymundo.sapataria.model.dto.ClientDto;
import org.samuelraymundo.sapataria.model.dto.ClientRegisterDto;
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

    public ClientDto findById(Long id) {
        var client = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no client with the id " + id));
        return DozerMapper.parseObject(client, ClientDto.class);
    }

    public List<ClientDto> findAll() {
        return DozerMapper.parseListObject(clientRepository.findAll(), ClientDto.class);
    }


    public ClientRegisterDto registerClient(ClientRegisterDto client) {
        var entity = DozerMapper.parseObject(client, Client.class);
        var vo = clientRepository.save(entity);
        return DozerMapper.parseObject(vo, ClientRegisterDto.class);
    }

    public ClientRegisterDto updateRegisterClient(ClientRegisterDto client) {
        var updateClient = clientRepository.findById(client.getId())
                .orElseThrow(() -> new ResourceNotFoundException("There is no client with the id " + client.getId()));
        updateClient.setBirthDate(client.getBirthDate());
        updateClient.setCpf(client.getCpf());
        updateClient.setName(client.getName());
        updateClient.setPassword(client.getPassword());
        updateClient.setEmail(client.getEmail());
        updateClient.setCellphoneNumber(client.getCellphoneNumber());
        updateClient.setPhoneNumber(client.getPhoneNumber());
        updateClient.setAddress(client.getAddress());
        updateClient.setAddressNumber(client.getAddressNumber());
        updateClient.setNeighborhood(client.getNeighborhood());
        updateClient.setComplement(client.getComplement());
        updateClient.setCity(client.getCity());
        updateClient.setCep(client.getCep());
        updateClient.setUf(client.getUf());
        var vo = DozerMapper.parseObject(clientRepository.save(updateClient), ClientRegisterDto.class);
        return vo;
    }

    public void delete(Long id) {
        var client = clientRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("There is no client with the id " + id));
        clientRepository.delete(client);
    }
}
