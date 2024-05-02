package practica3excep;

public class Frigorifico extends Electrodomestico{
	private int cargaMaxi;
	
	public Frigorifico() {
		super();
	}
	public Frigorifico(Calif calif , int consu ,int cargMax) {
		super(calif,consu);
		this.cargaMaxi=cargMax;
	}
	
	
	@Override
	public String toString() {
		return "Frigorifico \n Fechaderegistro="+fecha+"\n CargaMaxi=" + cargaMaxi + "\n CodigoElectrodomestico=" + codigoElectrodomestico
				+ "\n CalifEner=" + califEner + "\n Consumo=" + consumo + "]";
	}
	public int getCargaMaxi() {
		return cargaMaxi;
	}
	public void setCargaMaxi(int cargaMaxi) {
		this.cargaMaxi = cargaMaxi;
	}
}
