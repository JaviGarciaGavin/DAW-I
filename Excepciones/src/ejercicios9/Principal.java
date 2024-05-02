package ejercicios9;
import javax.swing.JOptionPane;
public class Principal {
public static void main(String[] args) {
	int [] numeros=new int [5]; 
	int suma=0;
	try {
	for (int i = 0; i < numeros.length; i++) {
		String numero =JOptionPane.showInputDialog("Dime un numero porfavor");
		numeros[i]=Integer.parseInt(numero);
		}//for1
	for (int i = 0; i < numeros.length; i++) {
		suma=suma+numeros[i];
		}//for2
	}//try
	catch(NumberFormatException e){
	for (int i = 0; i < numeros.length; i++) {
		suma=suma+numeros[i];
		}//for
	}//catch
	System.out.println("La suma de todos los numeros es: "+suma);
}
}
