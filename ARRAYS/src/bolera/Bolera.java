package bolera;

import java.util.Arrays;

/*En una bolera de 12 pistas se celebra una competición de bolos. En dicha
competición participan 4 jugadores por pista, y para cada uno de ellos se almacena
su nombre y las puntuaciones de cada partida. Implementar un programa para
gestionar esta competición. Se desea ver en pantalla todos los datos de la
competición, la puntuación final de cada partida en cada pista, la máxima
puntuación de cada pista junto con los nombres de los ganadores.*/

/**	----------------------------------------------------------------------------------------------
 * 										CLASE BOLERA
 * 	----------------------------------------------------------------------------------------------
 * 
 * 	------------------------------------------------
 * 						ESTUDIO
 * 	------------------------------------------------
 * 	Propiedades:
 * 		jugadores:	basica, array de jugadores, consultable. El array es bidimensional [i] son los jugadores y [j] 
 * 					las pistas.
 * 
 * 	Funcionalidades:
 * 		asignarJugadorPista:				este metodo consiste en asignar jugadores a una pista.
 * 		consultarJugador:					este metodo recibe un nombre y una pista por parametros y devuelve los datos 
 * 											del jugador.
 * 		calcularMaximaPuntuacion:			consiste en calcular la maxima puntuacion de cada pista.
 * 		comprobarJugadorMaximaPuntuacion:	este metodo recibe por parametros la maxima puntuacion de cada pista y devuelve
 * 											el nombre del jugador.
 * 		toString:							este metodo devuelve el valor de las propiedades del objeto.
 * 
 * 	------------------------------------------------
 * 						INTERFAZ
 * 	------------------------------------------------
 * 		boolean asignarJugadorPista(String nombre, int pista)
 * 		Jugador consultarJugador(String nombre, int pista)
 * 		int calcularMaximaPuntuacion(int pista)
 * 		String comprobarJugadorMaximaPuntuacion(int maximaPuntuacion)
 * 		String toString()
 * 
 * @author Elias
 */

public class Bolera 
{
	//Propiedades
	private Jugador[][] jugadores;
	
	//Constructor por defecto
	public Bolera()
	{
		jugadores = new Jugador[4][12];
		
		for (int i = 0; i < jugadores.length; i++) 
		{
			for (int j = 0; j < jugadores.length; j++) 
			{
				jugadores[i][j] = new Jugador();
				
				/*jugadores[i][j].setNombre(" ");
				jugadores[i][j].setPuntuacion(0);*/
			}
		}
	}
	
	//Funcionalidades
	
		//asignarJugadorPista
		/**	INTERFAZ
		 **************
		 *	Comentario:			este metodo consiste en asignar jugadores a una pista.
		 *	Signatura:			boolean asignarJugadorPista(String nombre, int puntuacion, int pista)
		 *	Precondiciones:		no tiene.
		 *	Entradas:			una cadena y dos numeros enteros.
		 *	Salidas:			un booleano.
		 *	Postcondiciones:	asociado al nombre devuelve TRUE si el jugador se ha asignado a una pista correctamente
		 *						o FALSE si no se ha podido asignar.
		 */
		public boolean asignarJugadorPista(String nombre, int puntuacion, int pista)
		{
			boolean res=false;
			
			for (int i = 0; i < jugadores.length; i++) 
			{
				jugadores[i][pista-1].setNombre(nombre);
				jugadores[i][pista-1].setPuntuacion(puntuacion);
				
				res=true;
			}
			
			return res;
		}
	
		//consultarJugador
		/**	INTERFAZ
		 **************
		 *	Comentario:			este metodo recibe un nombre y una pista por parametros y 
		 *						devuelve los datos del jugador.
		 *	Signatura:			Jugador consultarJugador(String nombre, int pista)
		 *	Precondiciones:		no tiene.
		 *	Entrada
		 *s:			una cadena y un numero entero.
		 *	Salidas:			un objeto de tipo Jugador.
		 *	Postcondiciones:	asociado al nombre devuelve las propiedades del jugador.
		 */
		public Jugador consultarJugador(String nombre, int pista)
		{
			Jugador jugador = null;
			
			for (int i = 0; i < jugadores.length; i++) 
			{
				for (int j = 0; j < jugadores.length; j++) 
				{
					if (j==pista-1 && jugadores[i][j].getNombre()==nombre)
					{
						jugador=jugadores[i][j];
					}
				}
				
			}
			
			return jugador;
		}
		
		//calcularMaximaPuntuacion
		/**	INTERFAZ
		 **************
		 *	Comentario:			consiste en calcular la maxima puntuacion de cada pista.
		 *	Signatura:			int calcularMaximaPuntuacion(int pista)
		 *	Precondiciones:		no tiene.
		 *	Entradas:			un numero entero.
		 *	Salidas:			un numero entero.
		 *	Postcondiciones:	asociado al nombre devuelve la maxima puntuacion de la pista
		 *						que le pasamos por parametros.
		 */
		
		//comprobarJugadorMaximaPuntuacion
		/**	INTERFAZ
		 **************
		 *	Comentario:			este metodo recibe por parametros la maxima puntuacion de 
		 *						cada pista y devuelve el nombre del jugador.
		 *	Signatura:			String comprobarJugadorMaximaPuntuacion(int maximaPuntuacion)
		 *	Precondiciones:		no tiene.
		 *	Entradas:			un numero entero.
		 *	Salidas:			una cadena.
		 *	Postcondiciones:	asociado al nombre devuelve el nombre del jugador que tenga
		 *						la misma puntuacion que le pasamos por parametros.
		 */
		
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
			return "Bolera [jugadores=" + Arrays.toString(jugadores) + "]";
		}
}