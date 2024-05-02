package ejercicio;

public class Mamifero extends Animal {
	private int numeroHueso,numeroExtrmidades;
	public Mamifero() {
		super();
		this.numeroHueso=0;
		this.numeroExtrmidades=0;
	}
	public Mamifero( String nomb,int numCria,int numHueso,int numExtremidades) {
		super(nomb ,numCria); 
		this.numeroHueso=numHueso;
		this.numeroExtrmidades=numExtremidades;
 }
	public void pedirDatos() {
		super.pedirDatos();
		System.out.println("Introduzca el numero de husesos:");
		this.numeroHueso=teclado.nextInt();
		System.out.println("Introduzca el numero de extremidades:");
		this.numeroExtrmidades=teclado.nextInt(); 	
	}
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Nº Huesos: "+this.numeroHueso);
		System.out.println("Nº Extremidades:"+this.numeroExtrmidades);
	}	
	
}
