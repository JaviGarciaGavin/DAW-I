package ejercicios;
import java.time.*;
public class Texto {
//Declaraciones
private String cadena;
final int LONGMAX;
private LocalDate fCreac;
private LocalDateTime ultModif;
static final String VOCALES="aáeéiíoóuú";

//Constructores
public Texto(int lon) {
	this.LONGMAX=lon;
	this.fCreac=LocalDate.now();
	this.ultModif=null;
}

//METODOS
//Añade un caracter/String al principio o al final
public void addFinale(char l) {
	if(this.LONGMAX>this.cadena.length()) {
		this.cadena=this.cadena+l;
		this.ultModif=LocalDateTime.now();
	}
}
public void addFinale(String l) {
	
}
public void addStart(String c) {

}
public void addStart(char c) {
	if(this.LONGMAX>this.cadena.length()) {
		this.cadena=c+this.cadena;
		this.ultModif=LocalDateTime.now();
	}
}
//Contara las vocales
public void vocalCounter() {
	
}
public boolean esVocal(char l) {
	boolean vocal=false;
	l=Character.toLowerCase(l);
	if(VOCALES.indexOf(l)!=-1){
		vocal=true;
	}
return(vocal);
}

//Mostrar Datos
public void mostrarDatos() {
	
	
}

}
