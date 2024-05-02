package ejercicios;
import java.util.Scanner;
import java.util.InputMismatchException;

public class EdadNegativa {
public static void main(String[] args) {
		int edad;
		Scanner teclado=new Scanner(System.in);

		try {
				System.out.println("Dame una edad:");
				edad=teclado.nextInt();
				if (edad<0) {
					throw new ExcepcionEdadNegativa();
				}
			}
			catch (ExcepcionEdadNegativa e) {
	
				System.out.println(e.mensaje());
			}
	
}
}
