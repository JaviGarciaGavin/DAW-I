package ejercicio;

import java.io.Serializable;

public class Academico implements Comparable,Serializable{
	private String nombre;
	private int aIngreso;
	
	public Academico() {
		this.nombre="";
		this.aIngreso=0;
	}
	
	public Academico(String nom, int aIng) {
		this.nombre=nom;
		this.aIngreso=aIng;
	}
	
	public int compareTo(Object ob) {
		int resul;
		Academico otroA=(Academico) ob;
		resul=this.nombre.compareTo(otroA.nombre);
		
		return resul;
	}
	
	@Override
		public String toString() {
			return "\nNombre=" + nombre + "\nAño de ingreso=" + aIngreso;
		}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getaIngreso() {
		return aIngreso;
	}
	public void setaIngreso(int aIngreso) {
		this.aIngreso = aIngreso;
	}


}
