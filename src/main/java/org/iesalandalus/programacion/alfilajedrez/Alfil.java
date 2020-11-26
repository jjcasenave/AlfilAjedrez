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

//15.Crea un constructor para la clase que acepte como parámetros el color y la columna inicial. La columna inicial debe ser válida 
//(de lo contrario debe lanzar la excepción IllegalArgumentException con un mensaje adecuado) y creara un alfil del color dado y 
//colocado en dicha columna ('c' o 'f') y cuya fila será la 1 si es blanco y la 8 si es negro. Realiza un commit



