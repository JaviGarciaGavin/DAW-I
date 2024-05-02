package ejer1;

import java.util.Scanner;

public class Alquiler {
	private String Nombre;
	private String DNI;
	private int numDias;
	int posAmarre[]=new int[2];
	//barco que lo ocupa
	private final int PR_BASE=15;
	
	public Alquiler() {
		this.Nombre=Nombre;
		this.DNI=DNI;
		this.numDias=numDias;
			
	}
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		this.DNI = dNI;
	}
	public int getNumDias() {
		return numDias;
	}
	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}
	
	public int getPR_BASE() {
		return PR_BASE;
	}
	
	public void pedirDatos() {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Datos del cliente y su alquiler:");
		System.out.println("Nombre: ");
		this.Nombre=keyboard.next();
		System.out.println("DNI: ");
		this.DNI=keyboard.next();
		System.out.println("Numero de dias del alquiler: ");
		this.numDias=keyboard.nextInt();
		
		System.out.println("Posicion X del amarre: ");
		posAmarre[0]=keyboard.nextInt();
		System.out.println("Posicion Y del amarre: ");
		posAmarre[1]=keyboard.nextInt();
		
		}
	public void calAlquiler() {
		
		int valAlquiler;
		Barco barco1Bar=new Barco();
		Veleros barco1Vel=new Veleros();
		Deportivas barco1Depor=new Deportivas();
		Yates barco1Yates=new Yates();
		

		valAlquiler=10*PR_BASE*barco1Bar.getEslora();
		
		System.out.println("El alquiler es de:" +valAlquiler);
	}
		
		
	
	
	

}
