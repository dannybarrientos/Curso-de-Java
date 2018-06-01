package com.ejemplo.model;

public class Persona{
	
	// esta es la edad de la persona
	public int edad;
	
	public Persona(){
		edad = 0;
		System.out.println("Constructor 1");
	}
			
	/* 
	esto es un comentario
	* de multiples lineas
	*/
	public void setEdad(int nuevaEdad){
		edad = nuevaEdad;
	}

	/**

	*/
	public int getEdad(){
		return edad;
	}
}