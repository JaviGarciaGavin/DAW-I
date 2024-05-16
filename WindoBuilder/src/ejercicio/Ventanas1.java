package ejercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

public class Ventanas1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NombreText;
	private JPanel Datos;
	private JLabel IdLabel;
	private JTextField IdText;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPanel ApellidoPanel;
	private JTextField ApellidoText;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanas1 frame = new Ventanas1();
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
	public Ventanas1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Datos = new JPanel();
		
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
	
		Datos.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		Datos.setBackground(Color.CYAN);
		contentPane.add(Datos, BorderLayout.CENTER);
		Datos.setLayout(null);
		
		JPanel IdPanel = new JPanel();
		IdPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		IdPanel.setBounds(40, 30, 237, 42);
		Datos.add(IdPanel);
		IdPanel.setLayout(new BoxLayout(IdPanel, BoxLayout.X_AXIS));
		
		IdLabel = new JLabel("ID");
		IdLabel.setBounds(new Rectangle(20, 0, 20, 0));
		IdPanel.add(IdLabel);
		
		IdText = new JTextField();
		IdPanel.add(IdText);
		IdText.setColumns(10);
		
		JPanel NombrePanel = new JPanel();
		NombrePanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		NombrePanel.setBounds(40, 83, 237, 42);
		Datos.add(NombrePanel);
		NombrePanel.setLayout(new BoxLayout(NombrePanel, BoxLayout.X_AXIS));
		JLabel NombreLabel = new JLabel("Nombre");
		NombreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		NombrePanel.add(NombreLabel);
		
		NombreText = new JTextField();
		NombreText.setHorizontalAlignment(SwingConstants.LEFT);
		NombrePanel.add(NombreText);
		NombreText.setColumns(10);
		
		ApellidoPanel = new JPanel();
		ApellidoPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		ApellidoPanel.setBounds(40, 136, 237, 42);
		Datos.add(ApellidoPanel);
		ApellidoPanel.setLayout(new BoxLayout(ApellidoPanel, BoxLayout.X_AXIS));
		
		JLabel ApellidoLabel = new JLabel("Apellido");
		ApellidoPanel.add(ApellidoLabel);
		
		ApellidoText = new JTextField();
		ApellidoPanel.add(ApellidoText);
		ApellidoText.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Oeste");
		contentPane.add(lblNewLabel_1, BorderLayout.WEST);
		
		lblNewLabel_2 = new JLabel("Norte");
		contentPane.add(lblNewLabel_2, BorderLayout.NORTH);
		
		lblNewLabel_3 = new JLabel("Este");
		contentPane.add(lblNewLabel_3, BorderLayout.EAST);
		
		btnNewButton = new JButton("Cambiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiarTexto();
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	

	
	}
	
	public void cambiarTexto() {
		String aux;
		aux=IdText.getText();
		System.out.println(aux);
		aux=NombreText.getText();
		System.out.println(aux);
		aux=ApellidoText.getText();
		System.out.println(aux);
	}
}
