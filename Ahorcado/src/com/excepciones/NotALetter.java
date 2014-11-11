package com.excepciones;
/**
 * @author Angel Daniel Munoz Gonzalez
 * @email angel.dtmunoz@gmail.com
 * @School Universidad Tecnologica de Ciudad Juarez
 * 
 */
public class NotALetter extends RuntimeException {

	public NotALetter() {
		super("El caracter Introducido no es una Letra");
		
	}
   
}
