package ejercicio;
import java.util.Scanner;
public class Empleado {
	Scanner teclado=new Scanner(System.in);
	final static String  NOMEMP="Michelin";
	private String nombreE;
	private int edad;
	private int porcentajeInc;
	static double sueldoB=1000;
	 
	 public Empleado() {
		 System.out.println("Escriba el nombre del empleado/jefe");
		 this.nombreE=teclado.next();
		 System.out.println("Escriba la edad del empleado/jefe");
		 this.edad=teclado.nextInt();
		System.out.println("Escriba el porcentaje de incremento");
		 this.porcentajeInc=teclado.nextInt();
 }
	 
	    public double calcSueldo(){
		return (sueldoB+porcentajeInc); 
	 }
	 public void mostrarDatos() {
		 System.out.println("Nombre:"+ this.nombreE);
		 System.out.println("Edad:"+ this.edad); 
		 System.out.println("Sueldo : "+calcSueldo());
	 }
}
