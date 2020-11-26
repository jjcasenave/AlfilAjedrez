package org.iesalandalus.programacion.alfilajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	public static void main(String[] args) 
	{

	}
	
	//métodos
	
	private static Alfil alfil;
	
	private static void mostrarAlfil() 
	{
		System.out.println(alfil);
	}
	
	private static void mostrarMenu() 
	{
		System.out.println("Opciones");
		System.out.println("-----------------------------------");
		System.out.println("1.Crear un alfil por defecto");
		System.out.println("2.Crear un alfil de un color");
		System.out.println("3.Crear un alfil de un color con columna inicial");
		System.out.println("4.Mover un alfil");
		System.out.println("5.Salir");
	}
	
	private static int elegirOpcion() 
	{
		int numero;
		do {
			System.out.println("Elige una de estás opciones");
			numero=Entrada.entero();
			if (numero<1 || numero>5)
	   		{
	    	System.out.println("Introduce un numero correcto");
	   		}
		} while (numero<1 || numero>5);
		return numero;
	}
	
	private static Color elegirColor() 
	{
		int colorAlfil;
		Color color=null;
		do {
			System.out.println("Elige el color del alfil");
			System.out.println("1.Blanco");
			System.out.println("2.Negro");
			colorAlfil=Entrada.entero();
			if(colorAlfil<1 && colorAlfil>2) {
				System.out.println("Introduce una opcion correcta");
			}
		}while (colorAlfil<1 && colorAlfil>2);
		
		switch (colorAlfil) 
		{
		case 1:
			color=Color.BLANCO;
			break;
		
		case 2:
			color=Color.NEGRO;
			break;
			
		default:
			break;
		}
		
		return color;
	}
	
	

}
