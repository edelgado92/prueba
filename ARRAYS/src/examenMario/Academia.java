package examenMario;

import java.util.Arrays;

/**
 * CLASE ACADEMIA INTERFA
 * 
 * 		ATRIBUTOS
 * 			fichas: basica, array de tipo Ficha, consultable*. Tamaño 40.
 * 
 * 		METODOS
 * 			cargarFichas: metodo que carga las fichas de una academia
 * 			consultarFichas: metodo que nos muestra las fichas de una academia
 * 			cargarTestFicha: metodo que nos carga el test de una ficha.
 * 			cargarTestAcademia: metodo que nos carga los test de la academia.
 * 			listadoNumeroPuntuaciones: metodo que nos ordena a los admitidos por numero de candidato mostrando sus numeros y puntuaciones
 *			listadoNombres: metodo que nos ordena por puntuacion a los admitidos nos mostrara los nombres numeros y puntuaciones  
 *			totalAdmitidos: metodo que nos muestra el numero total de admitidos
 *			mayorPuntuacion: metodo que nos muestra la mayor puntuacion sacada por un candidato.
 *			menorPuntuacion: metodo que nos muestra la menor puntuacion sacada por un candidato.
 *			mediaPuntuacion: metodo que nos muestra la puntuacion media sacada por un candidato.
 *			personaElegida: metodo que nos muestra la persona con mayor putuacion y en caso de empate la de mayor experiencia.
 *		
 *		INTERFAZ
 *			void cargarFichas()
 *			void consultarFichas()
 *			void cargarTestFicha(int candidato)
 *			void cargarTestAcademia()
 * 			Ficha[] listadoNumeroPuntuaciones()
 * 			Ficha[] listadoNombres()
 * 			int totalAdmitidos()
 * 			int mayorPuntuacion()
 * 			int menorPuntuacion()
 * 			double mediaPuntuacion()
 *			String personaElegida()
 */
public class Academia {

	//Atributos
		private Ficha[]fichas;
	
	//Constructor por defecto
		public Academia(){
			fichas=new Ficha[40];
		}
	//Metodo cargar
		/**
		 * Comentario: metodo que nos carga las fichas de una academia
		 * Cabecera: void cargarFichas()
		 * Precondicion: no tiene
		 * Entrada: no tiene
		 * Salida: no tiene
		 * Postcondicion: El estado de la academia habra cambiado. Tendremos 40 fichas creadas por defecto
		 */
		public void cargarFichas(){
			for (int i = 0; i < fichas.length; i++) {
				fichas[i]=new Ficha();
			}			
		}//Fin metodo cargarFichas
		
	//Metodo consultarFichas
		/**
		 * Comentario: metodo que nos muestra las fichas de una academia
		 * Cabecera: void consultarFichas()
		 * Precondicion: No tiene
		 * Entrada: No tiene
		 * Salida: No tiene
		 * Postcondicion: EL estado de la academia no habra cambiado
		 */
		public void consultarFichas(){
			for (int i = 0; i < fichas.length; i++) {
				System.out.println(fichas[i].toString());
			}
		}
	
	//Metodo cargarTestFicha
		/**
		 * Comentario: Metodo que nos carga el test de una ficha concreta
		 * Cabecera: void cargarTestFicha(int candidato)
		 * Precondicion: No tiene
		 * Entrada: 1 entero
		 * Salida: No tiene
		 * Postcondicion: El test del candidato estará relleno aleatoriamente
		 */
		public void cargarTestFicha(int candidato)throws CandidatoInvalido{
			if (candidato<1 || candidato>40) {
				throw new CandidatoInvalido("El numero de candidatos es entre 1 y 40");
			}
			fichas[candidato-1].cargarTest();
		}
	//Metodo cargarTestAcademia
		/**
		 * Comentario: Metodo que nos carga el test de una academia
		 * Cabecera: void cargarTestAcademia()
		 * Precondicion: No tiene
		 * Entrada: No tiene
		 * Salida: No tiene
		 * Postcondicion: El test de los candidatos de la academia estará relleno aleatoriamente
		 */
		public void cargarTestAcademia(){
			for (int i = 0; i < fichas.length; i++) {
				fichas[i].cargarTest();
			}
		}
		
	//Metodo listadoNumeroPuntuaciones
		/**
		 * Cabecera:Ficha[] listadoNumeroPuntuaciones()
		 * Comentario:metodo que nos da un listado de los candidatos admitidos con numero y puntuacion
		 * Precondicion: No tiene
		 * Entrada: No tiene
		 * Salida: 1 array de Ficha
		 * Postcondicion: El array estara cargado y ordenado
		 */
		 	public	Ficha[] listadoNumeroPuntuaciones(){
		 		Ficha[]ordenado=new Ficha[40];
		 		int fila=0;
		 			for (int i = 0; i < fichas.length; i++) {
						if (fichas[i].isSeleccionado()==true) {
						ordenado[fila]=fichas[i];
								fila++;
						}
					} 			
		 			//Sin ordenar
		 		return ordenado;
		 	}
		 	
		 /**
		  * Cabecera: Ficha[] listadoNombres()
		  * Comentario: metodo que nos ordena por puntuacion a los admitidos nos mostrara los nombres numeros y puntuaciones  
		  * Precondicion: No tiene
		  * Entrada: No tiene
		  * Salida: 1 array de ficha
		  * Postcondicion: El array estara cargado y ordenado
		  */
		 	public	Ficha[] listadoNombres(){
		 		Ficha[]ordenado=new Ficha[40];
		 		int fila=0;
		 			for (int i = 0; i < fichas.length; i++) {
						if (fichas[i].isSeleccionado()==true) {
						ordenado[fila]=fichas[i];
								fila++;
						}
					} 			
		 			//Sin ordenar
		 		return ordenado;
		 	}
		 	/**
		 	 * Cabecera: int totalAdmitidos()
		 	 * Comentario: metodo que nos dice cuantos solicitantes han sido admitidos
		 	 * Precondicion: No tiene
		 	 * Entrada: No tiene
		 	 * Salida: 1 entero
		 	 * Postcondicion: Obtendremos asociado al nombre 1 entero que nos indicará el numero de admitidos
		 	 */
		 	
		 	public int totalAdmitidos(){
		 		int res=0;
		 			for (int i = 0; i < fichas.length; i++) {
						if (fichas[i].isSeleccionado()==true) {
							res++;
						}
					}
		 		return res;
		 	}
		 	
		 	/**
		 	 * Cabecera: int mayorPuntuacion()
		 	 * Comentario: metodo que nos dice la mayor puntuacion de la academia
		 	 * Precondicion: No tiene
		 	 * Entrada: No tiene
		 	 * Salida: 1 entero
		 	 * Postcondicion: Obtendremos asociado al nombre 1 entero que nos dira la mayor nota que ha habido en la academia
		 	 */
		 	public int mayorPuntuacion(){
		 		int res=0;
		 			for (int i = 0; i < fichas.length; i++) {
		 				if (fichas[i].getPuntuacion()>res) {
							res=fichas[i].getPuntuacion();
						}
					}
		 		return res;
		 	}
		 	
		 	/**
		 	 * Cabecera: int menorPuntuacion()
		 	 * Comentario: metodo que nos dice la menor puntuacion de la academia
		 	 * Precondicion: No tiene
		 	 * Entrada: No tiene
		 	 * Salida: 1 entero
		 	 * Postcondicion: Obtendremos asociado al nombre 1 entero que nos dira la menor nota que ha habido en la academia
		 	 */
		 	public int menorPuntuacion(){
		 		int res=10;
		 			for (int i = 0; i < fichas.length; i++) {
		 				if (fichas[i].getPuntuacion()<res) {
							res=fichas[i].getPuntuacion();
						}
					}
		 		return res;
		 	}
		 	
		 	/**
		 	 * Cabecera: double mediaPuntuacion()
		 	 * Comentario: metodo que nos dice la media puntuacion de la academia
		 	 * Precondicion: No tiene
		 	 * Entrada: No tiene
		 	 * Salida: 1 double
		 	 * Postcondicion: Obtendremos asociado al nombre 1 double que nos dira la media nota que ha habido en la academia
		 	 */
		 	public double mediaPuntuacion(){
		 		double res=0;
		 			for (int i = 0; i < fichas.length; i++) {
		 				res=res+fichas[i].getPuntuacion();
					}
		 			res=res/fichas.length;
		 		return res;
		 	}
		 	
		 	/**
		 	 * Cabecera: String personaElegida()
		 	 * Comentario: metodo que nos dice el nombre de la persona con mayor puntuacion y en caso de empate la de mayor experiencia
		 	 * Precondicion: No tiene
		 	 * Entrada: No tiene
		 	 * Salida: No tiene
		 	 * Postcondicion: No tiene
		 	 */
		 	
		 	public String personaElegida(){
		 		String res="";
		 		int exp=0;
		 		int punt=0;
		 		
		 		for (int i = 0; i < fichas.length; i++) {
					if (fichas[i].getPuntuacion()>punt) {
						res=fichas[i].getNombre();
						exp=fichas[i].getAniosExp();
					}else {
						if (fichas[i].getPuntuacion()==punt && exp<fichas[i].getAniosExp()) {
							res=fichas[i].getNombre();
							exp=fichas[i].getAniosExp();
						}
					}
				}
		 		return res;
		 	}
}//Fin de la clase Academia
