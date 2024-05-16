package calculadora;

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField num1Txt;
	public JTextField num2Txt;
	public JLabel resultadoLbl ;
	private static Controlador control; 

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
		JPanel Botones = new JPanel();
		this.resultadoLbl = new JLabel("Resultado");
		JPanel Resultado = new JPanel();
		JButton restarBtn = new JButton("Restar Todo");
		JButton sumarBtn = new JButton("Sumar Todo");
		JButton multiplicarBtn = new JButton("Multiplicar Todo");
		JButton dividirBtn = new JButton("Dividir todo");
		JPanel Pedir = new JPanel();
		
		control=new Controlador(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1109, 695);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 234, 191));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
	
		contentPane.add(Botones, BorderLayout.SOUTH);
		
		
		
		restarBtn.setActionCommand("Restar");
		sumarBtn.setActionCommand("Sumar");
		multiplicarBtn.setActionCommand("Multiplicar");
		dividirBtn.setActionCommand("Dividir");
		
		
		sumarBtn.addActionListener(control) ;
		restarBtn.addActionListener(control);
		multiplicarBtn.addActionListener(control);
		dividirBtn.addActionListener(control);
			
		
		Botones.add(sumarBtn);
		Botones.add(restarBtn);
		Botones.add(multiplicarBtn);
		Botones.add(dividirBtn);
		
	
		contentPane.add(Pedir, BorderLayout.NORTH);
		
		num1Txt = new JTextField();
		Pedir.add(num1Txt);
		num1Txt.setColumns(10);
		
		num2Txt = new JTextField();
		Pedir.add(num2Txt);
		num2Txt.setColumns(10);
		
		
		contentPane.add(Resultado, BorderLayout.CENTER);
		
	
		Resultado.add(resultadoLbl);
	}

}
