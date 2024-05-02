package ejercicio;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner teclado=new Scanner (System.in);
	Jefes j1=new Jefes("Pepe",50,"Informatica","Ciberseguridad");
	Jefes j2=new Jefes("Antonio",50,"Informatica","Programacion");
	Empleados e3=new Empleados("Juan",50);
	Empleados e4=new Empleados("Ana",50);
	Empleados e5=new Empleados("Margarita",50);
	j1.mostrarDatos();
	j2.mostrarDatos();
	e3.mostrarDatos();
	e4.mostrarDatos();
	e5.mostrarDatos();

	teclado.close();
}
}
