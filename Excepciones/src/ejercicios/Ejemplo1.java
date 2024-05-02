package ejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejemplo1 {
	public static void main(String[] args) {
	double dividendo,divisor,resul;
	Scanner teclado=new Scanner(System.in);
	
	

		try {
			System.out.println("Dividendo: ");
			dividendo=teclado.nextDouble();
			System.out.println("Divisor: ");
			divisor=teclado.nextDouble();
			resul=dividendo/divisor;
		System.out.println("Resultado: "+resul);
		}
		catch(InputMismatchException e) {
			System.out.println("Error division");
			System.out.println("Mensaje de la excepción: "+e);
		}
		
		
		
	}
}
