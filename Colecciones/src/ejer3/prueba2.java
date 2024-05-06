package ejer3;
import java.util.*;

public class prueba2 {
public static void main(String[] args) {
	ArrayList<Socio> club=new ArrayList<Socio>();
	Scanner teclado=new Scanner(System.in);
	int i,paraBorrar;
	
	club.add(new Socio (1,"Pepe","31-07-2001"));
	club.add(new Socio (3,"Juan","31-07-2001"));
	club.add(new Socio (4,"Ana","31-07-2001"));
	club.add(new Socio (2,"Sam","31-07-2001"));
	
	for (int j = 0; j < club.size(); j++) {
		System.out.println("Coche "+(j+1)+" "+club.get(j));
	}

System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("Ordenado por ID");

Collections.sort(club);
	for (int j = 0; j < club.size(); j++) {
		System.out.println("Coche "+(j+1)+" "+club.get(j));
	}

System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("Ordenado por Nombre");

ComparaNombres c1 =new ComparaNombres();
Collections.sort(club, c1);
	for (int j = 0; j < club.size(); j++) {
		System.out.println("Coche "+(j+1)+" "+club.get(j));
}
	
	System.out.println("Dame una id de usuario");
	paraBorrar=teclado.nextInt();

	for (int j = 0; j < club.size(); j++) {
		if(club.get(j).getId()==paraBorrar) {
			club.remove(j);
		}
	}
	for (int j = 0; j < club.size(); j++) {
		System.out.println("Coche "+(j+1)+" "+club.get(j));
}

}}
