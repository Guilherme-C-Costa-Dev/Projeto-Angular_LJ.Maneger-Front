package io.github.GuilhermeC.service;


import io.github.GuilhermeC.model.Cliente;
import io.github.GuilhermeC.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private final ClientesRepository repository;

//@Autowired
    public ClientService(ClientesRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente) {

    }

}
