package ejercicio;

public class Persona extends Mamifero{
private String profesion;
	
	public Persona() {
		super();
		this.profesion="";
	}
	public Persona( String nomb,int numCria,int numHueso,int numExtremidades,String prof) {
		super(nomb ,numCria,numHueso,numExtremidades); 
		this.profesion=prof;
 }
	public void pedirDatos() {
		super.pedirDatos();
		System.out.println("Introduzca la profesión:");
		this.profesion=teclado.next();

	}
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Profesion: "+profesion);
	}	
}
