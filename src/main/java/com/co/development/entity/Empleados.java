package com.co.development.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "empleados")
public class Empleados implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Incrementa
    private int id;

    @Column(name = "documento_tipo")
    private String documento_tipo;

    @Column(name = "documento_numero")
    private int documentoNumero;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamentos departametos;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @Column(name = "telefono")
    private int telefono;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_hora_crea")
    private Date fechaHoraCrea;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_hora_modifica")
    private Date fechaHoraModifica;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleados other = (Empleados) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empleados{" + "id=" + id + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumento_tipo() {
        return documento_tipo;
    }

    public void setDocumento_tipo(String documento_tipo) {
        this.documento_tipo = documento_tipo;
    }

    public int getDocumentoNumero() {
        return documentoNumero;
    }

    public void setDocumentoNumero(int documentoNumero) {
        this.documentoNumero = documentoNumero;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Departamentos getDepartametos() {
        return departametos;
    }

    public void setDepartametos(Departamentos departametos) {
        this.departametos = departametos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getFechaHoraCrea() {
        return fechaHoraCrea;
    }

    public void setFechaHoraCrea(Date fechaHoraCrea) {
        this.fechaHoraCrea = fechaHoraCrea;
    }

    public Date getFechaHoraModifica() {
        return fechaHoraModifica;
    }

    public void setFechaHoraModifica(Date fechaHoraModifica) {
        this.fechaHoraModifica = fechaHoraModifica;
    }
}