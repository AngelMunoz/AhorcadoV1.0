package com.excepciones;
/**
 * @author Angel Daniel Munoz Gonzalez
 * @email angel.dtmunoz@gmail.com
 * @School Universidad Tecnologica de Ciudad Juarez
 * 
 */
public class EmptyBox extends RuntimeException {

	public EmptyBox() {
		super("La Caja de Texto se Encuentra Vacia!");
		
	}
   
}
