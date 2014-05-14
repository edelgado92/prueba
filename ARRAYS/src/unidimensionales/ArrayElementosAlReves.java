package unidimensionales;

import java.util.Random;

/*4. A partir de un array generar otro con los elementos al revés.*/

public class ArrayElementosAlReves 
{

	public static void main(String[] args) 
	{
		//Creamos el array
		int[] miArray = new int[10];	//Todos los elementos son 0 por defecto.
		
		//Instanciamos el objeto Random para generar numeros aleatorios
		Random aleatorio = new Random();
		
		//Cargamos el array con numeros aleatorios
		for (int i = 0; i < miArray.length; i++) 
		{
			miArray[i]=aleatorio.nextInt(10)+1;
		}
		
		//Pintamos el array
		System.out.println("ARRAY NORMAL: ");
		for (int i = 0; i < miArray.length; i++) 
		{
			System.out.print(miArray[i]+"|");
		}
		
		//Creamos el array para los elementos al reves
		int[] miArrayInverso = new int[10];
		
		int cont=0;
		
		//Cargamos el array con los elementos de miArray empezando por el ultimo elemento hasta el primero
		for (int i = miArray.length-1; i >= 0; i--) 
		{
				miArrayInverso[cont]=miArray[i];
				cont++;
		}
		
		//Pintamos el array inverso
		System.out.println("\n\nARRAY AL REVES: ");
		for (int i = 0; i < miArrayInverso.length; i++) 
		{
			System.out.print(miArrayInverso[i]+"|");
		}
	}

}
