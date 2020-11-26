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
			throw new IllegalArgumentException("ERROR: la cantidad de pasos ha de ser positiva");
		if(direccion==null)
			throw new NullPointerException("ERROR: la direccion no puede ser nula");
		
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
			throw new OperationNotSupportedException("ERROR: no se puede realizar ese movimiento");
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
			throw new NullPointerException("ERROR: el color no puede ser nulo");
		setColor(color);
		if(color.equals(Color.BLANCO))
			posicion=new Posicion(1, 'f');
		else
			posicion=new Posicion(8, 'f');
	}
	
	public Alfil(Color color, char columna) throws NullPointerException, IllegalArgumentException
	{
		if(columna!='c' || columna!='f')
			throw new IllegalArgumentException("ERROR: la columna tiene que ser c o f");
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
}

//16.Crea el método mover que acepte como parámetro una Direccion y la cantidad de pasos a mover en dicha dirección. 
//Los pasos deben ser positivos y la dirección no puede ser nula o de lo contrario debe lanzar una excepción adecuada 
//(NullPointerException o IllegalArgumentException) con el mensaje adecuado. Si no puede realizar dicho movimiento, 
//debido a que el álfil se sale del tablero, debe lanzar una excepción del tipo OperationNotSupportedException con un 
//mensaje adecuado y no modificará la posición del alfil. Realiza un commit.





