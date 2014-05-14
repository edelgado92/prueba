package examenMario;

/*Test propio de la clase Academia*/
public class TestAcademia {

	public static void main(String[] args) {
		Academia a1=new Academia();
		a1.cargarFichas();
		System.out.println("Consultamos la academia 1 sus fichas");
		a1.consultarFichas();
		a1.cargarTestAcademia();
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Probamos el metodo total admitidos");
		System.out.println(a1.totalAdmitidos());
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Probamos el metodo nota mas alta");
		System.out.println(a1.mayorPuntuacion());
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Probamos el metodo nota mas baja");
		System.out.println(a1.menorPuntuacion());
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Probamos el metodo nota media");
		System.out.println(a1.mediaPuntuacion());
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Probamos el metodo persona elegida");
		System.out.println(a1.personaElegida()); //Sale empty porque ninguno tiene nombre pero claramente es el elegido.
	}//Fin main
}//Fin clase
