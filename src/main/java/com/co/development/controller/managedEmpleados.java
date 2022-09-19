/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.development.controller;

import com.co.development.ejb.EmpleadosFacadeLocal;
import com.co.development.entity.Departamentos;
import com.co.development.entity.Empleados;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class managedEmpleados implements Serializable{
    
    @EJB
    private EmpleadosFacadeLocal empleadosFacade;
    private List<Empleados> listaEmpleados;
    private Empleados empleados;
    private Departamentos departamentos;
    private String message;

    public List<Empleados> getListaEmpleados() {
        this.listaEmpleados = this.empleadosFacade.findAll();
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Empleados getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }
    
    @PostConstruct
    public void init(){
        this.empleados = new Empleados();
        this.departamentos = new Departamentos();
    }
    
    public void guardar(){
        try {
            this.empleados.setDepartametos(departamentos);
            this.empleadosFacade.create(empleados);
            this.message = "Empleado creado.";
            this.empleados = new Empleados();
            this.departamentos = new Departamentos();
        } catch (Exception ex) {
            ex.printStackTrace();
            this.message = "Error - Caused By: " + ex.getMessage();
        }
        FacesMessage msn = new FacesMessage(this.message);
        FacesContext.getCurrentInstance().addMessage(null, msn);
    }
     
    
    public void editar(){
        try {
            this.empleados.setDepartametos(departamentos);
            this.empleadosFacade.edit(empleados);
            this.message = "Empleado Actualizado.";
            this.departamentos = new Departamentos();
        } catch (Exception ex) {
            ex.printStackTrace();
            this.message = "Error - Caused By: " + ex.getMessage();
        }
        FacesMessage msn = new FacesMessage(this.message);
        FacesContext.getCurrentInstance().addMessage(null, msn);
    }
    
    public void eliminar(Empleados objEmp){
        try {
            this.empleadosFacade.remove(objEmp);
            this.message = "Empleado eliminado.";
        } catch (Exception ex) {
            ex.printStackTrace();
            this.message = "Error - Caused By: " + ex.getMessage();
        }
        FacesMessage msn = new FacesMessage(this.message);
        FacesContext.getCurrentInstance().addMessage(null, msn);
    }    
    
    
    public void showData(Empleados objEmp){
        this.empleados = objEmp;
    }
    
    public void clear(){
        this.empleados = new Empleados();
        this.departamentos = new Departamentos();
    }    
}
