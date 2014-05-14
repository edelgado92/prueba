package examenMario;

/*Excepcion propia de la clase Ficha*/
public class FichaIncorrecta extends Exception {
	public FichaIncorrecta (String mensaje){
		super(mensaje);
	}
}
