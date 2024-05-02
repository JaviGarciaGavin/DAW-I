package ejer1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		
		Alquiler barco1Alq=new Alquiler();
		Barco barco1Bar=new Barco();
		Veleros barco1Vel=new Veleros();
		Deportivas barco1Depor=new Deportivas();
		Yates barco1Yates=new Yates();
		
		
		
		Alquiler barco2Alq=new Alquiler();
		Veleros barco2Vel=new Veleros();
		
		barco1Alq.pedirDatos();
		barco1Bar.pedirDatos();
		barco1Alq.calAlquiler();
		
		
		barco2Alq.pedirDatos();
		barco2Vel.pedirDatos();
		barco2Alq.calAlquiler();
		
		
		
		
		

	
	


	}
}
	

