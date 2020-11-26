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
	
}

//7.Direccion elegirDireccion(): Nos mostrará un mensaje para que elijamos una opción del menú anteriormente creado y nos pedirá que introduzcamos por teclado la opción
//hasta que ésta sea valida. Devolverá la dirección elegida. Realiza un commit.

//8.void crearAlfilDefecto(): Asignará al atributo de clase alfil una nueva instancia de un alfil creado con el constructor por defecto. Realiza un commit.
//9.void crearAlfilColor(): Asignará al atributo de clase alfil una nueva instancia de un alfil creado con el constructor al que le pasamos el color. Este método debe utilizar métodos ya implementados anteriormente. Realiza un commit.
//10.void crearAlfilColorColumna(): Asignará al atributo de clase alfil una nueva instancia de un alfil creado con el constructor al que le pasamos el color y la columna inicial. Este método debe utilizar métodos ya implementados anteriormente. Realiza un commit.
//11.void mover(): Mostrará un menú con las posibles direcciones, nos preguntará por la dirección y la cantidad de pasos a mover y moverá el alfil según esos parámetros. Este método debe utilizar métodos ya implementados anteriormente. Realiza un commit.
//12.void ejecutarOpcion(int): Depediendo de la opción pasada como parámetro, actuará en consecuencia. Este método debe utilizar métodos ya implementados anteriormente. Realiza un commit.
//13.void main(String[]): Método principal de nuestra aplicación que deberá realizar lo que se pide en el apartado 19 y que debe apoyarse en los métodos anteriormente implementados. Realiza un commit y realiza el push a tu repositorio remoto en GitHub.

