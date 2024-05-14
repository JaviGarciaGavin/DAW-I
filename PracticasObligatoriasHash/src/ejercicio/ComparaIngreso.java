package ejercicio;

import java.util.Comparator;

public class ComparaIngreso implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int resul;
		resul=((Academico)o1).getaIngreso() - ((Academico)o2).getaIngreso();		        
		return (resul);
	}
	

}
