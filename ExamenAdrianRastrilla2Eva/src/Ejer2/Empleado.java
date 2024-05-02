package Ejer2;

public class Empleado {
	
	private static String Empresa;
	//dni
	private String nombre,ciudad;
	private int dia, mes, año;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	
	public void calculaEdad() {
		int edadEmpleado;
		edadEmpleado=2024-this.año;
		System.out.println("La edad del empleado es: "+edadEmpleado);
	}

}
