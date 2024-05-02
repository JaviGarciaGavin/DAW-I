package ejer1;

import java.util.Scanner;

public class Deportivas extends Barco{

	private int CV;
	
	public Deportivas() {
	super();
	this.CV=CV;
	}
	
	public int getCV() {
		return CV;
	}


	public void setCV(int cV) {
		CV = cV;
	}


	public void pedirDatos() {
		super.pedirDatos();
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Numero de CV: ");
		this.CV=keyboard.nextInt();
	}
}
