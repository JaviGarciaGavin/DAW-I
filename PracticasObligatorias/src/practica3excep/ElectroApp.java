package practica3excep;
import javax.swing.JOptionPane;
import java.util.*;

import dialogos.Dialogos;
public class ElectroApp {
public static void main(String[] args) {
	Scanner teclado =new Scanner(System.in);
	Electrodomestico elec[]=new Electrodomestico [6];
	String[] menu = { "Lavadora", "Lavavajillas","Frigorifico","Nada"};
	int valor=0;
	for (int i = 0; i < elec.length; i++) {
	  int result = JOptionPane.showOptionDialog(null,"Que deseas crear" , "Confirmacion",
          JOptionPane.YES_NO_CANCEL_OPTION,
          JOptionPane.PLAIN_MESSAGE,
          null, menu, 0);
switch (result) {
case 0: {
	
	
	elec[i]=new Lavadoras();
	break;
}//Case0
case 1: {
	elec[i]=new Lavavajillas();
	break;
} //Case1
case 2: {
	elec[i]=new Frigorifico();
	break;
} //Case2
case -1,3:{

	break;
}//CaseSalida
}//Switch
}

	for (int i = 0; i < elec.length; i++) {
		try {
			Dialogos.mensajeInfo(elec[i].toString(),"Especificaciones");
		}
		catch(NullPointerException e) {
			Dialogos.mensajeError("Elemento inexistente");
				}
			}	
	
elec[1]=null;
elec[3]=null;
elec[5]=null;
System.out.println("-----------------------------------------------------------------------------");

	for (int i = 0; i < elec.length; i++) {
		try {
			Dialogos.mensajeInfo(elec[i].toString(),"Especificaciones");
		}
		catch(NullPointerException e) {
			Dialogos.mensajeError("Elemento inexistente");
				}
			}
	
	}}
//VERSION A LO BRUTO SIN INTRODUCIR DATOS (FUNCIONA BIEN)
//elec[0]=new Lavadoras(Calif.A, 120,50,120);
//elec[1]=new Lavadoras(Calif.B, 120,50,150);
//elec[2]=new Frigorifico(Calif.A, 120,50);
//elec[3]=new Frigorifico(Calif.B, 120,50);
//elec[4]=new Lavavajillas(Calif.A, 120,50,200);
//elec[5]=new Lavavajillas(Calif.B, 120,50,150);
//
//for (int j= 0; j< elec.length; j++) {
//System.out.println(elec[j].toString());
//}