package org.iesalandalus.programacion.alfilajedrez;

public class Alfil 
{
	//atributos
	private Color color;
	private Posicion posicion;
	
	//métodos
	
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

//12.Crea los métodos get y set para cada atributo con la visibilidad adecuada. Estos métodos siempre comprobarán la validez de los parámetros pasados 
//y si no son correctos deberá lanzar la excepción adecuada (NullPointerException o IllegalArgumentException) con el mensaje adecuado. Realiza un commit.