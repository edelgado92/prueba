package bolera;

/**	----------------------------------------------------------------------------------------------
 * 										CLASE JUGADOR
 * 	----------------------------------------------------------------------------------------------
 * 
 * 	------------------------------------------------
 * 						ESTUDIO
 * 	------------------------------------------------
 * 	Propiedades:
 * 		nombre:		basica, cadena, consultable y modificable.
 * 		puntuacion:	basica, entero, consultable y modificable.
 * 
 * 	Funcionalidades:
 * 		toString
 * 		equals
 * 		compareTo
 * 		hashCode
 * 		clone
 * 
 * 	-------------------------------------------------
 * 						INTERFAZ
 * 	-------------------------------------------------
 * 		String getNombre()
 * 		void setNombre(String nombre)
 * 		int getPuntuacion()
 * 		void setPuntuacion(int puntuacion)
 * 		String toString()
 * 		boolean equals(Object o)
 * 		int compareTo(Jugador jugador)
 * 		int hashCode()
 * 		Jugador clone(Jugador jugador)
 */

public class Jugador implements Comparable <Jugador>, Cloneable
{
	//Propiedades
	private String nombre;
	private int puntuacion;
	
	//Constructor por defecto
	public Jugador()
	{
		nombre=" ";
		puntuacion=0;
	}
	
	//Constructor con parametros
	public Jugador(String nombre,int puntuacion)
	{
		this.nombre=nombre;
		this.puntuacion=puntuacion;
	}
	
	//Constructor de copia
	public Jugador(Jugador jugador)
	{
		this.nombre=jugador.nombre;
		this.puntuacion=jugador.puntuacion;
	}
	
	//Funcionalidades
	
		//Metodos consultables
		public String getNombre()
		{
			return nombre;
		}
		
		public int getPuntuacion()
		{
			return puntuacion;
		}
		
		//Metodos modificables
		public void setNombre(String nombre)
		{
			this.nombre=nombre;
		}
		
		public void setPuntuacion(int puntuacion)
		{
			this.puntuacion=puntuacion;
		}
		
		//toString
		/**	INTERFAZ
		 **************
		 *	Comentario:			este metodo devuelve el valor de las propiedades del objeto.
		 *	Signatura:			String toString()
		 *	Precondiciones:		no tiene.
		 *	Entradas:			no tiene.
		 *	Salidas:			una cadena.
		 *	Postcondiciones:	asociado al nombre devuelve el valor de las propiedades del objeto.
		 */
		public String toString()
		{
			return "Jugador:\t"+getNombre()+", "+getPuntuacion();
		}
		
		//equals
		/**	INTERFAZ
		 **************
		 *	Comentario:			este metodo compara dos objetos para comprobar si son iguales o no.
		 *	Signatura:			boolean equals(Object o)
		 *	Precondiciones:		no tiene.
		 *	Entradas:			un objeto.
		 *	Salidas:			un booleano.
		 *	Postcondiciones:	asociado al nombre devuelve TRUE si mi objeto y el objeto pasado como parametros
		 *						son iguales o FALSE si no lo son.
		 */
		public boolean equals(Object o)
		{
			boolean res=false;
			
			if (o != null && o instanceof Jugador) 
			{
				if (this.nombre==((Jugador) o).getNombre() && this.puntuacion==((Jugador) o).getPuntuacion()) 
				{
					res=true;
				}
			}
			
			return res;
		}
		
		//compareTo
		/**	INTERFAZ
		 **************
		 *	Comentario:			este metodo compara dos objetos para comprobar si son iguales, los compara
		 *						en funcion de su puntuacion.
		 *	Signatura:			int compareTo(Jugador jugador)
		 *	Precondiciones:		no tiene.
		 *	Entradas:			un objeto de tipo Jugador.
		 *	Salidas:			un numero entero.
		 *	Postcondiciones:	asociado al nombre devuelve 0 si los dos objetos son iguales, 1 si mi objeto tiene
		 *						una puntuacion superior al objeto pasado por parametros y -1 si mi objeto tiene una
		 *						puntuacion inferior al objeto pasado por parametros.
		 */
		public int compareTo(Jugador jugador)
		{
			int res=0;
			
			if (this.puntuacion>jugador.puntuacion) 
			{
				res=1;
			}
			else
			{
				if (this.puntuacion<jugador.puntuacion) 
				{
					res=-1;
				}
			}
			
			return res;
		}
		
		//hashCode
		/**	INTERFAZ
		 **************
		 *	Comentario:			este metodo devuelve el hashCode de un objeto.
		 *	Signatura:			int hashCode()
		 *	Precondiciones:		no tiene.
		 *	Entradas:			no tiene.
		 *	Salidas:			un numero entero.
		 *	Postcondiciones:	asociado al nombre devuelve el hashCode de un objeto.
		 */
		public int hashCode()
		{
			int hash=1;
						
			hash=hash*17+nombre.hashCode();
			hash=hash*17+puntuacion;
			
			return hash;
		}
		
		//clone
		/**	INTERFAZ
		 **************
		 *	Comentario:			este metodo clona un objeto. El clon es superficial.
		 *	Signatura:			Jugador clone(Jugador jugador)
		 *	Precondiciones:		no tiene.
		 *	Entradas:			no tiene.
		 *	Salidas:			un objeto de tipo Jugador.
		 *	Postcondiciones:	asociado al nombre devuelve el objeto clonado.
		 */
		public Jugador clone()
		{
			Jugador jugadorClonado=null;
			
			try 
			{
				jugadorClonado = (Jugador) super.clone();
			} catch (CloneNotSupportedException error) 
			{
				System.out.println("El objeto no se ha podido clonar");
			}
			
			return jugadorClonado;
		}
}
