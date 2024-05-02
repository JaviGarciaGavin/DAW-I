package ejercicio1;

public class Deportiva extends Barco{
	private int potenciaCV;
	public Deportiva() {
		super();
		this.potenciaCV=0;
	}
	public Deportiva(int mat,int esc,int anyoFab,int potCV) {
		super();
		this.potenciaCV=potCV;
	}	
	public int calcularAlquiler() {
		return super.calcularAlquiler()+this.potenciaCV;
		}
	
	//Getters y Setters
	public int getPotenciaCV() {
		return potenciaCV;
	}

	public void setPotenciaCV(int potenciaCV) {
		this.potenciaCV = potenciaCV;
	}
	
}
