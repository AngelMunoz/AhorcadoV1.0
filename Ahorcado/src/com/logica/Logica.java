/**
 * 
 */
package com.logica;

/**
 * @author Angel Daniel Munoz Gonzalez
 * @email angel.dtmunoz@gmail.com
 * @School Universidad Tecnologica de Ciudad Juarez
 * 
 */
public class Logica
{
	
	
	private String escondida, s1, compare;
	public Logica(String obj)
	{
		this.s1 = obj;
		esconderPalabra();
		puntoComparacion();
		
	}
	
	
	
	public void esconderPalabra()
	{
		StringBuilder adivina= new StringBuilder(this.s1+this.s1);
		for(int i=0; i<adivina.length(); i++)
	    {
	    	if(i%2==0)
	    	{
	    	  if(this.s1.charAt(i/2)!=' ')
	    	  {
	    		  adivina.setCharAt(i, '_');
	    	  }
	    	  else
	    	  {
	    		  adivina.setCharAt(i, ' ');
	    	  }
	    	}  
	    	else
	    	{
	    		adivina.setCharAt(i, ' ');
	    	}
	    }
		this.escondida = adivina.toString();
	}
	
	public void puntoComparacion()
	{
		StringBuilder poders = new StringBuilder(this.escondida);
		char[] letras = s1.toCharArray();
		for(int c = 0; c<letras.length;c++)
		{
			if(this.s1.indexOf(letras[c])!= -1)
		    {
		    	for(int i=0; i<this.s1.length(); i++)
		    	{
		    		if(this.s1.charAt(i)== letras[c])
		    		{	
		    			poders.setCharAt(i*2, letras[c]);
		    		}
		    			
		    	}
		    }
		}
	    this.compare = poders.toString();
	}
	
	public void buscarLetra(char buscar)
	{
		StringBuilder poders = new StringBuilder(this.escondida);
	    if(this.s1.indexOf(buscar)!= -1)
	    {
	    	for(int i=0; i<this.s1.length(); i++)
	    	{
	    		if(this.s1.charAt(i)== buscar)
	    		{	
	    			poders.setCharAt(i*2, buscar);
	    		}
	    			
	    	}
	    }
	    this.escondida = poders.toString();
	}

	public static boolean validarVictoria(String str1, String str2)
	{
		if(str1.equals(str2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean verifChar(char buscar)
	{
		if(this.compare.indexOf(buscar) == -1)
		{
			return false;
		}
		else if(this.compare.indexOf(buscar) >= 0)
		{
			return true;
		}
		else
			{
			return false;
			}
	}
	
	
	public String getEscondida() {
		return escondida;
	}



	public String getS1() {
		return s1;
	}



	public String getCompare() {
		return compare;
	}
	
	
	
	
}

