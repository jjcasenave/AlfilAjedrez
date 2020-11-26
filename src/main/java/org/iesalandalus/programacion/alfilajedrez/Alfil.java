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

//13.Crea un constructor por defecto para esta clase que cree un alfil negro en la posición '8f'. Realiza un commit.