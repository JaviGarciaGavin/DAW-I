package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JPanel panel;
	public JLabel resultadoLbl;
	public JButton btnNewButton ; 
	public static Controlador control;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		JPanel panel = new JPanel();
		JButton btnNewButton = new JButton("Buscar");
		JLabel ResultadoLbl = new JLabel("Resultado");
		
		setTitle("Ejercicio2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		//Panel
		panel.setBackground(new Color(0, 128, 192));
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		//Boton
		panel.add(btnNewButton, BorderLayout.SOUTH);
		//Lbl
		panel.add(ResultadoLbl, BorderLayout.CENTER);
	}

}
