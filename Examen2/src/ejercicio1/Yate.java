package ejercicio1;

public class Yate extends Deportiva{
	private int numCamarotes;
	
	public Yate() {
	super();
	this.numCamarotes=0;
}
	public Yate(int mat,int esc,int anyoFab,int potCV,int numCamar) {
	super(mat,esc,anyoFab,potCV);
	this.numCamarotes=numCamar;
}
	public int calcularAlquiler() {
		return super.calcularAlquiler()+this.numCamarotes;
		}
	
}
