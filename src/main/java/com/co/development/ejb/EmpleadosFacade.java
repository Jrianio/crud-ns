/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.development.ejb;

import com.co.development.entity.Empleados;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ODIN
 */
@Stateless
public class EmpleadosFacade extends AbstractFacade<Empleados> implements EmpleadosFacadeLocal {

    @PersistenceContext(unitName = "com.co.development_CrudNexosSoftware_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpleadosFacade() {
        super(Empleados.class);
    }
    
}
