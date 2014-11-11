package com.excepciones;
/**
 * @author Angel Daniel Munoz Gonzalez
 * @email angel.dtmunoz@gmail.com
 * @School Universidad Tecnologica de Ciudad Juarez
 * 
 */
public class TooMuchChars extends RuntimeException {

	public TooMuchChars() {
		super("La cantidad de Caracteres se ha excedido");
		
	}
   
}

