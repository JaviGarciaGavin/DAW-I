package ejer1;

import java.util.Scanner;

public class Veleros extends Barco{
	private int nmastiles;

	public Veleros() {
		super();
		this.nmastiles=nmastiles;
	}
	
	public int getNmastiles() {
		return nmastiles;
	}

	public void setNmastiles(int nmastiles) {
		this.nmastiles = nmastiles;
	}
	
	public void pedirDatos() {
		super.pedirDatos();
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Numero de Mastiles: ");
		this.nmastiles=keyboard.nextInt();
	}

}
