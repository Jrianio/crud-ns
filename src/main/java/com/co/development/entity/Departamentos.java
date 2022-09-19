package com.co.development.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "departamentos")
public class Departamentos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Incrementa
    private int id;

    @Column(name = "departamento_codigo")
    private int departamentoCodigo;

    @Column(name = "departamento_nombre")
    private String departamentoNombre;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_hora_crea")
    private Date fechaHoraCrea;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_hora_modifica")
    private Date fechaHoraModifica;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.id;
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
        final Departamentos other = (Departamentos) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Departamentos{" + "id=" + id + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartamentoCodigo() {
        return departamentoCodigo;
    }

    public void setDepartamentoCodigo(int departamentoCodigo) {
        this.departamentoCodigo = departamentoCodigo;
    }

    public String getDepartamentoNombre() {
        return departamentoNombre;
    }

    public void setDepartamentoNombre(String departamentoNombre) {
        this.departamentoNombre = departamentoNombre;
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
