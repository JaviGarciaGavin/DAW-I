package alquiler;

public class Velero extends Barco {
	private int numMastil;
	
	public Velero() {
		super();
	}

	public Velero(String matricula, int slora, int año, int numMastil) {
		super(matricula, slora, año);
		this.numMastil = numMastil;
	}

	public int getNumMastil() {
		return numMastil;
	}

	public void setNumMastil(int numMastil) {
		this.numMastil = numMastil;
	}
	
	public double calculaValor(int prBase) {
		double valor=0;
		valor=super.calculaValor(prBase)+this.numMastil;
		return (valor);
	}

	@Override
	public String toString() {
		return "Velero [numMastil=" + numMastil + ", getMatricula()=" + getMatricula() + ", getSlora()=" + getSlora()
				+ "]";
	}
	
}
