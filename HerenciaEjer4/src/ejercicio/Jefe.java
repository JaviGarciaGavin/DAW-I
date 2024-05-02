package ejercicio;

public class Jefe extends Empleado{
	 static int plusJefe=250;
	private String depar;
	
	public Jefe() {
		super();
		System.out.println("¿Que departamento dirige este jefe");
		depar=teclado.next();
	}
	public double calcSueldo() {
		return(plusJefe+super.calcSueldo());
	}
	
	 public void mostrarDatos() {
		 super.mostrarDatos();
		 System.out.println("Departamento:"+ this.depar);
		 System.out.println("Sueldo de jefe"+ calcSueldo()); 
	 }
}
