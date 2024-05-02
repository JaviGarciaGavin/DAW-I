package ejercicios;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Ejercicio2 {
public static void main(String[] args) {
	File fichero;
	BufferedReader teclado=new BufferedReader (new InputStreamReader(System.in));
	Scanner entry=new Scanner(System.in);
	String nombre;
	String user="s";
	
	while(user.contains("s")==true) {
	try {
		System.out.println("Introduce el nombre del fichero : ");
		nombre=teclado.readLine();
		fichero=new File(nombre);
		if (fichero.exists()) {
				System.out.println(fichero.getPath()+" este fichero existe");
		}//If
		else {
			System.out.println(fichero.getPath()+" no existe");}
		}//Else 1
	catch(IOException e) {
	System.out.println(e.getMessage());
}
	System.out.println("¿Deseas continuar?(s/n)");
	user=entry.next();
	}//While
	

}
}