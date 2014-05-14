package unidimensionales;

import java.util.Random;

/*1. Dado un array cargado aleatoriamente, generar a partir de él otro array que contenga los elementos pares
 *  que se encuentran en el primero.*/

public class ArrayPares 
{

	public static void main(String[] args) 
	{
		//Creamos el array
		int[] miArray = new int[10]; //Se crea por defecto todos en 0 al ser numeros enteros.
		
		//Instanciamos la clase Random para generar numeros aleatorios
		Random aleatorio = new Random();
		
		//Cargamos el array aleatoriamente
		for(int i=0; i<miArray.length; i++)
		{
			miArray[i]=aleatorio.nextInt(10)+1;
		}
		
		//Pintamos el array en pantalla
		for(int i=0; i<miArray.length; i++)
		{
			System.out.print(miArray[i]+"|");
		}
		
		//Creamos esta variable para guardar el tamaño que va a tener nuestro array de numeros pares
		int tamanioPar=0;
		
		//Calculamos el tamaño de nuestro array par
		for(int i=0; i<miArray.length; i++)
		{
			if(miArray[i]%2==0)
			{
				tamanioPar++;
			}
		}
		
		//Salto de linea
		System.out.println();
		
		//Creamos el array par
		int[] miArrayPar = new int[tamanioPar];
		
		//Cargamos el array par con los numeros pares del otro array
		int cont=0;
		
		for(int i=0; i<miArray.length; i++)
		{
			if(miArray[i]%2==0)
			{
				miArrayPar[cont]=miArray[i];
				cont++;
			}
		}
		
		//Pintamos el arrray en pantalla
		for(int i=0; i<miArrayPar.length; i++)
		{
			System.out.print(miArrayPar[i]+"|");
		}
	}

}
