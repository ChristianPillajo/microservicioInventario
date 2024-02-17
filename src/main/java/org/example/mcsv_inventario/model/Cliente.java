package org.example.mcsv_inventario.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "cliente", schema = "inventario")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_codigo")
    private Long cliCodigo;

    @Column(name = "cli_identificacion")
    private String cliIdentificacion;


    @Column(name = "cli_nombres")
    private String cliNombres;

    @Column(name = "cli_apellidos")
    private String cliApellidos;


    @Column(name = "cli_ciudad")
    private String cliCiudad;

    @Column(name = "cli_direccion")
    private String cliDireccion;


    @Column(name = "cli_telefono")
    private String cliTelefono;


    @Column(name = "cli_correo")
    private String cliCorreo;

}
