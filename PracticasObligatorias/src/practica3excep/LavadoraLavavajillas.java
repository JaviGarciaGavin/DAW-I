package practica3excep;

public class LavadoraLavavajillas extends Electrodomestico{
private double consumoMedio;

public LavadoraLavavajillas() {
	
}
public LavadoraLavavajillas(Calif calif , int consu,int consuMed) {
	super(calif ,consu);
	this.consumoMedio=consuMed;
}


public double getConsumoMedio() {
	return consumoMedio;
}
public void setConsumoMedio(double consumoMedio) {
	this.consumoMedio = consumoMedio;
}
}
