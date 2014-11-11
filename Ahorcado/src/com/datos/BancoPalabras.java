package com.datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * @author Angel Daniel Munoz Gonzalez
 * @email angel.dtmunoz@gmail.com
 * @School Universidad Tecnologica de Ciudad Juarez
 * 
 */

public class BancoPalabras {
	
	
	//ARREGLOS
	private  ArrayList<String> listaTemporal = new ArrayList<String>();
	private  String [] animFacil;
	private  String [] animMedio;
	private  String [] animDificil;
	private  String [] herramFacil;
	private  String [] herramMedio;
	private  String [] herramDificil;
	private  String [] nombresFacil;
	private  String [] nombresMedio;
	private  String [] nombresDificil;
	private  Random r = new Random();





	/**
	 * ++++++++++NOTA: TODOS LOS ARCHIVOS DEBERAN TENER LA MISMA CANTIDAD DE PALABRAS+++++++++++++++|
	 * Clase Palabra
	 * 
	 * esta clase es para extraer las palabras de los archivos
	 * se esta utilizando un archivo para cada arreglo.
	 * los arraylist utilizados son para generar los arreglos necesarios.
	 * 
	 * a continuacion se explica el metodo de extraccion de las palabras usando la misma arraylist
	 * dentro del constructor
	 * ++++++++++NOTA: TODOS LOS ARCHIVOS DEBERAN TENER LA MISMA CANTIDAD DE PALABRAS+++++++++++++++|
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$|
	 * try
	 *	{
	 *		leerArchivo = new Scanner(new File(<DIRECTORIO>));
	 *	}
	 *	catch (FileNotFoundException e)
	 *	{
	 *		System.err.println("No ta... seguro que si esta en:\n" + <DIRECTORIO>);
	 *	}
	 *	
	 *	listaTemporal = new ArrayList<String>();
	 *
	 *	while(leerArchivo.hasNextLine())
	 *	{
	 *		String linea = leerArchivo.nextLine();
	 *		Scanner leerLinea = new Scanner(linea);
	 *		leerLinea.useDelimiter(",");
	 *	 	String palabra = leerLinea.next(); 
	 *		listaTemporal.add(palabra);
	 *	}
	 *	String [] <NOMBRE DE EL ARREGLO> = listaTemporal.toArray(new String [listaTemporal.size()]);
	 *	this.<NOMBRE DEL ARREGLO DECLARADO EN LOS ATRIBUTOS> = <NOMBRE DEL ARREGLO DEL CONSTRUCTOR>;
	 * $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$|
	 */
	public BancoPalabras() {
		//++++++++++NOTA: TODOS LOS ARCHIVOS DEBERAN TENER LA MISMA CANTIDAD DE PALABRAS+++++++++++++++|
		Scanner leerArchivo = null;
		String directorioAnimalesF = "Archivos/animalesFacil.txt";
		String directorioAnimalesM = "Archivos/animalesMedio.txt";
		String directorioAnimalesD = "Archivos/animalesDificil.txt";
		String directorioHerramientasF = "Archivos/herramientasFacil.txt";
		String directorioHerramientasM = "Archivos/herramientasMedio.txt";
		String directorioHerramientasD = "Archivos/herramientasDificil.txt";
		String directorioNombresF = "Archivos/nombresFacil.txt";
		String directorioNombresM = "Archivos/nombresMedio.txt";
		String directorioNombresD = "Archivos/nombresDificil.txt";
		//++++++++++NOTA: TODOS LOS ARCHIVOS DEBERAN TENER LA MISMA CANTIDAD DE PALABRAS+++++++++++++++|

		/**
		 * Con este constructor se obtendran los datos de cada archivo.
		 **/
		//-------------------------Arreglo de animales Faciles --------------------------------------|
		try
		{
			leerArchivo = new Scanner(new File(directorioAnimalesF));
		}
		catch (FileNotFoundException e)
		{
			System.err.println("No ta... seguro que si esta en:\n" + directorioAnimalesF);
		}
		listaTemporal = new ArrayList<String>();

		while(leerArchivo.hasNextLine())
		{
			String linea = leerArchivo.nextLine();
			Scanner leerLinea = new Scanner(linea);
			leerLinea.useDelimiter(",");
			String palabra = leerLinea.next(); 
			listaTemporal.add(palabra);
			
			
		}
		String [] animFacil = listaTemporal.toArray(new String [listaTemporal.size()]);
		this.animFacil = animFacil;
		//------------------------------------------------------------------------------------------|
		
		
		//==============================Arreglo de animales Medio===================================|
		try
		{
			leerArchivo = new Scanner(new File(directorioAnimalesM));
		}
		catch (FileNotFoundException e)
		{
			System.err.println("No ta... seguro que si esta en:\n" + directorioAnimalesM);
		}
		
		listaTemporal = new ArrayList<String>();

		while(leerArchivo.hasNextLine())
		{
			String linea = leerArchivo.nextLine();
			Scanner leerLinea = new Scanner(linea);
			leerLinea.useDelimiter(",");
			String palabra = leerLinea.next(); 
			listaTemporal.add(palabra);
		}
		String [] animMedio = listaTemporal.toArray(new String [listaTemporal.size()]);
		this.animMedio = animMedio;
		//==========================================================================================|
		
		
		
		//**************************************Arreglo de Animales Dificiles***********************|
		try
		{
			leerArchivo = new Scanner(new File(directorioAnimalesD));
		}
		catch (FileNotFoundException e)
		{
			System.err.println("No ta... seguro que si esta en:\n" + directorioAnimalesD);
		}
		
		listaTemporal = new ArrayList<String>();

		while(leerArchivo.hasNextLine())
		{
			String linea = leerArchivo.nextLine();
			Scanner leerLinea = new Scanner(linea);
			leerLinea.useDelimiter(",");
			String palabra = leerLinea.next(); 
			listaTemporal.add(palabra);
		}
		String [] animDificil = listaTemporal.toArray(new String [listaTemporal.size()]);
		this.animDificil = animDificil;
		//******************************************************************************************|
		
		
		
		
		//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Arreglo Herramientas Faciles ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|
		try
		{
			leerArchivo = new Scanner(new File(directorioHerramientasF));
		}
		catch (FileNotFoundException e)
		{
			System.err.println("No ta... seguro que si esta en:\n" + directorioHerramientasF);
		}
		
		listaTemporal = new ArrayList<String>();

		while(leerArchivo.hasNextLine())
		{
			String linea = leerArchivo.nextLine();
			Scanner leerLinea = new Scanner(linea);
			leerLinea.useDelimiter(",");
			String palabra = leerLinea.next(); 
			listaTemporal.add(palabra);
		}
		String [] herramFacil = listaTemporal.toArray(new String [listaTemporal.size()]);
		this.herramFacil = herramFacil;
		//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|
		
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ Arreglo Herramientas Medio @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|
		try
		{
			leerArchivo = new Scanner(new File(directorioHerramientasM));
		}
		catch (FileNotFoundException e)
		{
			System.err.println("No ta... seguro que si esta en:\n" + directorioHerramientasM);
		}
		
		listaTemporal = new ArrayList<String>();

		while(leerArchivo.hasNextLine())
		{
			String linea = leerArchivo.nextLine();
			Scanner leerLinea = new Scanner(linea);
			leerLinea.useDelimiter(",");
			String palabra = leerLinea.next(); 
			listaTemporal.add(palabra);
		}
		String [] herramMedio = listaTemporal.toArray(new String [listaTemporal.size()]);
		this.herramMedio = herramMedio;
		
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|
		
		
		
		
		//++++++++++++++++++++++++++++ Arreglo Herramientas Dificil ++++++++++++++++++++++++++++++++|
		try
		{
			leerArchivo = new Scanner(new File(directorioHerramientasD));
		}
		catch (FileNotFoundException e)
		{
			System.err.println("No ta... seguro que si esta en:\n" + directorioHerramientasD);
		}
		
		listaTemporal = new ArrayList<String>();

		while(leerArchivo.hasNextLine())
		{
			String linea = leerArchivo.nextLine();
			Scanner leerLinea = new Scanner(linea);
			leerLinea.useDelimiter(",");
			String palabra = leerLinea.next(); 
			listaTemporal.add(palabra);
		}
		String [] herramDificil = listaTemporal.toArray(new String [listaTemporal.size()]);
		this.herramDificil = herramDificil;
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|
		
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& Arreglo Nombres Facil &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&|
		try
		{
			leerArchivo = new Scanner(new File(directorioNombresF));
		}
		catch (FileNotFoundException e)
		{
			System.err.println("No ta... seguro que si esta en:\n" + directorioNombresF);
		}
		
		listaTemporal = new ArrayList<String>();

		while(leerArchivo.hasNextLine())
		{
			String linea = leerArchivo.nextLine();
			Scanner leerLinea = new Scanner(linea);
			leerLinea.useDelimiter(",");
			String palabra = leerLinea.next(); 
			listaTemporal.add(palabra);
		}
		String [] nombresFacil = listaTemporal.toArray(new String [listaTemporal.size()]);
		this.nombresFacil = nombresFacil;
		
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&|
		
		
		//######################### Arreglo Nombres Medio ##########################################|
		try
		{
			leerArchivo = new Scanner(new File(directorioNombresM));
		}
		catch (FileNotFoundException e)
		{
			System.err.println("No ta... seguro que si esta en:\n" + directorioNombresM);
		}
		
		listaTemporal = new ArrayList<String>();

		while(leerArchivo.hasNextLine())
		{
			String linea = leerArchivo.nextLine();
			Scanner leerLinea = new Scanner(linea);
			leerLinea.useDelimiter(",");
			String palabra = leerLinea.next(); 
			listaTemporal.add(palabra);
		}
		String [] nombresMedio = listaTemporal.toArray(new String [listaTemporal.size()]);
		this.nombresMedio = nombresMedio;
		
		//##########################################################################################|
		
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Arreglo Nombres Difiles ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
		try
		{
			leerArchivo = new Scanner(new File(directorioNombresD));
		}
		catch (FileNotFoundException e)
		{
			System.err.println("No ta... seguro que si esta en:\n" + directorioNombresD);
		}
		
		listaTemporal = new ArrayList<String>();

		while(leerArchivo.hasNextLine())
		{
			String linea = leerArchivo.nextLine();
			Scanner leerLinea = new Scanner(linea);
			leerLinea.useDelimiter(",");
			String palabra = leerLinea.next(); 
			listaTemporal.add(palabra);
		}
		String [] nombresDificil = listaTemporal.toArray(new String [listaTemporal.size()]);
		this.nombresDificil = nombresDificil;
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
	} //Aqui termina el Constructor



	//Metodos
	/**
	 * Los Metodos de esta clase seran exclusivamente para seleccionar palabras
	 * Se utilizverificarArreglos():void
	 * <categoria>Facil(int x):String x3
	 * <categoria>Medio(int x):String x3
	 * <categoria>Dificil(int x):String x3
	 * retoRandom(int x): String //Cualquier palabra de las 3 categorias y 3 dificultades
	 * retoDios(int x):String //Cualquier palabra Dificil de las 3 categorias
	 * retoNormal(int x):String //Cualquier palabra Media de las 3 categorias
	 * retoFacil(int x):String //Cualquier palabra Facil de las 3 categoriasara un metodo para determinar el contenido de los arreglos de las palabras
	 * puede servir para revisar errores ortograficos en las palabras asi como la cantidad de Palabras
	 * en las categorias
	 * 
	 * 
	 * Son 9 arreglos divididos en tres categorias y a su vez cada categoria en 3 dificultades
	 * Facil Medio Dificil.
	 * habra 9 metodos especificos para cada categoria-Dificultad
	 * ademas para incrementar la dificultad del juego se agregaran 4 metodos mas.
	 * todos los metodos (excepto el que muestra el contenido de los arreglos
	 * regresaran un String
	 **/

	public void verContenidoArreglos()//Muestra en pantalla el contenido de los Arreglos
	{
		//---------------------------------------------------------------------//
		for(int c = 0; c<listaTemporal.size();c++)
		{
			System.out.println("Animales Faciles: " + animFacil[c]);
		}
		
		
		for(int c = 0; c<listaTemporal.size();c++)
		{	
			System.out.println("Animales Medio: " + animMedio[c]);
		}
		
		for(int c = 0; c<listaTemporal.size();c++)
		{
			System.out.println("Animales Dificiles: " + animDificil[c]);
		}
		//---------------------------------------------------------------------//
		for(int c = 0; c<listaTemporal.size();c++)
		{
			System.out.println("Herramientas Faciles: " + herramFacil[c]);
		}
		
		for(int c = 0; c<listaTemporal.size();c++)
		{	
			System.out.println("Herramientas Medio: " + herramMedio[c]);
		}
		
		for(int c = 0; c<listaTemporal.size();c++)
		{
			System.out.println("Herramientas Dificiles: " + herramDificil[c]);
		}
		//---------------------------------------------------------------------//
		for(int c = 0; c<listaTemporal.size();c++)
		{
			System.out.println("Nombres Faciles Faciles: " + nombresFacil[c]);
		}
		
		for(int c = 0; c<listaTemporal.size();c++)
		{	
			System.out.println("Nombres Medio: " + nombresMedio[c]);
		}
		
		for(int c = 0; c<listaTemporal.size();c++)
		{
			System.out.println("Nombres Dificiles: " + nombresDificil[c]);
		}
		//---------------------------------------------------------------------//

	}//Termina verContenidoArreglos()

	
	public  String getRetoRandom()
	{//regresa una palabra de cualquier categoria y cualquier dificultad
		String palabra = null;
		int R1 = r.nextInt(9);
		switch(R1)
		{
		case 0:
			int num0 = r.nextInt(5);
			palabra = animFacil[num0];
			break;
		case 1:
			int num1 = r.nextInt(5);
			palabra = animMedio[num1];
			break;
		case 2:
			int num2 = r.nextInt(5);
			palabra = animDificil[num2];
			break;
		case 3:
			int num3 = r.nextInt(5);
			palabra = herramFacil[num3];
			break;
		case 4:
			int num4 = r.nextInt(5);
			palabra = herramMedio[num4];
			break;
		case 5:
			int num5 = r.nextInt(5);
			palabra = herramDificil[num5];
			break;
		case 6:
			int num6 = r.nextInt(5);
			palabra = nombresFacil[num6];
			break;
		case 7:
			int num7 = r.nextInt(5);
			palabra = nombresMedio[num7];
			break;
		case 8:
			int num8 = r.nextInt(5);
			palabra = nombresDificil[num8];
			break;
			
		}
		return palabra;
	}//Termina Reto Random	

}
