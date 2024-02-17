package org.example.mcsv_inventario.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tipo_producto", schema = "inventario")
public class TipoProductoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "tippro_codigo")
    private int tipproCodigo;
    @Basic
    @Column(name = "tippro_nombre")
    private String tipproNombre;
    @Basic
    @Column(name = "tippro_descripcion")
    private String tipproDescripcion;

    public int getTipproCodigo() {
        return tipproCodigo;
    }

    public void setTipproCodigo(int tipproCodigo) {
        this.tipproCodigo = tipproCodigo;
    }

    public String getTipproNombre() {
        return tipproNombre;
    }

    public void setTipproNombre(String tipproNombre) {
        this.tipproNombre = tipproNombre;
    }

    public String getTipproDescripcion() {
        return tipproDescripcion;
    }

    public void setTipproDescripcion(String tipproDescripcion) {
        this.tipproDescripcion = tipproDescripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoProductoEntity that = (TipoProductoEntity) o;
        return tipproCodigo == that.tipproCodigo && Objects.equals(tipproNombre, that.tipproNombre) && Objects.equals(tipproDescripcion, that.tipproDescripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipproCodigo, tipproNombre, tipproDescripcion);
    }
}
