package com.pruebaHibernate;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpleadosImple {

	public static void main(String[] args) {

		//Creamos SessionFactory que leera nuestro archivo de configuracion y construimos la SessionFactory
		SessionFactory fact = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleados.class).buildSessionFactory();
		System.out.println("Pruebaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
		//Creamos la sesion
		Session miSesion = fact.openSession();
		
		
		try {
			
			//Creamos objeto a insertar en la sesion
			Empleados emp = new Empleados("Juan Ramon");
			
			//Iniciamos la transaccion
			miSesion.beginTransaction();
			
			//Guardamos el objeto en la transaccion
			miSesion.save(emp);
			
			//Aqui recuperamos la transaccion y la guardamos en la BBDD con el .commit();
			//Si en vez de .commit() fuera .rollback() NO se guardaria la accion. 
			miSesion.getTransaction().commit();
			
			System.out.println("Registro realizado correctamente.");
			
			
		} finally {

			//Cerramos la sesion
			miSesion.close();
			fact.close();
		}
		

	}

}
