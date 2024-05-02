package ejer1;

import java.util.Scanner;

public class Barco {
	protected String matricula;
	protected int eslora;
	protected int aniofab;
	
	public Barco() {
		this.matricula=matricula;
		this.eslora=eslora;
		this.aniofab=aniofab;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getEslora() {
		return eslora;
	}
	public void setEslora(int eslora) {
		this.eslora = eslora;
	}
	public int getAniofab() {
		return aniofab;
	}
	public void setAniofab(int aniofab) {
		this.aniofab = aniofab;
	}
	
	public void pedirDatos() {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Dime los datos del barco");
		System.out.println("Matricula: ");
		this.matricula=keyboard.next();
		System.out.println("Metros Eslora: ");
		this.eslora=keyboard.nextInt();
		System.out.println("Año de Fabricacion: ");
		this.aniofab=keyboard.nextInt();
		
	}
	

}
