package com.co.development.controller;

import com.co.development.ejb.DepartamentosFacadeLocal;
import com.co.development.entity.Departamentos;
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
public class managedDepartamentos implements Serializable {

    @EJB
    private DepartamentosFacadeLocal departamentosFacade;
    private List<Departamentos> listaDepartamentos;
    private Departamentos departamentos;
    private String message;

    public List<Departamentos> getListaDepartamentos() {
        this.listaDepartamentos = this.departamentosFacade.findAll();
        return listaDepartamentos;
    }

    public void setListaDepartamentos(List<Departamentos> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    @PostConstruct
    public void init() {
        this.departamentos = new Departamentos();
    }
    
    public void guardar(){
        try {
            this.departamentosFacade.create(departamentos);
            this.message = "Departamento creado.";
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
            this.departamentosFacade.edit(departamentos);
            this.message = "Departamento Actualizado.";
            this.departamentos = new Departamentos();
        } catch (Exception ex) {
            ex.printStackTrace();
            this.message = "Error - Caused By: " + ex.getMessage();
        }
        FacesMessage msn = new FacesMessage(this.message);
        FacesContext.getCurrentInstance().addMessage(null, msn);
    }
    
    public void eliminar(Departamentos objDep){
        try {
            this.departamentosFacade.remove(objDep);
            this.message = "Departamento eliminado.";
        } catch (Exception ex) {
            ex.printStackTrace();
            this.message = "Error - Caused By: " + ex.getMessage();
        }
        FacesMessage msn = new FacesMessage(this.message);
        FacesContext.getCurrentInstance().addMessage(null, msn);
    }
    
    public void showData(Departamentos objDep){
        this.departamentos = objDep;
    }
    
    public void clear(){
        this.departamentos = new Departamentos();
    }
}
