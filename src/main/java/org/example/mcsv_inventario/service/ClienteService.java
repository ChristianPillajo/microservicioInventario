package org.example.mcsv_inventario.service;

import org.example.mcsv_inventario.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    public List<Cliente> listar();
    public Optional<Cliente> porId(Long id);

    public Cliente guardar(Cliente cliente);
    List<Cliente> findByCliNombresContainingIgnoreCase(String cliNombres );

    public Optional<Cliente> porIdentificacion(String cliIdentificacion);
}
