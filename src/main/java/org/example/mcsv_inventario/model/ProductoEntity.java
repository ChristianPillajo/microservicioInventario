package org.example.mcsv_inventario.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "producto", schema = "inventario")
public class ProductoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pro_codigo")
    private int proCodigo;
    @Basic
    @Column(name = "pro_nombre")
    private String proNombre;
    @Basic
    @Column(name = "pro_descripcion")
    private String proDescripcion;
    @Basic
    @Column(name = "pro_precio")
    private BigDecimal proPrecio;
    @Basic
    @Column(name = "tippro_codigo")
    private int tipproCodigo;
    @Basic
    @Column(name = "prov_codigo")
    private int provCodigo;
    @Basic
    @Column(name = "pro_codigoPro")
    private String proCodigoPro;
    @Basic
    @Column(name = "pro_cantidad")
    private int proCantidad;

    public int getProCodigo() {
        return proCodigo;
    }

    public void setProCodigo(int proCodigo) {
        this.proCodigo = proCodigo;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public String getProDescripcion() {
        return proDescripcion;
    }

    public void setProDescripcion(String proDescripcion) {
        this.proDescripcion = proDescripcion;
    }

    public BigDecimal getProPrecio() {
        return proPrecio;
    }

    public void setProPrecio(BigDecimal proPrecio) {
        this.proPrecio = proPrecio;
    }

    public int getTipproCodigo() {
        return tipproCodigo;
    }

    public void setTipproCodigo(int tipproCodigo) {
        this.tipproCodigo = tipproCodigo;
    }

    public int getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(int provCodigo) {
        this.provCodigo = provCodigo;
    }

    public String getProCodigoPro() {
        return proCodigoPro;
    }

    public void setProCodigoPro(String proCodigoPro) {
        this.proCodigoPro = proCodigoPro;
    }

    public int getProCantidad() {
        return proCantidad;
    }

    public void setProCantidad(int proCantidad) {
        this.proCantidad = proCantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoEntity that = (ProductoEntity) o;
        return proCodigo == that.proCodigo && tipproCodigo == that.tipproCodigo && provCodigo == that.provCodigo && proCantidad == that.proCantidad && Objects.equals(proNombre, that.proNombre) && Objects.equals(proDescripcion, that.proDescripcion) && Objects.equals(proPrecio, that.proPrecio) && Objects.equals(proCodigoPro, that.proCodigoPro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proCodigo, proNombre, proDescripcion, proPrecio, tipproCodigo, provCodigo, proCodigoPro, proCantidad);
    }
}
