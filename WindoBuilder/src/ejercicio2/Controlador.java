package ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
	Vista vista;
	Palabras mod;
	
	public Controlador(Vista vista, Palabras mod ){
		super();
		this.vista=vista;
		this.mod=mod;
		
	}
	@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		String result=mod.aleatorio();
		System.out.println("----------------------------------------------");
			
			vista.resultadoLbl.setText(result);
		}
	}


