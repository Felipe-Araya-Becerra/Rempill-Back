package com.acl.rempill_app.controller;


import com.acl.rempill_app.errorHandler.ClientErrorHandler.ClientNotFoundException;
import com.acl.rempill_app.model.ClientEntity;
import com.acl.rempill_app.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")

public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @GetMapping("/clients")
    public List<ClientEntity> findAllClients() {
        return clientService.findAllClient();
    }

    @GetMapping("/clients/{id}")
    public Optional<ClientEntity> findClientById(@PathVariable Long id) throws ClientNotFoundException {
        return clientService.findClientById(id);
    }

    @PostMapping(value = "/create")
    public ClientEntity createClient(@RequestBody ClientEntity clientEntity) {
        return clientService.createClient(clientEntity);
    }

    @PutMapping(value = "/updateClient/{id}")
    public ClientEntity updateClient(@PathVariable Long id, @RequestBody ClientEntity clientEntity) {
        return clientService.updateClient(id, clientEntity);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}
