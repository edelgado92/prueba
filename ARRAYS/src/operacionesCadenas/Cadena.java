package operacionesCadenas;

import java.util.Arrays;

/*Realizar un estudio de interfaz e implementar una clase Cadena con las
funcionalidades vistas en clase de la clase String de Java y cualesquiera otras que
consideres interesantes. Por ejemplo:
a. Invertir una cadena
b. Transformar una cadena en ella misma pero cambiando por mayúscula su
primer carácter.
c. Eliminar todos los espacios en blanco de una cadena de caracteres.
d. Formar los plurales de palabras (Añadir s si acaba en vocal y es si acaba
en consonante.)*/

/**	CLASE CADENA
 ****************************************************************************************
 *	
 *	ESTUDIO
 *************
 *	Propiedades:
 *		cadena:		basica, array de cadenas, consultable y modificable.
 *		tamanio:	basica, entero y consultable.
 *
 *	Funcionalidades:
 *		invertirCadena:		consiste en invertir la cadena de cada posicion del array.
 *		transformarCadena:	consiste en transformar la cadena de cada posicion del array
 *							en ella misma pero cambiando por mayuscula su primer caracter.
 *		eliminarEspacios:	consiste en eliminar todos los espacios en blanco de la cadena
 *							de cada posicion del array.
 *		formarPlurales:		consiste en formar plurales con la cadena de cada posicion del
 *							array.
 * 
 * 	INTERFAZ
 **************
 *	Metodos consultables:
 *		int getTamanio()
 *
 *	Funcionalidades:
 *		String consultarElemento(int posicion)
 *		boolean modificarElemento(int posicion, String elementoNuevo)
 *		boolean eliminarElemento(int posicion)
 *		String invertirCadena(String cadena)
 *		String transformarCadena(String cadena)
 *		String eliminarEspacios(String cadena)
 *		String formarPlurales(String cadena)
 *
 * @author Elias
 *
 */

public class Cadena 
{
	//Propiedades
	private String[] cadena;
	private int tamanio;
	
	//Constructor por defecto
	public Cadena()
	{
		tamanio=1;
		cadena = new String[tamanio];
		
		//Recorremos el array para darle valores por defecto
		for (int i = 0; i < cadena.length; i++) 
		{
			cadena[i]="";
		}
	}
	
	//Constructor con parametros
	public Cadena(int tamanio)
	{
		this.tamanio=tamanio;
		this.cadena=new String[this.tamanio];
		
		//Recorremos el array para darle valores por defecto
		for (int i = 0; i < cadena.length; i++) 
		{
			cadena[i]="";
		}
	}
	
	//Constructor de copia
	public Cadena(Cadena miCadena)
	{
		this.tamanio=miCadena.tamanio;
		this.cadena=miCadena.cadena;
	}
	
	//Metodos consultables
	public int getTamanio() 
	{
		return tamanio;
	}
	
	//Funcionalidades

	//invertirCadena
	/**	INTERFAZ
	 **************
	 *	Comentario:			consiste en invertir la cadena de cada posicion del array.
	 *	Signatura:			String invertirCadena(String cadena)
	 *	Precondiciones:		no tiene.
	 *	Entradas:			una cadena.
	 *	Salidas:			una cadena.
	 *	Postcondiciones:	asociado al nombre devuelve la cadena invertida.
	 */
	public String invertirCadena(String cadena)
	{
		String res="";
		
		for (int i = cadena.length()-1; i >= 0; i--) 
		{
			res=res+cadena.charAt(i);
		}
		
		return res;
	}
}
