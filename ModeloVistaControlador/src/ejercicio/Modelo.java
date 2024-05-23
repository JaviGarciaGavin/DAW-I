package ejercicio;

public class Modelo {	
	String [] palabras = {"pollo","perra","carco","julian","pedro","Gato"};
	
	public String aleatorio() {
		int aleatorio=(int)(Math.floor(Math.random()*(palabras.length-1)));
		return palabras[aleatorio];
	}
}
