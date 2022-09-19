package com.co.development.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Empleados.class)
public abstract class Empleados_ {

	public static volatile SingularAttribute<Empleados, String> documento_tipo;
	public static volatile SingularAttribute<Empleados, String> apellidos;
	public static volatile SingularAttribute<Empleados, String> ciudad;
	public static volatile SingularAttribute<Empleados, Integer> documentoNumero;
	public static volatile SingularAttribute<Empleados, String> direccion;
	public static volatile SingularAttribute<Empleados, Date> fechaHoraCrea;
	public static volatile SingularAttribute<Empleados, Date> fechaHoraModifica;
	public static volatile SingularAttribute<Empleados, Integer> id;
	public static volatile SingularAttribute<Empleados, Integer> telefono;
	public static volatile SingularAttribute<Empleados, String> correoElectronico;
	public static volatile SingularAttribute<Empleados, Departamentos> departametos;
	public static volatile SingularAttribute<Empleados, String> nombres;

}

