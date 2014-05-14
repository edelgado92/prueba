package examenMario;

import java.util.Random;

/**
 * INTERFAZ DE LA CLASE FICHA
 * ---------------------------------------------------------------------
 * ATRIBUTOS
 * 		numero: basica, entero, consultable. 		Entero de 3 cifras entre 100 y 999
 * 		nombre: basica, cadena, consultable y modificable. 
 * 		aniosExp: basica, entero, consultable y modificable.
 * 		test: basica, array de enteros, consultable*. 			Tamaño 10 (Se realizara en subprogramas)
 * 		puntuacion: derivada, entero, consultable. 
 * 		seleccionado: derivada, booleano, consultable.
 * 
 * METODOS
 * 		
 * 
 * 		toString: metodo que nos mostrará una ficha
 * 		equals: metodo que nos dice si dos fichas son iguales o no
 * 		compareTo: metodo que nos compara dos fichas por su numero
 * 		compareToPuntuacion: metodo que nos compara dos fichas por su puntuacion 
 * 		clone: metodo que nos clona una ficha
 * 		hashCode: metodo que nos devuelve el codigo hash
 * INTERFAZ
 * 		int getNumero()
 * 		String getNombre()
 * 		int getAniosExp()
 * 		int getPuntuacion()
 * 		boolean isSeleccionado()
 * 		void mostrarTest()
 * 		int mostrarTest(int pregunta)
 * 
 * 		void setNombre(String nombre)
 * 		void setAniosExp(int aniosExp)
 * 		
 * 		
 * 
 * 		String toString()
 * 		boolean equals(Object o)
 * 		int compareTo(Ficha ficha)
 * 		int compareToPuntuacion(Ficha ficha)
 * 		Ficha clone()
 * 		int hashCode()
 * ---------------------------------------------------------------------
 * ---------------------------------------------------------------------
 */

public class Ficha implements Comparable<Ficha>{

	//Atributos
		private static int numeroGenerico=100; //Atributo statico para poder incrementar cada vez que se genere una ficha
	
		private int numero;
		private String nombre;
		private int aniosExp;
		private int []test;
		
	//Constructores
		public Ficha(){
			numero=numeroGenerico++;
			nombre="EMPTY";
			aniosExp=-1;
			test=new int [10];
		}
		
		public Ficha(String nombre, int aniosExp)throws FichaIncorrecta{
			if (aniosExp<0) {
				throw new FichaIncorrecta("Los años de experiencia no pueden ser menor que 0");
			}
			this.numero=numeroGenerico++;
			this.nombre=nombre;
			this.aniosExp=aniosExp;
			test=new int [10];
		}
	
	//Consultores
	
		public int getNumero(){
			return numero;
		}
	
		public String getNombre(){
			return nombre;
		}
	
		public int getAniosExp(){
			return aniosExp;
		}
	
		public int getPuntuacion(){
			int res=0;
			for (int i = 0; i < test.length; i++) {
				res=res+test[i];
			}
			return res;
		}
	
		public boolean isSeleccionado(){
			boolean admitido=false;
			int puntosSeccion=0;
			
			for (int i = 0; i <= 2 && admitido==false; i++) { //Compruebo las 3 primeras preguntas del test
				if (test[i]==1) {
					puntosSeccion++;
				}
				if (puntosSeccion==2) {
					admitido=true;
				}
			}
			puntosSeccion=0;
			for (int i = 3; i <=6 && admitido==false; i++) { //Compruebo las preguntas del test 4,5,6,7
				if (test[i]==1) {
					puntosSeccion++;
				}
				if (puntosSeccion==3) {
					admitido=true;
				}
			}
			puntosSeccion=0;
			
			for (int i = 7; i <test.length && admitido==false; i++) { //Compruebo las preguntas del test 8,9,10
				if (test[i]==1) {
					puntosSeccion++;
				}
				if (puntosSeccion==1) {
					admitido=true;
				}
			}
			return admitido;
		}//Fin metodo isSeleccionado
	
		//Modificadores
		public void setNombre(String nombre){
			this.nombre=nombre;
		}
		
		public void setAniosExp(int aniosExp)throws FichaIncorrecta{
			if (aniosExp<0) {
				throw new FichaIncorrecta("Los años de experiencia no pueden ser menor que 0");
			}
			this.aniosExp=aniosExp;
		}
		
		//Metodos mostrar test
		public void mostrarTest(){
			for (int i = 0; i < test.length; i++) {
				System.out.println(test[i]);
			}
		}
		
		
		public int mostrarTest(int pregunta)throws FichaIncorrecta{
			int nota=0;
			
			if (pregunta<0 || pregunta>10) {
				throw new FichaIncorrecta("Las preguntas solo van de la 1 a la 10");
			}
			nota=test[pregunta-1];
			return nota;
		}
		//Metodos
		/**
		 * Cabecera: void cargarTest()
		 * Comentario: Metodo que genera aleatoriamente la puntuacion de los test
		 * Precondicion: No tiene
		 * Entrada: No tiene
		 * Salida: No tiene
		 * Postcondicion: El estado del test habrá cambiado, ahora será 1 o 0 en cada casilla.
		 */
		public void cargarTest(){
			Random aleatorio=new Random();
			int nota=0;
			for (int i = 0; i < test.length; i++) {
				nota=aleatorio.nextInt(2);
				test[i]=nota;
			}
		}
	
		//Metodos sobreescritos 
		/**
		 * Cabecera: String toString()
		 * Comentario: Metodo que nos muestra una ficha
		 * Precondicion: No tiene
		 * Entrada: No tiene
		 * Salida: 1 cadena
		 * Postcondicion: Obtendremos asociado al nombre 1 cadena con el estado de la ficha
		 */
		public String toString(){
			String res="Numero: "+getNumero()+"\tNombre: "+getNombre()+"\tAños Exp: "+getAniosExp()
					+"\tSeleccionado: "+isSeleccionado()+"\tPuntuacion: "+getPuntuacion();
			return res;
		}
		/**
		 * Cabecera: boolean equals(Object o)
		 * Comentario: Metodo que nos dice si dos fichas son o no iguales
		 * Precondicion: No tiene
		 * Entrada: 1 objeto
		 * Salida: 1 booleano
		 * Postcondicion: Obtendremos asociado al nombre 1 booleano que nos indicara si 1 objeto ficha es igual a una ficha
		 * Nos basaremos en su numero, nombre y años de experiencia
		 */
		public boolean equals(Object o){
			boolean res=false;
				
				if (o!=null && o instanceof Ficha) {

					if (this.numero==((Ficha) o).getNumero()&& this.nombre==((Ficha) o).getNombre()
							&& this.aniosExp==((Ficha) o).getAniosExp()) {
						res=true;
					}
				}
			
			return res;
		}
	
		/**
		 * Cabecera: int compareTo(Ficha ficha)
		 * Comentario: Metodo que compara dos fichas basandose en el numero de candidato
		 * Precondicion: No tiene
		 * Entrada: 1 ficha
		 * Salida: 1 entero
		 * Postcondicion: Obtendremos asociado al nombre 1 entero que nos dirá 0 si son iguales
		 * 																	1 si la ficha que llama es mayor
		 * 																	-1 si la ficha que entra es menor
		 */
		public int compareTo(Ficha ficha){
			int res=0;
				if (this.numero>ficha.numero) {
					res=1;
				}else {
					if (this.numero<ficha.numero) {
						res=-1;
					}
				}
				
			return res;
		}
		
		/**
		 * Cabecera: int compareToPuntuacion (Ficha ficha)
		 * Comentario: Metodo que compara dos fichas basandose en la puntuacion
		 * Precondicion: No tiene
		 * Entrada: 1 ficha
		 * Salida: 1 entero
		 * Postcondicion: Obtendremos asociado al nombre 1 entero que nos dirá 0 si son iguales
		 * 																	1 si la puntuacion que llama es mayor
		 * 																	-1 si la puntuacion que entra es menor
		 */
		public int compareToPuntuacion(Ficha ficha){
			int res=0;
				if (this.getPuntuacion()>ficha.getPuntuacion()) {
					res=1;
				}else {
					if (this.getPuntuacion()<ficha.getPuntuacion()) {
						res=-1;
					}
				}
			return res;
		}
	
		
		/**
		 * Cabecera: int hashCode()
		 * Comentario: Metodo que nos devuelve el codigo hash del objeto
		 * Precondicion: No tiene
		 * Entrada: No tiene
		 * Salida: 1 entero
		 * Postcondicion: Obtedndremos asociado al nombre el codigo hash del objeto
		 */
		public int hashCode(){
			int res=1;
				res=res+13*this.numero;
				res=res+17*this.nombre.hashCode();
				res=res+31*this.aniosExp;
			return res;
		}

}//Fin de la clase Ficha
