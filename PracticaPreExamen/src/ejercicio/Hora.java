package ejercicio;

public class Hora {
private int hora,minuto,segundo;
	public Hora() {
		 this.hora=0;
		 this.minuto=0;
		 this.segundo=0;
	 }
	//Setters
	public void setHora(int hora) {
		if (hora <23)
		this.hora = hora;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	//Getters
	public int getMinuto() {
		return minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public int getHora() {
		return hora;
	}
	//---------------------------------------------------------
	public void mostrarDatos(){
		System.out.println("Hora: "+this.hora+"/"+this.minuto+"/"+this.segundo);
	}
	public void incSec (int sec) {
		this.segundo+=sec;
		if(this.segundo>=60) {
			this.segundo-=60;
			this.minuto++;
		}
		if(this.minuto>=60) {
			this.minuto-=60;
			this.hora++;
		}
	}
	
}
