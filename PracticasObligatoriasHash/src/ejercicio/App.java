package ejercicio;

import java.io.*;
import java.util.*;
import dialogos.Dialogos;


public class App {
public static void main(String[] args) {
	String seguir = "si", nombre = "";
	String rellenar = "";
	char sillon;
	int anyo;
	Scanner teclado=new Scanner(System.in);
	boolean insertado;
	Academico aux;
	
	Map<Character, Academico> Academia=new HashMap<Character, Academico>();

	while (seguir.toUpperCase().compareTo("SI")==0) {
		
		System.out.println("Nombre del academico");
		nombre=Dialogos.pedirCadena(rellenar);
		System.out.println("Año de su ingreso");
		anyo = Dialogos.pedirEntero(rellenar);
	
		System.out.println("Letra de su sillon");
		sillon=teclado.next().charAt(0);
		
		aux=new Academico(nombre,anyo);
		insertado=nuevoAcademico(Academia,aux,sillon);
		if (insertado==false)
			System.out.println("No se ha podido insertar. Letra incorrecta");
		
	System.out.println("Desea continuar?");
	seguir=teclado.next();
}
	
	
	//Listado de academicos ordenados por nombre sin la letra
	ArrayList<Academico> listaSinLetra=new ArrayList<>(Academia.values());
    Collections.sort(listaSinLetra);
    System.out.println("Por nombre sin letra: " + listaSinLetra);	


	
//Listado ordenado por letra
	Set<Map.Entry<Character, Academico>> conLetra = Academia.entrySet();
	List<Map.Entry<Character, Academico>> listaConLetra= new ArrayList<>(conLetra);

	 ComparaLetras cl=new ComparaLetras();          
     Collections.sort(listaConLetra,cl);
     System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
     System.out.println("Orden por letra: " + listaConLetra);
	
	
	System.out.println(Academia);



	//Listado ordenado por ingreso
	Set<Map.Entry<Character, Academico>> porIngreso = Academia.entrySet();
	List<Map.Entry<Character, Academico>> listaConLetra= new ArrayList<>(conLetra);

	 ComparaLetras cl2=new ComparaIngreso();          
   Collections.sort(listaConLetra,cl);
   System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
   System.out.println("Orden por letra: " + listaConLetra);
	
	
	System.out.println(Academia);







static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
    boolean insertado = false;
    if ((letra >= 'A' && letra <= 'Z')
            || (letra >= 'a' && letra <= 'z')
            || letra == 'ñ' || letra == 'Ñ') {
        academia.put(letra, nuevo);
        insertado = true;
    } else {
        System.out.println("Letra no válida");
    }
    return insertado;
}

}
