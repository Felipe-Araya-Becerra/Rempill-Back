package com.acl.rempill_app.service.impl;

import com.acl.rempill_app.errorHandler.ClientErrorHandler.ClientNotFoundException;
import com.acl.rempill_app.model.ClientEntity;
import com.acl.rempill_app.repository.ClientRepository;
import com.acl.rempill_app.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<ClientEntity> findAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<ClientEntity> findClientById(Long id) throws ClientNotFoundException {
        Optional<ClientEntity> client = clientRepository.findById(id);
        if(!client.isPresent()){
            throw new ClientNotFoundException("Cliente no encontrado");
        }
        return client;
    }

    @Override
    public ClientEntity createClient(ClientEntity clientEntity) {
        return clientRepository.save(clientEntity);
    }

    @Override
    public ClientEntity updateClient(Long id, ClientEntity clientEntity) {
        ClientEntity updatedClient = clientRepository.findById(id).get();
        updatedClient.setName(clientEntity.getName());
        updatedClient.setEmail(clientEntity.getEmail());
        return clientRepository.save(updatedClient);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
