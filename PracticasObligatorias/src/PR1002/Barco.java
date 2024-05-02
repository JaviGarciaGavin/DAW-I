package alquiler;

public class Barco {
	private String matricula;
	private int slora;
	private int año;
	private final int PRBASE=15;
	
	
	public Barco(String matricula, int slora, int año) {
		this.matricula = matricula;
		this.slora = slora;
		this.año = año;
	}
	
	public Barco() {
		this.matricula="";
	}


	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getSlora() {
		return slora;
	}
	public void setSlora(int slora) {
		this.slora = slora;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	
	public double calculaValor(int prBase) {
		final int FACTOR=10; 
		double valor=0;
		valor=this.slora*FACTOR*prBase;
		return (valor);
	}

	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", slora=" + slora + ", año=" + año + ", PRBASE=" + PRBASE + "]";
	}
	
	
}
