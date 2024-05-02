package ejercicios;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio1 {
public static void main(String[] args) {
	File fichero;
	BufferedReader teclado=new BufferedReader (new InputStreamReader(System.in));
	String nombre;
	System.out.println("Introduce el nombre del fichero : ");
	try {
		nombre=teclado.readLine();
		fichero=new File(nombre);
		if (fichero.exists()) {
				System.out.println("El fichero existe");
				if (fichero.isFile()) {
				System.out.println(fichero.getName()+" es un fichero");
				}//If 2
				else {
				System.out.println(fichero.getName()+" es un directorio");
				}//Else 2
				}//If 1
		else {
			System.out.println(fichero.getPath()+" no existe");}
		}//Else 1
	
	catch(IOException e) {
	System.out.println("No existe el fichero");
	System.out.println(e.getMessage());
}
	finally {
		if(teclado!=null)
			try {
				teclado.close();
			}
		catch(IOException e) {
			System.out.println(e.getMessage());}	
	}
}
}
