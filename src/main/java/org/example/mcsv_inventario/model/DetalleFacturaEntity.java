package org.example.mcsv_inventario.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "detalle_factura", schema = "inventario")
public class DetalleFacturaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "detfac_codigo")
    private int detfacCodigo;

    public int getDetfacCodigo() {
        return detfacCodigo;
    }

    public void setDetfacCodigo(int detfacCodigo) {
        this.detfacCodigo = detfacCodigo;
    }

    @Basic
    @Column(name = "detfac_cantidad")
    private double detfacCantidad;

    public double getDetfacCantidad() {
        return detfacCantidad;
    }

    public void setDetfacCantidad(double detfacCantidad) {
        this.detfacCantidad = detfacCantidad;
    }

    @Basic
    @Column(name = "detfac_precio")
    private BigDecimal detfacPrecio;

    public BigDecimal getDetfacPrecio() {
        return detfacPrecio;
    }

    public void setDetfacPrecio(BigDecimal detfacPrecio) {
        this.detfacPrecio = detfacPrecio;
    }

    @Basic
    @Column(name = "detfac_total")
    private BigDecimal detfacTotal;

    public BigDecimal getDetfacTotal() {
        return detfacTotal;
    }

    public void setDetfacTotal(BigDecimal detfacTotal) {
        this.detfacTotal = detfacTotal;
    }

    @Basic
    @Column(name = "fac_codigo")
    private int facCodigo;

    public int getFacCodigo() {
        return facCodigo;
    }

    public void setFacCodigo(int facCodigo) {
        this.facCodigo = facCodigo;
    }

    @Basic
    @Column(name = "pro_codigo")
    private int proCodigo;

    public int getProCodigo() {
        return proCodigo;
    }

    public void setProCodigo(int proCodigo) {
        this.proCodigo = proCodigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetalleFacturaEntity that = (DetalleFacturaEntity) o;
        return detfacCodigo == that.detfacCodigo && Double.compare(detfacCantidad, that.detfacCantidad) == 0 && facCodigo == that.facCodigo && proCodigo == that.proCodigo && Objects.equals(detfacPrecio, that.detfacPrecio) && Objects.equals(detfacTotal, that.detfacTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detfacCodigo, detfacCantidad, detfacPrecio, detfacTotal, facCodigo, proCodigo);
    }
}
