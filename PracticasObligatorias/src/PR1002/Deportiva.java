package alquiler;

public class Deportiva extends Barco {
	private int potencia;
	
	public Deportiva() {
		super();
	}
	
	public Deportiva(String matricula, int slora, int año, int potencia) {
		super(matricula, slora, año);
		this.potencia = potencia;
	}


	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public double calculaValor(int prBase) {
		double valor=0;
		valor=super.calculaValor(prBase)+this.potencia;
		return (valor);
	}

	@Override
	public String toString() {
		return "Deportiva [potencia=" + potencia + ", getMatricula()=" + getMatricula() + ", getSlora()=" + getSlora()
				+ "]";
	}

	
	
}
