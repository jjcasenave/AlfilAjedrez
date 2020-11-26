package org.iesalandalus.programacion.alfilajedrez;

public class Alfil 
{
	//atributos
	private Color color;
	private Posicion posicion;
	
	//métodos
	
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

//14.Crea un constructor para la clase que acepte como parámetro el color y que creará un alfil de 
//dicho color cuya posición será '1f' si es blanco o '8f' si es negro. Realiza un commit.

