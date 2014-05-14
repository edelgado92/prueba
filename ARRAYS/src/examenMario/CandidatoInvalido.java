package examenMario;

/*Excepcion propia de la clase Candidato*/
public class CandidatoInvalido extends Exception {
	public CandidatoInvalido (String mensaje){
		super(mensaje);
	}
}