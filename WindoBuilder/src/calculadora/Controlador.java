package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
  Vista ventana;
  public Controlador(Vista ventana) {
	  super();
	  this.ventana=ventana;
  }
  
	@Override
	public void actionPerformed(ActionEvent event) {
		int result = 0;
		String num1Str=ventana.num1Txt.getText();
		String num2Str=ventana.num2Txt.getText();
		int num1=Integer.parseInt(num1Str);
		int num2=Integer.parseInt(num2Str);
		System.out.println(event.getActionCommand());
			if(event.getActionCommand().equalsIgnoreCase("sumar")) {
			result=Modelo.sumar(num1, num2);
					
			}
			if(event.getActionCommand().equalsIgnoreCase("restar")) {
				result=Modelo.restar(num1, num2);
				
			}
			if(event.getActionCommand().equalsIgnoreCase("multiplicar")) {
			  result=Modelo.multiplicar(num1, num2);
				
			}
			if(event.getActionCommand().equalsIgnoreCase("dividir")) {
				result=Modelo.dividir(num1, num2);			
			}
			ventana.resultadoLbl.setText(String.valueOf(result));
	}

}
