package org.example.mcsv_inventario.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.mcsv_inventario.model.Cliente;
import org.example.mcsv_inventario.service.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/inventario/clientes")
public class ClienteController {

    private ClienteService clienteService;

    private ModelMapper mapper;

    /**
     * Método Listar Clientes
     * @return
     */
    @GetMapping
    public List<Cliente> listar() {
        return clienteService.listar();
    }

    /**
     * Método buscar Cliente en base al ID
     * @param cli_codigo
     * @return
     */
    @GetMapping("/{cli_codigo}")
    public ResponseEntity<Cliente> findByCodigo(@PathVariable Long cli_codigo) {
        Optional<Cliente> clienteOptional = clienteService.porId(cli_codigo);
        if (clienteOptional.isPresent()) {
            return ResponseEntity.ok(clienteOptional.get());
        }
        return ResponseEntity.notFound().build();
    }

    /**
     * Método para Guardar Cliente
     * @param cliente
     * @return
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> crear(@Valid @RequestBody Cliente cliente){
        if(!cliente.getCliIdentificacion().isEmpty()&& clienteService.porIdentificacion(cliente.getCliIdentificacion()).isPresent()){
            return ResponseEntity.badRequest()
                    .body(Collections
                            .singletonMap("Mensaje","Ya existe Cliente con el número de Cédula"));
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.guardar(cliente));
    }

}
