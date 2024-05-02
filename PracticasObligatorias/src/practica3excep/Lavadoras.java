package practica3excep;

public class Lavadoras extends LavadoraLavavajillas {
private int cargaMax;
public Lavadoras () {
	super();	
}
public Lavadoras (Calif calif , int consu,int consuMed ,int carga) {
	super(calif,consu,consuMed);
	this.cargaMax=carga;
}

public int getCargaMax() {
	return cargaMax;
}
public void setCargaMax(int cargaMax) {
	this.cargaMax = cargaMax;
}

@Override
public String toString() {
	return "Lavadora  \n Fechaderegistro="+fecha+"\n CargaMax=" + cargaMax + "\n CodigoElectrodomestico=" + codigoElectrodomestico + "\n CalifEner="
			+ califEner + "\n Consumo=" + consumo  ;
}
}
