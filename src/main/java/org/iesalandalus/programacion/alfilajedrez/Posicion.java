package org.iesalandalus.programacion.alfilajedrez;

public class Posicion 
{
	//atributos
	private int fila;
	private char columna;
	
	
	//metodos
	
	//constructor con parámetros
	
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}

	
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

//8.Crea el constructor copia para esta clase. Realiza un commit.

