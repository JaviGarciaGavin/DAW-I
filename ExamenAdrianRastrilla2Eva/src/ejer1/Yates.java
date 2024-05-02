package ejer1;

import java.util.Scanner;

public class Yates extends Deportivas{
	
	private int numCamarotes;
	
	public Yates() {
		super();
		this.numCamarotes=numCamarotes;
	}
	
	public int getNumCamarotes() {
		return numCamarotes;
	}

	public void setNumCamarotes(int numCamarotes) {
		this.numCamarotes = numCamarotes;
	}



	public void pedirDatos() {
		super.pedirDatos();
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Numero de Camarotes: ");
		this.numCamarotes=keyboard.nextInt();
	}

}
