package ejer6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
	String seguir = "si", nombre;
	char sillon;
	Scanner teclado=new Scanner(System.in);
	int anyo;
	boolean insertado;
	Academico aux;
	Map<Character, Academico> Academia=new HashMap<Character, Academico>();

	while (seguir.toUpperCase().compareTo("SI")==0) {
		
		System.out.println("Nombre del academico");
		nombre=teclado.next();
		//aux.setNombre(nombre);
		System.out.println("Año de su ingreso");
		anyo=teclado.nextInt();
	//	aux.setaIngreso(anyo);
	
		System.out.println("Letra de su sillon");
		sillon=teclado.next().charAt(0);
		
		aux=new Academico(nombre,anyo);
		Academia.put(sillon, aux);
		
		insertado=nuevoAcademico(Academia,aux,sillon);
		
	System.out.println("Desea continuar?");
	seguir=teclado.next();
}
	
	System.out.println(Academia);
}
private static boolean nuevoAcademico (Map<Character, Academico> academia, Academico aux, char sillon) {
	boolean confirmado;
	return false;
}
}
