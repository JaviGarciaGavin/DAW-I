package ejercicios;

public class Empleado extends Persona{
	private double salario;
	
public void mostrarDatos() {
	super.mostrarDatos();
	System.out.println("Salario: "+this.salario);
}}