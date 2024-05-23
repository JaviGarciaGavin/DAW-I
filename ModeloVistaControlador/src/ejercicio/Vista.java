package ejercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {
	Controlador objetoControlador;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JPanel panel = new JPanel();
	JLabel lblResultado = new JLabel("Resultado");
	JButton btnCambio = new JButton("Cambiar");

	/**
	 * Create the frame.
	 */
	public Vista() {
		Modelo model=new Modelo();
		objetoControlador= new Controlador(model,this);
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		btnCambio.addActionListener(objetoControlador);
		
		
		contentPane.add(btnCambio, BorderLayout.SOUTH);
		
		
		contentPane.add(panel, BorderLayout.CENTER);
		
		
		panel.add(lblResultado);
	}
	public JLabel getLblResultado() {
		return lblResultado;
	}

	public void setLblResultado(String palabraRandom) {
		this.lblResultado.setText(palabraRandom); 
	}
}
