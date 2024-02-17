package org.example.mcsv_inventario.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClienteDTO {
    private Long cliCodigo;
    private String cliIdentificacion;
    private String cliNombres;
    private String cliApellidos;
    private String cliCiudad;
    private String cliDireccion;
    private String cliTelefono;
    private String cliCorreo;
}
