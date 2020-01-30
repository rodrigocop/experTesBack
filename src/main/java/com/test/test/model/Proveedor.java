package com.test.test.model;

import javax.persistence.*;

@Entity(name = "Proveedor")
@Table(name = "Proveedor", uniqueConstraints = { @UniqueConstraint( columnNames = { "proveedorId", "cuil" } ) })
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long proveedorId;

    @Column
    private String cuil;

    @Column
    private String nombre;

    @Column
    private String email;

    @Column
    private String direccion;

    @Column
    private String telefono;

    @Column
    private Boolean responsableInscripto;

    public Long getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(Long proveedorId) {
        this.proveedorId = proveedorId;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String dni) {
        this.cuil = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Boolean getResponsableInscripto() {
        return responsableInscripto;
    }

    public void setResponsableInscripto(Boolean responsableInscripto) {
        this.responsableInscripto = responsableInscripto;
    }
}
