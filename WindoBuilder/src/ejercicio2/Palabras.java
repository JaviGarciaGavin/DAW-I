package ejercicio2;

public class Palabras {
String[] palabras= {"pollo","pallo","mocos","tomos"};


public String aleatorio() {
	int aleatorio=(int) (Math.floor(Math.random()*(palabras.length-1)));
	return palabras [aleatorio];
}
}
