package ejercicio2;

public class Empleado {
static String empresa="Square";
private Dni Documento;
private String nombre,ciudad;
private int dia,mes,anyo;

public Empleado() {
	this.nombre="";
	this.ciudad="";
	this.dia=0;
	this.mes=0;
	this.anyo=0;
}
public Empleado(String nom,String ciu,int d,int m,int a) {
	this.nombre=nom;
	this.ciudad=ciu;
	this.dia=d;
	this.mes=m;
	this.anyo=a;
}

//Getters and Setters
public static String getEmpresa() {
	return empresa;
}
public static void setEmpresa(String empresa) {
	Empleado.empresa = empresa;
}
public Dni getDocumento() {
	return Documento;
}
public void setDocumento(Dni documento) {
	Documento = documento;
}
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
public int getAnyo() {
	return anyo;
}
public void setAnyo(int anyo) {
	this.anyo = anyo;
}}
