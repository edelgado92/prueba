package examenMario;

/*Test de la clase Ficha*/
public class TestFicha {

	public static void main(String[] args) {

		Ficha f1=new Ficha();
		Ficha f2=new Ficha();
		Ficha f3=null;
		try {
			f3=new Ficha("Mario",3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Constructor por defecto de la ficha 1");
		System.out.println(f1.toString());
		System.out.println("Constructor por defecto de la ficha 2");
		System.out.println(f2.toString());
		System.out.println("Constructor con parametros de la ficha 3");
		System.out.println(f3.toString());
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Consulto las preguntas de la ficha 1");
		f1.cargarTest();
		f1.mostrarTest();
		
		System.out.println("Consulto la pregunta 1 de la ficha 1");
		try {
			System.out.println(f1.mostrarTest(1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Consulto si la ficha 1 pertenece a un admitido y su puntuacion total");
		System.out.println(f1.isSeleccionado());
		System.out.println(f1.getPuntuacion());
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Comparo ficha 1 y ficha 2 por numero");
		System.out.println(f1.compareTo(f2));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Comparo ficha 1 y ficha 2 por puntuacion");
		System.out.println(f1.compareToPuntuacion(f2));
	}//Fin main
}//Fin clase TestFicha
