package dialogos;
import javax.swing.*;
public class VentanasOpcion2 {
	public static void main(String[] args) {
      
		
		String[] menu = { "Si", "No","Tal vez" ,"cafe","tarta","pollo","salir"};
//        JPanel panel = new JPanel();
//        panel.add(new JLabel("Desea Continuar?"));
		String mensaje="Elige algo";
      while(true) {  
    	  int result = JOptionPane.showOptionDialog(null, mensaje, "Confirmacion",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null, menu, 0);
        
      System.out.println("result= "+result);
    	  if(result==6 ||result==-1  )
    		  break;
      }
       
        }
	}   
    


