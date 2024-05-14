package ejercicio;

import java.util.Comparator;
import java.util.Map;

public class ComparaLetras implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int resul;		
		resul=((Map.Entry<Character, Academico>) o1).getKey().compareTo(((Map.Entry<Character, Academico>)o2).getKey());
		return (resul);
	}
	

}
