package ejer2;
import java.util.*;

public class prueba2 {
public static void main(String[] args) {
	ArrayList<Socio> coches=new ArrayList<Socio>();
	int i;
	
	coches.add(new Socio (1,"Ford","31-07-2001"));
	coches.add(new Socio (3,"Ford","31-07-2001"));
	coches.add(new Socio (4,"Ford","31-07-2001"));
	coches.add(new Socio (2,"Ford","31-07-2001"));
	
for (int j = 0; j < coches.size(); j++) {
	System.out.println("Coche "+(j+1)+" "+coches.get(j));
}
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
Collections.sort(coches);
for (int j = 0; j < coches.size(); j++) {
	System.out.println("Coche "+(j+1)+" "+coches.get(j));
}

	}
}
