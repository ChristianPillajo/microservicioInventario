package org.example.mcsv_inventario.service.imp;

import lombok.AllArgsConstructor;
import org.example.mcsv_inventario.model.Cliente;
import org.example.mcsv_inventario.repo.ClienteRepo;
import org.example.mcsv_inventario.repo.GenericRepo;
import org.example.mcsv_inventario.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;
import java.util.Optional;


@Service
public class ClienteServiceImp  implements ClienteService {

    @Autowired
    private  ClienteRepo clienteRepo;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> listar(){
        return (List<Cliente>) clienteRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Cliente> porId(Long id){
        return clienteRepo.findById(id);
    }

    @Override
    @Transactional
    public Cliente guardar(Cliente cliente){
        return clienteRepo.save(cliente);
    }

    @Override
    public List<Cliente> findByCliNombresContainingIgnoreCase(String cliNombres){
        return this.clienteRepo.findByCliNombresContainingIgnoreCase(cliNombres);
    }

    @Override
   public Optional<Cliente> porIdentificacion(String cliIdentificacion){
        return this.clienteRepo.porIdentificacion(cliIdentificacion);
    }
}
