package dialogos;

import javax.swing.JOptionPane;
public class VentanasOpcion {
	public static void main(String[] args) {
int opcion=JOptionPane.showConfirmDialog(null, "Continuar?");
if (opcion==JOptionPane.YES_OPTION) {
		JOptionPane.showMessageDialog(null, "Escogio continuar");
	}else if(opcion==JOptionPane.NO_OPTION){
		JOptionPane.showMessageDialog(null, "Escogio no continuar");
	}
	}
}