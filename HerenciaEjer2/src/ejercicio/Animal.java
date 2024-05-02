package ejercicio;
import java.util.Scanner;
public class Animal {
	private String nombre;
	private int numeroCrias;
	Scanner teclado=new Scanner(System.in);

	public Animal() {
		this.nombre="";
		this.numeroCrias=0;
	}
	
	public Animal(String nom, int numCria) {
		this.nombre=nom;
		this.numeroCrias =numCria;
	}
	
	public void pedirDatos() {
		System.out.println("Introduzca el nombre:");
		this.nombre=teclado.next();
		System.out.println("Introduzca el numero de crias:");
		this.numeroCrias=teclado.nextInt(); 	
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Crias: "+this.numeroCrias);
	}
	public void cerrarTeclado(){
		teclado.close();
	}
}
