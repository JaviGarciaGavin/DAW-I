package ejercicio;
public class Empleados {
protected String nombre;
protected double sueldo;
public  Empleados() {
	this.nombre="";
	this.sueldo=0;
}		
public  Empleados(String nom, double suel) {
	this.nombre=nom;
	this.sueldo=suel;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getSueldo() {
	return sueldo;
}
public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}
	public void mostrarDatos() {
		System.out.println(this.nombre);
		System.out.println(this.sueldo);
}
}

