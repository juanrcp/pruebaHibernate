package com.pruebaHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Con esta anotacion declaramos esta clase corresponde a una tabla de la base de datos
@Entity
//Con esta anotacion asignamos la entidad a la tabla correspondiente de la BBDD, el name tiene que tener el mismo nombre que la tabla de la base de datos
@Table(name="empleados")
public class Empleados {
	
	//ATRIBUTOS
	//ANOTACION PARA MAPEAR COLUMNAS referenciandolas con el mismo nombre que tienen en la BBDD
	@Column(name="Id")
	@Id //Con esto declaramos la primaryKey
	private int id;
	
	@Column(name="name_empleado")
	private String nombre_empleado;
	
	
	//PROPIEDADES
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_empleado() {
		return nombre_empleado;
	}

	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}
	

	//CONSTRUCTORES (sin id ya que es autonumerico)
	public Empleados(String nombre_empleado) {
		super();
		this.nombre_empleado = nombre_empleado;
	}	

	public Empleados() { }


	//METODOS
	@Override
	public String toString() {
		return "empleados [id=" + id + ", nombre_empleado=" + nombre_empleado + "]";
	}
	

}
