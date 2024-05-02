package ejercicio1;

public class Velero extends Barco{
int numMastiles;
	public Velero() {
	super();
	this.numMastiles=0;
}
	public Velero(int mat,int esc,int anyoFab,int numMast) {
	super(mat,esc,anyoFab);
	this.numMastiles=numMast;
}
	public int calcularAlquiler() {
		return super.calcularAlquiler()+this.numMastiles;
		}
}
