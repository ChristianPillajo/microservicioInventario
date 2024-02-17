package org.example.mcsv_inventario.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "menu", schema = "inventario")
public class MenuEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "men_codigo")
    private int menCodigo;

    public int getMenCodigo() {
        return menCodigo;
    }

    public void setMenCodigo(int menCodigo) {
        this.menCodigo = menCodigo;
    }

    @Basic
    @Column(name = "men_nombre")
    private String menNombre;

    public String getMenNombre() {
        return menNombre;
    }

    public void setMenNombre(String menNombre) {
        this.menNombre = menNombre;
    }

    @Basic
    @Column(name = "men_url")
    private String menUrl;

    public String getMenUrl() {
        return menUrl;
    }

    public void setMenUrl(String menUrl) {
        this.menUrl = menUrl;
    }

    @Basic
    @Column(name = "men_id_padr")
    private Integer menIdPadr;

    public Integer getMenIdPadr() {
        return menIdPadr;
    }

    public void setMenIdPadr(Integer menIdPadr) {
        this.menIdPadr = menIdPadr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuEntity that = (MenuEntity) o;
        return menCodigo == that.menCodigo && Objects.equals(menNombre, that.menNombre) && Objects.equals(menUrl, that.menUrl) && Objects.equals(menIdPadr, that.menIdPadr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menCodigo, menNombre, menUrl, menIdPadr);
    }
}
