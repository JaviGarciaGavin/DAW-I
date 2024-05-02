package ejercicio1;

public class Barco extends Alquiler{
private int matricula,esclora,anyoFabricacion;
public Barco(){
	super();
	this.matricula=0;
	this.esclora=0;
	this.anyoFabricacion=0;
}
public Barco(int mat,int esc,int anyoFab) {
	this.matricula=mat;
	this.esclora=esc;
	this.anyoFabricacion=anyoFab;
}

//Metodo para calcular el alquiler de un barco en general
public int calcularAlquiler() {
return super.calcularAlquiler()*this.esclora;
}


//Matricula
public int getMatricula() {
	return matricula;
}
public void setMatricula(int matricula) {
	this.matricula = matricula;
}
//Esclora
public int getEsclora() {
	return esclora;
}
public void setEsclora(int esclora) {
	this.esclora = esclora;
}
//AnyoFabricacion
public int getAnyoFabricacion() {
	return anyoFabricacion;
}
public void setAnyoFabricacion(int anyoFabricacion) {
	this.anyoFabricacion = anyoFabricacion;
}




}
