package academia2014;

import java.util.Scanner;

/**	PSEUDOCODIGO GENERALIZADO
 *******************************
 *	Inicio PP
 *		Repetir
 *			cargarFichas
 *			presentarMenuElegirValidarOpcion
 *			si opcion no es salir
 *				segun(opcion)
 *					para opcion == 1
 *						listarAdmitidos
 *					para opcion == 2
 *						listarAdmitidosPorPuntuacion
 *					para opcion == 3
 *						totalAdmitidos
 *						mayorPuntuacion
 *						menorPuntuacion
 *						mediaPuntuaciones
 *					para opcion == 4
 *						personaElegida
 *				finSegun
 *			finSi
 *		Mientras no se desee salir
 *	Fin PP
 * 
 * @author edelgado
 *
 */

public class PrincipalAcademia 
{

	public static void main(String[] args) 
	{
		//Inicio PP
		int opcion=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("*********************************");
		System.out.println("* Academia Nacional de Policias *");
		System.out.println("*********************************\n");
		
		 	//Repetir
			do
			{
		 		//cargarFichas
		 		//presentarMenuElegirValidarOpcion
				System.out.println("1- Un listado con los numeros y puntuaciones de los candidatos admitidos, ordenado por numero de candidato.");
				System.out.println("2- Un listado con los nombres, numeros y puntuaciones de los aspirantes admitidos, ordenados por puntuaciones de mayor a menor.");
				System.out.println("3- El numero total de admitidos, mayor puntuacion, menor puntuacion y media de este conjunto");
				System.out.println("4- Quien es la persona elegida, que sera la que haya obtenido mayor puntuacion y en caso de empate la de mas experiencia laboral.");
				System.out.println("0- Salir del programa.");
				
				System.out.print("\nSu opcion es: ");
				opcion = teclado.nextInt();
				
		 		//si opcion no es salir
				if (opcion != 0)
				{
		 			//segun(opcion)
					switch(opcion)
					{
		 				//para opcion == 1
						case 1:
		 					//listarAdmitidos
							break;
		 				//para opcion == 2
						case 2:
		 					//listarAdmitidosPorPuntuacion
							break;
		 				//para opcion == 3
						case 3:
		 					//totalAdmitidos
		 					//mayorPuntuacion
		 					//menorPuntuacion
		 					//mediaPuntuaciones
							break;
		 				//para opcion == 4
						case 4:
		 					//personaElegida
							break;
		 			//finSegun
					}
				//finSi
				}
		 	//Mientras no se desee salir
			} while(opcion!=0);
		//Fin PP
		System.out.println("\nFin del programa!");
		System.out.println("Aplicacion desarrollada por Elias Delgado Parron. IES NERVION. Sevilla");
	}

}
