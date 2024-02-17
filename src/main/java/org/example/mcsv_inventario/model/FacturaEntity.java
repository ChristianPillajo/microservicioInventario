package org.example.mcsv_inventario.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "factura", schema = "inventario", catalog = "")
public class FacturaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "fac_codigo")
    private int facCodigo;

    public int getFacCodigo() {
        return facCodigo;
    }

    public void setFacCodigo(int facCodigo) {
        this.facCodigo = facCodigo;
    }

    @Basic
    @Column(name = "fac_numero")
    private String facNumero;

    public String getFacNumero() {
        return facNumero;
    }

    public void setFacNumero(String facNumero) {
        this.facNumero = facNumero;
    }

    @Basic
    @Column(name = "fac_fecha")
    private Date facFecha;

    public Date getFacFecha() {
        return facFecha;
    }

    public void setFacFecha(Date facFecha) {
        this.facFecha = facFecha;
    }

    @Basic
    @Column(name = "fac_subtotal")
    private BigDecimal facSubtotal;

    public BigDecimal getFacSubtotal() {
        return facSubtotal;
    }

    public void setFacSubtotal(BigDecimal facSubtotal) {
        this.facSubtotal = facSubtotal;
    }

    @Basic
    @Column(name = "fac_impuesto")
    private BigDecimal facImpuesto;

    public BigDecimal getFacImpuesto() {
        return facImpuesto;
    }

    public void setFacImpuesto(BigDecimal facImpuesto) {
        this.facImpuesto = facImpuesto;
    }

    @Basic
    @Column(name = "fac_total")
    private BigDecimal facTotal;

    public BigDecimal getFacTotal() {
        return facTotal;
    }

    public void setFacTotal(BigDecimal facTotal) {
        this.facTotal = facTotal;
    }

    @Basic
    @Column(name = "fac_estado")
    private Integer facEstado;

    public Integer getFacEstado() {
        return facEstado;
    }

    public void setFacEstado(Integer facEstado) {
        this.facEstado = facEstado;
    }

    @Basic
    @Column(name = "fac_observacion")
    private String facObservacion;

    public String getFacObservacion() {
        return facObservacion;
    }

    public void setFacObservacion(String facObservacion) {
        this.facObservacion = facObservacion;
    }

    @Basic
    @Column(name = "cli_codigo")
    private int cliCodigo;

    public int getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(int cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacturaEntity that = (FacturaEntity) o;
        return facCodigo == that.facCodigo && cliCodigo == that.cliCodigo && Objects.equals(facNumero, that.facNumero) && Objects.equals(facFecha, that.facFecha) && Objects.equals(facSubtotal, that.facSubtotal) && Objects.equals(facImpuesto, that.facImpuesto) && Objects.equals(facTotal, that.facTotal) && Objects.equals(facEstado, that.facEstado) && Objects.equals(facObservacion, that.facObservacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facCodigo, facNumero, facFecha, facSubtotal, facImpuesto, facTotal, facEstado, facObservacion, cliCodigo);
    }
}
