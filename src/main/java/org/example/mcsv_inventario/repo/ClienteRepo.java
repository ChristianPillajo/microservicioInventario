package org.example.mcsv_inventario.repo;

import org.example.mcsv_inventario.model.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface ClienteRepo extends CrudRepository<Cliente, Long> {
    List<Cliente> findByCliNombresContainingIgnoreCase(String cliNombres);

    @Query("select c from Cliente c where c.cliIdentificacion=?1")
    Optional<Cliente> porIdentificacion(String cliIdentificacion);
}
