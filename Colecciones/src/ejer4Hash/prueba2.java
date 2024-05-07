package ejer4Hash;
import java.util.*;

public class prueba2 {
public static void main(String[] args) {
	HashSet<Socio> club=new HashSet<Socio>();
	Scanner teclado=new Scanner(System.in);
	int i,paraBorrar;
	
	club.add(new Socio (1,"Pepe","31-07-1999"));
	club.add(new Socio (9,"Juan","31-07-2001"));
	club.add(new Socio (4,"Ana","31-07-2005"));
	club.add(new Socio (2,"Sam","31-07-2002"));
	

	System.out.println("Segun insercion");
	System.out.println(club);
	
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
	Iterator<Socio> iter=club.iterator();
	System.out.println("Lista de socios (iterador)");
	while(iter.hasNext()) {
		Socio soc=iter.next();
		System.out.println(soc.hashCode());
		System.out.println(soc);	
	}
	
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
	System.out.println("Recorrer club con un for each");
	for (Socio soc :club) {
		System.out.println(soc);		
	}
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
	System.out.println("Borrar un elemento de la lista con un iterador");
	
	System.out.println("Id del socio a eliminar");
	int borrarS;
	borrarS=teclado.nextInt();
	
	Iterator<Socio> iter2=club.iterator();
	while(iter2.hasNext()) {
		Socio soc2=iter2.next();
			if(soc2.getId()==borrarS) {
			iter2.remove();
			System.out.println("Socio borrado: "+ soc2.hashCode());	
			}
	}
	System.out.println("Listado despues de borrar");
	for (Socio soc :club) {
		System.out.println(soc);		
	}	
	
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
	System.out.println("Añadir un elemento nuevo al conjunto");
	boolean altaS;
	
	
	
	
	
	
	
}}
