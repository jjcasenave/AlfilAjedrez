package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {

	private static Alfil alfil;

	public static void main(String[] args) {

		int opcion=0;
		do {
		mostrarMenu();
		opcion=elegirOpcion();
		ejecutarOpcion(opcion);
		if(opcion!=5)
			mostrarAlfil();
		else
			System.out.println("¡Adios!");
		} while(opcion!=5);
	}
		

	// métodos

	private static void mostrarAlfil() {
		System.out.println(alfil);
	}

	private static void mostrarMenu() {
		System.out.println("Opciones");
		System.out.println("-----------------------------------");
		System.out.println("1.Crear un alfil por defecto");
		System.out.println("2.Crear un alfil de un color");
		System.out.println("3.Crear un alfil de un color con columna inicial");
		System.out.println("4.Mover un alfil");
		System.out.println("5.Salir");
	}

	private static int elegirOpcion() {
		int numero;
		do {
			System.out.println("Elige una de estás opciones");
			numero = Entrada.entero();
			if (numero < 1 || numero > 5) {
				System.out.println("Introduce un numero correcto");
			}
		} while (numero < 1 || numero > 5);
		return numero;
	}

	private static Color elegirColor() {
		int colorAlfil;
		Color color = null;
		do {
			System.out.println("Elige el color del alfil");
			System.out.println("1.Blanco");
			System.out.println("2.Negro");
			colorAlfil = Entrada.entero();
			if (colorAlfil < 1 && colorAlfil > 2) {
				System.out.println("Introduce una opcion correcta");
			}
		} while (colorAlfil < 1 && colorAlfil > 2);

		switch (colorAlfil) {
		case 1:
			color = Color.BLANCO;
			break;

		case 2:
			color = Color.NEGRO;
			break;

		default:
			break;
		}

		return color;
	}

	private static char elegirColumnaInicial() {
		char columna = 'a';
		char letraColumna;

		do {
			System.out.println("Elige la columna inicial");
			letraColumna = Entrada.caracter();
			if (letraColumna != 'c' && letraColumna != 'f')
				System.out.println("ERROR: Introduce una opción correcta");
		} while (letraColumna != 'c' && letraColumna != 'f');
		columna = letraColumna;
		return columna;
	}

	private static void mostrarMenuDirecciones() {
		System.out.println("Elige la dirección");
		System.out.println("--------------------------------------");
		System.out.println("1.abajo-derecha");
		System.out.println("2.abajo-izquierda");
		System.out.println("3.arriba-derecha");
		System.out.println("4.arriba-izquierda");
	}

	private static Direccion elegirDireccion() {
		Direccion direccion = null;
		int numero;
		do {
			System.out.println("Elige una de estás opciones");
			System.out.println("1.Arriba-derecha");
			System.out.println("2.Abajo-derecha");
			System.out.println("3.Abajo-izquierda");
			System.out.println("4.Arriba-izquierda");
			numero = Entrada.entero();
			if (numero < 1 || numero > 4) {
				System.out.println("Introduce un numero correcto");
			}
		} while (numero < 1 || numero > 4);

		switch (numero) {

		case 1:
			direccion = Direccion.ARRIBA_DERECHA;
			break;

		case 2:
			direccion = Direccion.ABAJO_DERECHA;
			break;

		case 3:
			direccion = Direccion.ABAJO_IZQUIERDA;
			break;

		case 4:
			direccion = Direccion.ABAJO_IZQUIERDA;
			break;

		default:
			break;
		}
		return direccion;
	}

	private static void crearAlfilDefecto() {
		alfil = new Alfil();
	}

	private static void crearAlfilColor() {
		alfil = new Alfil(Color.BLANCO);
	}

	private static void crearAlfilColorColumna() {
		alfil = new Alfil(Color.BLANCO, 'c');
	}

	private static void mover() {
		Direccion direccion = elegirDireccion();
		System.out.println("¿Cuantos pasos quieres mover?");
		int pasos = Entrada.entero();
		try {
			alfil.mover(direccion, pasos);
		} catch (OperationNotSupportedException e) {
			// do nothing
		}
	}
	
	private static void ejecutarOpcion(int opcion) {
		
		switch (opcion) {
		
		case 1:
			crearAlfilDefecto();
			break;
			
		case 2:
			crearAlfilColor();
			break;
			
		case 3:
			crearAlfilColorColumna();
			break;
			
		case 4:
			if(alfil == null) {
				crearAlfilDefecto();
			}
			mover();
			break;
				
		case 5:
			break;
		}
	}

}

