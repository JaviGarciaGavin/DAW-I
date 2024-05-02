package dialogos;
import javax.swing.*;

public class Dialogos extends JOptionPane {
	public static int pedirEntero(String mensaje) throws Exception{
		try {
			String message = showInputDialog(mensaje);
			int valor=Integer.parseInt(message);
			return valor;
		}
		catch(NumberFormatException ex) {
			mensajeError("Introdujo un tipo de dato no apropiado"," Aplicación externa");
			throw ex;
		}
		catch(Exception e) {
			mensajeError("ERROR"," Aplicación externa");
			throw e;
		}
	}
	public static float pedirFloat (String mensaje) {
		try {
			String message = showInputDialog(mensaje);
			float valor=Float.parseFloat(message);
			return valor;
		}catch(NumberFormatException ex) {
			mensajeError("Introdujo un tipo de dato no apropiado"," Aplicación externa");
			throw ex;
}
		catch(Exception e) {
			mensajeError("ERROR"," Aplicación externa");
			throw e;
		}
	}	
	public  static double pedirDouble (String mensaje) {
		try {
			String ax = showInputDialog(mensaje);
			double valor=Double.parseDouble(ax);
			return valor;
			
		}catch(NumberFormatException ex) {
			mensajeError("Introdujo un tipo de dato no apropiado"," Aplicación externa");
			throw ex;
		}
		catch(Exception e) {
			mensajeError("ERROR"," Aplicación externa");
			throw e;
		}
	}	
	public  static String pedirCadena (String mensaje) {
		try {
			String ax = showInputDialog(mensaje);
			String valor= mensaje;
			return valor;
			
		}catch(NumberFormatException ex) {
			mensajeError("Introdujo un tipo de dato no apropiado"," Aplicación externa");
			throw ex;
		}
		catch(Exception e) {
			mensajeError("ERROR"," Aplicación externa");
			throw e;
		}
	}	
	
	public static void mensajeWarning(String mensaje) {
		showMessageDialog(null, mensaje,"título",WARNING_MESSAGE);
	}
	
	public static void mensajeWarning(String mensaje, String titulo) {
		showMessageDialog(null, mensaje, titulo, WARNING_MESSAGE);
	}
	
	public static void mensajeInfo(String mensaje){
	showMessageDialog(null, mensaje,"título",INFORMATION_MESSAGE);
	}
	
	public static void mensajeInfo(String mensaje, String titulo) {
		showMessageDialog(null, mensaje, titulo, INFORMATION_MESSAGE);
	}
	
	public static  void  mensajeError(String mensaje){
		showMessageDialog(null, mensaje,"título",ERROR_MESSAGE);
	}
	
	public static void mensajeError(String mensaje, String titulo) {
		showMessageDialog(null, mensaje, titulo, ERROR_MESSAGE);
	}
	
	public int preguntarSN (String pregunta) {
		String[] menu = { "Si", "No"};
   while(true){
  	  int result =showOptionDialog(null, pregunta, "Confirmacion",
             YES_NO_CANCEL_OPTION,
             PLAIN_MESSAGE,
              null, menu, 0);
  	  return result;
	}
	}
	public static int pedirOpcion(String mensaje, String titulo, String []opciones) {
		int opcion=0;
		opcion = JOptionPane.showOptionDialog(null, mensaje, 
					opciones[0], 0, JOptionPane.QUESTION_MESSAGE, null, opciones, null);
		return(opcion);
	}
}
