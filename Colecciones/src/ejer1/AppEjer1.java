package ejer1;

import java.util.Arrays;

public class AppEjer1 {
public static void main(String[] args) {
	
	Socio club[]=new Socio[] {
	new Socio (5,"Pepe","29-03-2024"),
	new Socio (3,"Aaria","10-01-2023"),
	new Socio (2,"Maria","10-01-2023")
	};

	ComparaNombres c=new ComparaNombres();
	Arrays.sort(club,c);
	System.out.println(Arrays.toString(club));



int resultado;
resultado=club[1].compareTo(club[2]);
System.out.println("Comparación: "+resultado);
}
}
