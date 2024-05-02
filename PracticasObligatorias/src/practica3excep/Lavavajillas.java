package practica3excep;

public class Lavavajillas extends LavadoraLavavajillas {
private int serviciosMax;
public Lavavajillas() {
	super();
	
}
public Lavavajillas(Calif calif , int consu,int consuMed ,int servicios) {
	super(calif,consu,consuMed);
	this.serviciosMax=servicios;
}

@Override
public String toString() {
	return "Lavavajillas \n Fechaderegistro="+fecha+"\n ServiciosMax=" + serviciosMax + "\n CodigoElectrodomestico=" + codigoElectrodomestico
			+ "\n CalifEner=" + califEner + "\n Consumo=" + consumo + "]";
}
public int getServiciosMax() {
	return serviciosMax;
}
public void setServiciosMax(int serviciosMax) {
	this.serviciosMax = serviciosMax;
}

}

