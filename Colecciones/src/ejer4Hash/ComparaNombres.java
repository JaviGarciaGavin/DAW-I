package ejer4Hash;

import java.util.Comparator;
public class ComparaNombres implements Comparator {
	
	@Override
	public int compare(Object soc1, Object soc2) {
		int resul;
		resul=((Socio) soc1).getName().compareTo(((Socio) soc2).getName());
		 return (resul);
	
	}}

