package ejercicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class Controlador implements ActionListener{
	
	private Modelo modeloPalabra;
	private Vista vista;

	public Controlador(Modelo modeloPalabra, Vista vista) {
		super();
		this.modeloPalabra = modeloPalabra;
		this.vista = vista;
	}

	public void generarPalabra() {
		String palabraRandom=modeloPalabra.aleatorio();
		vista.setLblResultado(palabraRandom);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		generarPalabra();
	}
}
