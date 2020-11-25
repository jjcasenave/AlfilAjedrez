package org.iesalandalus.programacion.alfilajedrez;

public class Posicion 
{
	//atributos
	private int fila;
	private char columna;
	
	
	//metodos
	
	//getters y setters
	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		if(fila<1 || fila>8)
			throw new IllegalArgumentException("ERROR: fila no válida");
		
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	private void setColumna(char columna) {
		if(columna<'a' || columna>'h')
			throw new IllegalArgumentException("ERROR: columna no válida");
		
		this.columna = columna;
	}
	
}

//6.Crea los métodos get y set para los atributos. Recuerda que para el método set se debe tener en cuenta que los valores
//son correctos (las filas van del 1 al 8 -ambos inclusive- y las columnas de la 'a' a la 'h' -ambas inclusive-) y si no se 
//lance una excepción del tipo IllegalArgumentException con el mensaje adecuado y no modifique los atributos. Realiza un commit