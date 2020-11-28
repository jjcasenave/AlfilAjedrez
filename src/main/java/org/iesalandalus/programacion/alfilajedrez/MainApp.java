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
	
	private static char elegirColumnaInicial() 
	{
		char columna='a';
		char letraColumna;
		
		do {
		System.out.println("Elige la columna inicial");
		letraColumna=Entrada.caracter();
		if(letraColumna !='c'&& letraColumna !='f')
			System.out.println("ERROR: Introduce una opción correcta");		
		}while(letraColumna !='c'&& letraColumna !='f');
		columna=letraColumna;
		return columna;
	}
	
	private static void mostrarMenuDirecciones() 
	{
		System.out.println("Elige la dirección");
		System.out.println("--------------------------------------");
		System.out.println("1.abajo-derecha");
		System.out.println("2.abajo-izquierda");
		System.out.println("3.arriba-derecha");
		System.out.println("4.arriba-izquierda");
	}
	
	private static Direccion elegirDireccion() 
	{
		Direccion direccion=null;
		int numero;
		do {
			System.out.println("Elige una de estás opciones");
			numero=Entrada.entero();
			if (numero<1 || numero>4)
	   		{
	    	System.out.println("Introduce un numero correcto");
	   		}
		} while (numero<1 || numero>4);
		
		switch(numero) {
		
		case 1:
			direccion=Direccion.ARRIBA_DERECHA;
			break;
			
		case 2:
			direccion=Direccion.ABAJO_DERECHA;
			break;
			
		case 3:
			direccion=Direccion.ABAJO_IZQUIERDA;
			break;
			
		case 4:
			direccion=Direccion.ABAJO_IZQUIERDA;
			break;
			
		default:
			break;
		}
		return direccion;
	}
	
	

}

/*19.Crea los diferentes métodos que se indican en el diagrama de clases para permitir que el método main nos muestre un menú que nos permitirá 
 * crear un alfil por defecto, crear un alfil de un color, crear un alfil de un color en una columna inicial dada ('c' o 'f'), mover el alfil y salir.
 *  Después de cada operación se nos mostrará el estado actual de nuestro alfil. El menú se repetirá mientras no elijamos la opción salir. 
 *  En todo caso se debe validar que todas las entradas al programa son correctas. Para ello implementa los siguientes métodos:
 */
/*





8.void crearAlfilDefecto(): Asignará al atributo de clase alfil una nueva instancia de un alfil creado con el constructor por defecto. Realiza un commit.
9.void crearAlfilColor(): Asignará al atributo de clase alfil una nueva instancia de un alfil creado con el constructor al que le pasamos el color. Este método debe utilizar métodos ya implementados anteriormente. Realiza un commit.
10.void crearAlfilColorColumna(): Asignará al atributo de clase alfil una nueva instancia de un alfil creado con el constructor al que le pasamos el color y la columna inicial. Este método debe utilizar métodos ya implementados anteriormente. Realiza un commit.
11.void mover(): Mostrará un menú con las posibles direcciones, nos preguntará por la dirección y la cantidad de pasos a mover y moverá el alfil según esos parámetros. Este método debe utilizar métodos ya implementados anteriormente. Realiza un commit.
12.void ejecutarOpcion(int): Depediendo de la opción pasada como parámetro, actuará en consecuencia. Este método debe utilizar métodos ya implementados anteriormente. Realiza un commit.
*/