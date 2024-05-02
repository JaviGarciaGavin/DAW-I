package alquiler;

public class Yate extends Deportiva {	
	private int numCamarotes;
		
	public Yate() {
		super();
	}
		
	public Yate(String matricula, int slora, int año, int potencia, int numCamarotes) {
		super(matricula, slora, año, potencia);
		this.numCamarotes = numCamarotes;
	}


	public int getNumCamarotes() {
		return numCamarotes;
	}
	public void setNumCamarotes(int numCamarotes) {
		this.numCamarotes = numCamarotes;
	}
	
	public double calculaValor(int prBase) {
		double valor=0;
		valor=super.calculaValor(prBase)+this.numCamarotes;
		return (valor);
	}

	@Override
	public String toString() {
		return "Yate [numCamarotes=" + numCamarotes + ", getPotencia()=" + getPotencia() + ", getMatricula()="
				+ getMatricula() + ", getSlora()=" + getSlora() + "]";
	}

	
	
}
