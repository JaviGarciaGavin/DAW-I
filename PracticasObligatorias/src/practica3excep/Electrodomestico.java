package practica3excep;
import java.time.LocalDate;
public class Electrodomestico {
protected LocalDate fecha;
static int codigos=0;
protected int codigoElectrodomestico=0;
protected Calif califEner;
protected int consumo; 
//Creamos un constructor por defecto
public Electrodomestico() {
	this.fecha=LocalDate.now();
	Electrodomestico.codigos++;
	this.codigoElectrodomestico=Electrodomestico.codigos;
}
//Creamos un constructor enviando datos
public Electrodomestico (Calif calif , int consu ) {
	this.fecha=LocalDate.now();
	Electrodomestico.codigos++;
	this.codigoElectrodomestico=Electrodomestico.codigos;
	this.califEner= calif;
	this.consumo=consu;
	
}
public int getCodigoElectrodomestico() {
	return codigoElectrodomestico;
}
public void setCodigoElectrodomestico(int codigoElectrodomestico) {
	this.codigoElectrodomestico = codigoElectrodomestico;
}
public Calif getCalifEner() {
	return califEner;
}
public void setCalifEner(Calif califEner) {
	this.califEner = califEner;
}
public int getConsumo() {
	return consumo;
}
public void setConsumo(int consumo) {
	this.consumo = consumo;
}

}

