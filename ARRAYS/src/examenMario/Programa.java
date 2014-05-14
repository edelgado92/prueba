package examenMario;

import java.io.*;
import java.util.*;

public class Programa {

	/**
	 * Cabecera: void pintarMenu()
	 * Precondicion: No tiene
	 * Entrada: No tiene
	 * Salida: No tiene
	 * Postcondicion: No tiene
	 */
	public static void pintarMenu(){
		System.out.println("BIEVENIDO");
		System.out.println("1)Listar admitidos por numero de candidato, mostrando numero y puntuaciones");
		System.out.println("2)Listar admitidos por puntuaciones, mostrando nombre, numero y puntuaciones");
		System.out.println("3)Numero total de admitidos con mayor puntuacion, menor y la media");
		System.out.println("4)Persona con mayor puntuacion");
		System.out.println("0)SALIR");
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		Academia a1=new Academia();
		a1.cargarFichas();
		a1.cargarTestAcademia();
		
		//Inicio repetir mientras opcion diferente de 0
		do {
			//Inicio repetir mientras opcion menor que 0 o mayor que 4
			do {
				pintarMenu();
				opcion=teclado.nextInt();
				if (opcion<0 || opcion>4) {
					System.out.println("La opcion debe de estar entre 0 y 4");
				}
			} while (opcion<0 || opcion>4);
			//Fin repetir mientras opcion menor que 0 o mayor que 4
			//Inicio si opcion diferente de 0
			if (opcion!=0) {
				//Inicio segun opcion
				switch (opcion) {
				case 1:
						System.out.println("Caso 1: Sin implementar la ordenacion");
					break;
				case 2:
						System.out.println("Caso 2: Sin implementar la ordenacion");
					break;
				case 3:
					System.out.println("Numero total de admitidos");
					System.out.println(a1.totalAdmitidos());
					System.out.println("Nota mayor");
					System.out.println(a1.mayorPuntuacion());
					System.out.println("Nota menor");
					System.out.println(a1.menorPuntuacion());
					System.out.println("Nota media");
					System.out.println(a1.mediaPuntuacion());
					break;
				case 4:
					System.out.println("EL GRAN ELEGIDO DE LA ACADEMIA ES....");
					System.out.println(a1.personaElegida());
					break;
				}
				//Fin segun opcion
			}
			//Fin si opcion diferente de 0
		} while (opcion!=0);
		//Fin repetir mientras opcion diferente de 0
		System.out.println("Fin del programa");
	}//Fin main
}//Fin clase
