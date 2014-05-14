package bolera;

public class TestBolera 
{

	public static void main(String[] args) 
	{
		//Instanciamos los objetos de la clase Bolera
		Bolera bolera1 = new Bolera();
		
		//Asignamos un jugador a una pista
		System.out.println("Asignar jugador a una pista: "+bolera1.asignarJugadorPista("Elias",500,1));
		System.out.println("Asignar jugador a una pista: "+bolera1.asignarJugadorPista("Alfonso",350,2));
		System.out.println("Asignar jugador a una pista: "+bolera1.asignarJugadorPista("Mario",700,3));
		System.out.println("Asignar jugador a una pista: "+bolera1.asignarJugadorPista("Jesus",210,4));
		System.out.println("Asignar jugador a una pista: "+bolera1.asignarJugadorPista("Pablo",320,5));
		System.out.println("Asignar jugador a una pista: "+bolera1.asignarJugadorPista("Pedro",550,6));
		System.out.println("Asignar jugador a una pista: "+bolera1.asignarJugadorPista("Antonio",120,7));
		System.out.println("Asignar jugador a una pista: "+bolera1.asignarJugadorPista("Adan",850,8));
		System.out.println("Asignar jugador a una pista: "+bolera1.asignarJugadorPista("Gonzaga",400,9));
		System.out.println("Asignar jugador a una pista: "+bolera1.asignarJugadorPista("Julio",600,10));
		System.out.println("Asignar jugador a una pista: "+bolera1.asignarJugadorPista("Miguel Angel",430,11));
		System.out.println("Asignar jugador a una pista: "+bolera1.asignarJugadorPista("Javi",220,12));
		
		//Consultamos un jugador
		System.out.println(bolera1.consultarJugador("Elias",1));
		System.out.println(bolera1.consultarJugador("Alfonso",2));
		System.out.println(bolera1.consultarJugador("Mario",3));
		System.out.println(bolera1.consultarJugador("Jesus",4));
		System.out.println(bolera1.consultarJugador("Pablo",5));
		System.out.println(bolera1.consultarJugador("Pedro",6));
		System.out.println(bolera1.consultarJugador("Antonio",7));
		System.out.println(bolera1.consultarJugador("Adan",8));
		System.out.println(bolera1.consultarJugador("Gonzaga",9));
		System.out.println(bolera1.consultarJugador("Julio",10));
		System.out.println(bolera1.consultarJugador("Miguel Angel",11));
		System.out.println(bolera1.consultarJugador("Javi",12));
	}
}
