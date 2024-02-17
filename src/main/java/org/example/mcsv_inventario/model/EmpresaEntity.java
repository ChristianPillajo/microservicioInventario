package org.example.mcsv_inventario.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "empresa", schema = "inventario")
public class EmpresaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "emp_codigo")
    private int empCodigo;

    public int getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(int empCodigo) {
        this.empCodigo = empCodigo;
    }

    @Basic
    @Column(name = "emp_nombre")
    private String empNombre;

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    @Basic
    @Column(name = "emp_identificacion")
    private String empIdentificacion;

    public String getEmpIdentificacion() {
        return empIdentificacion;
    }

    public void setEmpIdentificacion(String empIdentificacion) {
        this.empIdentificacion = empIdentificacion;
    }

    @Basic
    @Column(name = "emp_direccion")
    private String empDireccion;

    public String getEmpDireccion() {
        return empDireccion;
    }

    public void setEmpDireccion(String empDireccion) {
        this.empDireccion = empDireccion;
    }

    @Basic
    @Column(name = "emp_telefono")
    private String empTelefono;

    public String getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }

    @Basic
    @Column(name = "emp_correo")
    private String empCorreo;

    public String getEmpCorreo() {
        return empCorreo;
    }

    public void setEmpCorreo(String empCorreo) {
        this.empCorreo = empCorreo;
    }

    @Basic
    @Column(name = "emp_autsri")
    private String empAutsri;

    public String getEmpAutsri() {
        return empAutsri;
    }

    public void setEmpAutsri(String empAutsri) {
        this.empAutsri = empAutsri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpresaEntity that = (EmpresaEntity) o;
        return empCodigo == that.empCodigo && Objects.equals(empNombre, that.empNombre) && Objects.equals(empIdentificacion, that.empIdentificacion) && Objects.equals(empDireccion, that.empDireccion) && Objects.equals(empTelefono, that.empTelefono) && Objects.equals(empCorreo, that.empCorreo) && Objects.equals(empAutsri, that.empAutsri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empCodigo, empNombre, empIdentificacion, empDireccion, empTelefono, empCorreo, empAutsri);
    }
}
