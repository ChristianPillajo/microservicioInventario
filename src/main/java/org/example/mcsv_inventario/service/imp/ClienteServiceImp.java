package org.example.mcsv_inventario.service.imp;

import lombok.AllArgsConstructor;
import org.example.mcsv_inventario.model.Cliente;
import org.example.mcsv_inventario.repo.ClienteRepo;
import org.example.mcsv_inventario.repo.GenericRepo;
import org.example.mcsv_inventario.service.ClienteService;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class ClienteServiceImp extends CRUDImp<Cliente, Long> implements ClienteService {

   private  ClienteRepo clienteRepo;

    @Override
    protected GenericRepo<Cliente, Long> getRepo() {
        return this.clienteRepo;
    }
}
