package dialogos;
import javax.swing.*;
public class ventanas1  {
public static void main(String[] args) {

		int numero;
		try {
			numero = Dialogos.pedirEntero ("Dime un numero porfavor");
		
		} catch (Exception e) {
			int respuesta=Dialogos.preguntarSN("Eres tonto?");
			if (respuesta==0) {
			Dialogos.mensajeInfo("Lo sabemos");
			};
		}
//		Integer.parseInt(numero);
//		showMessageDialog(null, "Es este su numero? : "+numero);
}}
