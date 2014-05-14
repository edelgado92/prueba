package bolera;

public class TestJugador {

	public static void main(String[] args) 
	{
		//Instanciamos los objetos de la clase Jugador
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador("Elias",2000);
		Jugador jugador3 = new Jugador(jugador2);
		
		//Consultamos el nombre de los jugadores
		System.out.println("CONSULTAMOS EL NOMBRE DE LOS JUGADORES");
		System.out.println("Nombre jugador 1: "+jugador1.getNombre());
		System.out.println("Nombre jugador 2: "+jugador2.getNombre());
		
		System.out.println();
		
		//Modificamos el nombre de los jugadores
		System.out.println("MODIFICAMOS EL NOMBRE DE LOS JUGADORES");
		System.out.println("Modificamos el nombre del jugador 1.");
		jugador1.setNombre("Elias");
		
		System.out.println("Modificamos el nombre del jugador 2.");
		jugador2.setNombre("Flora");
		
		System.out.println();
		
		//Consultamos el nombre de los jugadores
		System.out.println("CONSULTAMOS EL NOMBRE DE LOS JUGADORES");
		System.out.println("Nombre jugador 1: "+jugador1.getNombre());
		System.out.println("Nombre jugador 2: "+jugador2.getNombre());
		
		System.out.println();
		
		//Consultamos la puntuacion de los jugadores
		System.out.println("CONSULTAMOS LA PUNTUACION DE LOS JUGADORES");
		System.out.println("Puntuacion jugador 1: "+jugador1.getPuntuacion());
		System.out.println("Puntuacion jugador 2: "+jugador2.getPuntuacion());
		
		System.out.println();
		
		//Modificamos la puntuacion de los jugadores
		System.out.println("MODIFICAMOS LA PUNTUACION DE LOS JUGADORES");
		System.out.println("Modificamos la puntuacion del jugador 1.");
		jugador1.setPuntuacion(1500);
		
		System.out.println("Modificamos la puntuacion del jugador 2.");
		jugador2.setPuntuacion(5000);
		
		System.out.println();
		
		//Consultamos la puntuacion de los jugadores
		System.out.println("CONSULTAMOS LA PUNTUACION DE LOS JUGADORES");
		System.out.println("Puntuacion jugador 1: "+jugador1.getPuntuacion());
		System.out.println("Puntuacion jugador 2: "+jugador2.getPuntuacion());
		
		System.out.println();
		
		//toString
		System.out.println("TOSTRING");
		System.out.println(jugador1.toString());
		System.out.println(jugador2.toString());
		
		System.out.println();
		
		//equals
		System.out.println("EQUALS");
		System.out.println("Comparamos el jugador 1 con el jugador 2: "+jugador1.equals(jugador2));
		
		System.out.println();
		
		//compareTo
		System.out.println("COMPARETO");
		System.out.println("Comparamos el jugador 1 con el jugador 2: "+jugador1.compareTo(jugador2));
		System.out.println("Comparamos el jugador 2 con el jugador 1: "+jugador2.compareTo(jugador1));
		
		System.out.println();
		
		//hashCode
		System.out.println("HASHCODE");
		System.out.println("hashCode del jugador 1: "+jugador1.hashCode());
		System.out.println("hashCode del jugador 2: "+jugador2.hashCode());
		
		System.out.println();
		
		//clone
		System.out.println("CLONE");
		System.out.println("Clonamos el jugador 1: "+jugador1.clone());
		System.out.println("Clonamos el jugador 2: "+jugador2.clone());
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("		PRUEBAS ADICIONALES");
		System.out.println("------------------------------------------------------------------");
		
		//Consultamos el nombre de los jugadores
		System.out.println("CONSULTAMOS EL NOMBRE DE LOS JUGADORES");
		System.out.println("Nombre jugador 1: "+jugador1.getNombre());
		System.out.println("Nombre jugador 2: "+jugador2.getNombre());
		System.out.println("Nombre jugador 3: "+jugador3.getNombre());
		
		System.out.println();
				
		//Modificamos el nombre de los jugadores
		System.out.println("MODIFICAMOS EL NOMBRE DE LOS JUGADORES");
		System.out.println("Modificamos el nombre del jugador 1.");
		jugador1.setNombre("Elias");
				
		System.out.println("Modificamos el nombre del jugador 2.");
		jugador2.setNombre("Flora");
				
		System.out.println();
				
		//Consultamos el nombre de los jugadores
		System.out.println("CONSULTAMOS EL NOMBRE DE LOS JUGADORES");
		System.out.println("Nombre jugador 1: "+jugador1.getNombre());
		System.out.println("Nombre jugador 2: "+jugador2.getNombre());
		System.out.println("Nombre jugador 3: "+jugador3.getNombre());
				
		System.out.println();
				
		//Consultamos la puntuacion de los jugadores
		System.out.println("CONSULTAMOS LA PUNTUACION DE LOS JUGADORES");
		System.out.println("Puntuacion jugador 1: "+jugador1.getPuntuacion());
		System.out.println("Puntuacion jugador 2: "+jugador2.getPuntuacion());
		System.out.println("Puntuacion jugador 3: "+jugador3.getPuntuacion());	
		
		System.out.println();
				
		//Modificamos la puntuacion de los jugadores
		System.out.println("MODIFICAMOS LA PUNTUACION DE LOS JUGADORES");
		System.out.println("Modificamos la puntuacion del jugador 1.");
		jugador1.setPuntuacion(1500);
				
		System.out.println("Modificamos la puntuacion del jugador 2.");
		jugador2.setPuntuacion(5000);
		
		System.out.println("Modificamos la puntuacion del jugador 3.");
		jugador3.setPuntuacion(1500);
				
		System.out.println();
				
		//Consultamos la puntuacion de los jugadores
		System.out.println("CONSULTAMOS LA PUNTUACION DE LOS JUGADORES");
		System.out.println("Puntuacion jugador 1: "+jugador1.getPuntuacion());
		System.out.println("Puntuacion jugador 2: "+jugador2.getPuntuacion());
		System.out.println("Puntuacion jugador 3: "+jugador3.getPuntuacion());	
		
		System.out.println();
				
		//toString
		System.out.println("TOSTRING");
		System.out.println(jugador1.toString());
		System.out.println(jugador2.toString());
		System.out.println(jugador3.toString());
				
		System.out.println();
				
		//equals
		System.out.println("EQUALS");
		System.out.println("Comparamos el jugador 1 con el jugador 2: "+jugador1.equals(jugador2));
		System.out.println("Comparamos el jugador 1 con el jugador 3: "+jugador1.equals(jugador3));
				
		System.out.println();
				
		//compareTo
		System.out.println("COMPARETO");
		System.out.println("Comparamos el jugador 1 con el jugador 2: "+jugador1.compareTo(jugador2));
		System.out.println("Comparamos el jugador 2 con el jugador 1: "+jugador2.compareTo(jugador1));
		System.out.println("Comparamos el jugador 1 con el jugador 3: "+jugador1.compareTo(jugador3));
				
		System.out.println();
				
		//hashCode
		System.out.println("HASHCODE");
		System.out.println("hashCode del jugador 1: "+jugador1.hashCode());
		System.out.println("hashCode del jugador 2: "+jugador2.hashCode());
		System.out.println("hashCode del jugador 3: "+jugador3.hashCode());
				
		System.out.println();
				
		//clone
		System.out.println("CLONE");
		System.out.println("Clonamos el jugador 1: "+jugador1.clone());
		System.out.println("Clonamos el jugador 2: "+jugador2.clone());
		System.out.println("Clonamos el jugador 3: "+jugador3.clone());
	}

}
