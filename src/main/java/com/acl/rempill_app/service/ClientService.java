package com.acl.rempill_app.service;

import com.acl.rempill_app.errorHandler.ClientErrorHandler.ClientNotFoundException;
import com.acl.rempill_app.model.ClientEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface ClientService {

    List<ClientEntity> findAllClient();

    Optional<ClientEntity> findClientById(Long id) throws ClientNotFoundException;

    ClientEntity createClient(ClientEntity clientEntity);

    ClientEntity updateClient(Long id, ClientEntity clientEntity);

    void deleteClient(Long id);

}
