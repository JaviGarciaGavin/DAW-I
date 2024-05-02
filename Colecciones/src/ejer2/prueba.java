package ejer2;
import java.util.*;

public class prueba {
public static void main(String[] args) {
	ArrayList<String> coches=new ArrayList<String>();
	int i;
	coches.add("Toyota");
	coches.add("Ford");
	coches.add("Audi");
	coches.add("Seat");
	coches.add("Renault");
	
for (int j = 0; j < coches.size(); j++) {
	System.out.println("Coche "+(j+1)+" "+coches.get(j));
}
System.out.println("------------------------------------------------------------------------------------------------------------------");
	coches.add(2,"BMW");
	for (int j = 0; j < coches.size(); j++) {
		System.out.println("Coche "+(j+1)+" "+coches.get(j));
	}
	}
}
