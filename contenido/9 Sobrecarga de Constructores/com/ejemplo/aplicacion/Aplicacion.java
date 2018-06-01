package com.ejemplo.aplicacion;

import com.ejemplo.model.Persona;

public class Aplicacion {
	
	public static void main(String[] args){
		Persona daniela = new Persona();
		Persona maria = new Persona(2);
		Persona jesus = new Persona(5, "Jesus");
		System.out.println("HOLA");
	}
	
}