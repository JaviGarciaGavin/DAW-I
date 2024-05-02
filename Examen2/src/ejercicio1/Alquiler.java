package ejercicio1;

public class Alquiler {
private String nombre,dni;
Barco bar;
private int numDias;
final int Pr_Base=15; 
int[] posicionAmarre=new int[2];

public Alquiler() {}
 public Alquiler(String nom,String dni,Object bar,int dias,int[] posicionAmarr) {
	this.nombre=nom;
	this.dni=dni;
	this.numDias=dias;
	this.posicionAmarre=posicionAmarr;
 }

public int calcularAlquiler() {;
int valAlquiler;
valAlquiler=10*Pr_Base*numDias;
return valAlquiler;
}

//GETTERS Y SETTERS

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public int getNumDias() {
	return numDias;
}
public void setNumDias(int numDias) {
	this.numDias = numDias;
}
public int[] getPosicionAmarre() {
	return posicionAmarre;
}
public void setPosicionAmarre(int[] posicionAmarre) {
	this.posicionAmarre = posicionAmarre;
}
public int getPr_Base() {
	return Pr_Base;
}

}
