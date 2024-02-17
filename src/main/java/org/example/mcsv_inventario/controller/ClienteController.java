package org.example.mcsv_inventario.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.mcsv_inventario.dto.ClienteDTO;
import org.example.mcsv_inventario.exception.ModelNotFoundException;
import org.example.mcsv_inventario.model.Cliente;
import org.example.mcsv_inventario.service.ClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/inventario/clientes")
public class ClienteController {

    private ClienteService clienteService;
    private ModelMapper mapper;

    /**
     * Método Listar Clientes
     *
     * @return
     */
    @GetMapping
    public ResponseEntity<List<ClienteDTO>> listarTodo() {
        return ResponseEntity.ok(
                this.clienteService.findAll()
                        .stream()
                        .map(this::convertToDto).toList()
        );
    }

    /**
     * Método listar cliente por el código
     *
     * @param cli_codigo
     * @return
     */
    @GetMapping("/{cli_codigo}")
    public ResponseEntity<ClienteDTO> buscarPorCodigo(@PathVariable Long cli_codigo) {
        var obj = this.clienteService.findById(cli_codigo);
        if (obj == null) {
            throw new ModelNotFoundException("La entidad con el id" + cli_codigo + "no existe");
        }
        return ResponseEntity.ok(convertToDto(obj));
    }

    /**
     * Método para Guardar Cliente
     * @param dto
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> guardar(@Valid @RequestBody ClienteDTO dto){
        var obj = clienteService.save(convertToEntity(dto));
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{cli_codigo}").buildAndExpand(obj.getCliCodigo()).toUri();
        return ResponseEntity.created(location).build();
    }

    /**
     * Método para Actualizar Cliente
     * @param dto
     * @return
     */
    @PutMapping
    public ResponseEntity<ClienteDTO> actualiazar(@Valid @RequestBody ClienteDTO dto){
        var obj = this.clienteService.update(convertToEntity(dto));
        return ResponseEntity.ok(convertToDto(obj));
    }

    /**
     * Método para eliminar Cliente
     * @param cli_codigo
     * @return
     */
    @DeleteMapping("/{cli_codigo}")
    public ResponseEntity<Void> borrarPorId(@PathVariable Long cli_codigo){
        var obj = this.clienteService.findById(cli_codigo);
        if(obj == null){
            throw new ModelNotFoundException("El registro no existe");
        }
        this.clienteService.delete(cli_codigo);
        return ResponseEntity.noContent().build();
    }

    private ClienteDTO convertToDto(Cliente obj) {
        return mapper.map(obj, ClienteDTO.class);
    }

    private Cliente convertToEntity(ClienteDTO dto) {
        return mapper.map(dto, Cliente.class);
    }
}
