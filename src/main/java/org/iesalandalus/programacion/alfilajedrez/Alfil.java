package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

public class Alfil 
{
	//atributos
	private Color color;
	private Posicion posicion;
	
	//métodos
	
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException 
	{
		if(pasos<=0)
			throw new IllegalArgumentException("ERROR: El número de pasos debe ser positivo.");
		if(direccion==null)
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		
		try 
		{
		
			switch (direccion) 
			{
			case ARRIBA_DERECHA:
				posicion=new Posicion((posicion.getFila()+pasos),(char)(posicion.getColumna()+pasos));
				break;
				
			case ABAJO_DERECHA:
				posicion=new Posicion((posicion.getFila()-pasos),(char)(posicion.getColumna()+pasos));
				break;
				
			case ABAJO_IZQUIERDA:
				posicion=new Posicion((posicion.getFila()-pasos),(char)(posicion.getColumna()-pasos));
				break;	
				
			case ARRIBA_IZQUIERDA:
				posicion=new Posicion((posicion.getFila()+pasos),(char)(posicion.getColumna()-pasos));
				break;	
				
				default:
				break;
			}
		}	
		catch (IllegalArgumentException ex) {
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		}
	}
	
	//constructor por defecto
	public Alfil() throws IllegalArgumentException
	{
		color=Color.NEGRO;
		posicion=new Posicion(8, 'f');
	}
	
	//constructores con parametros
	
	public Alfil(Color color) throws NullPointerException, IllegalArgumentException
	{
		if(color==null)
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		setColor(color);
		if(color.equals(Color.BLANCO))
			posicion=new Posicion(1, 'f');
		else
			posicion=new Posicion(8, 'f');
	}
	
	public Alfil(Color color, char columna) throws NullPointerException, IllegalArgumentException
	{
		if(columna!='c' || columna!='f')
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		if(color==null)
			throw new NullPointerException("ERROR: el color no puede ser nulo");
		
		setColor(color);
		if(color.equals(Color.BLANCO))
			posicion=new Posicion(1, columna);
		else
			posicion=new Posicion(8, columna);
	}
	
	//getters y setters
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		if(color==null)
			throw new NullPointerException("ERROR: el color no puede ser nulo");
		else
			this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		if(posicion==null)
			throw new NullPointerException("ERROR: la posicion no es valida");
		else
			this.posicion = new Posicion(posicion);
	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alfil other = (Alfil) obj;
		if (color != other.color)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return posicion + ", color=" + color;
	}
}







