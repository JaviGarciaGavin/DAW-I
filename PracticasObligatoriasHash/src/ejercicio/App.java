package ejercicio;

import java.io.*;
import java.util.*;
import dialogos.Dialogos;


public class App {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	String seguir = "si", nombre = "",letra="";
	String rellenar = "";
	char sillon;
	int anyo,opcion = 0;
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
		sillon=Dialogos.pedirCadena(rellenar).charAt(0);
		
		aux=new Academico(nombre,anyo);
		insertado=nuevoAcademico(Academia,aux,sillon);
		if (insertado==false)
			System.out.println("No se ha podido insertar. Letra incorrecta");
		
	System.out.println("Desea continuar?");
	seguir=teclado.next();

	
}
	   //Escribir el map de academicos ordenados POR LETRA en un fichero
    try {
		FileOutputStream escribir=new FileOutputStream("Academicos.dat");
		ObjectOutputStream escribirOb= new ObjectOutputStream(escribir);

		escribirOb.writeObject(Academia);
	}
	catch (FileNotFoundException e) {}
	catch (IOException e) {}
	

	System.out.println("El fichero ha sido creado");
	
	
	 //Listado ordenado por letra
		Set<Map.Entry<Character, Academico>> conLetra = Academia.entrySet();
		List<Map.Entry<Character, Academico>> listaConLetra= new ArrayList<>(conLetra);

		 ComparaLetras cl=new ComparaLetras();          
	     Collections.sort(listaConLetra,cl);
	     System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
	     System.out.println("\nOrden por letra: " + listaConLetra);
	     
	     System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

	//Listado de academicos ordenados por nombre sin la letra
	     ArrayList<Academico> listaSinLetra=new ArrayList<>(Academia.values());
	     Collections.sort(listaSinLetra);
	     System.out.println("\nPor nombre sin letra: " + listaSinLetra);	
	     System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

  
	//Listado ordenado por ingreso
	     ComparaIngreso cl2=new ComparaIngreso();
	     Collections.sort(listaSinLetra,cl2);
	     System.out.println("\nOrdenado por Ingreso: " + listaSinLetra);	
	     System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

	
	  
	     
		  //EJERCICIO2
	     System.out.println("Que desea hacer");
	    System.out.println("1---->Listar los académicos por orden de nombre");
	    System.out.println("2---->Listar los académicos por orden de letra");
	    System.out.println("3---->Añadir un académico");
	    System.out.println("4---->Borrar un académico pidiendo su letra");
	    System.out.println("5---->Salir");
	    
	    while (opcion !=5) {
	    opcion=Dialogos.pedirEntero(rellenar);
	
		switch (opcion) {
		case 1: {
		    //LEER LOS DATOS DEL FICHERO
			try {
		 		FileInputStream lector=new FileInputStream("Academicos.dat");
		 		ObjectInputStream leerOb= new ObjectInputStream(lector);
		 	
		 		Academia=(Map<Character, Academico>) leerOb.readObject();
		 
		 		System.out.println(Academia);
		 	
		 		}	
		 	
		 	catch (FileNotFoundException e) {
		 		e.printStackTrace();
		 	}
		 	catch (IOException e) {
		 		e.printStackTrace();
		 	} 
		 	catch (ClassNotFoundException e) {
		 		e.printStackTrace();
		 	}
			break;
		}
		case 2: {
			
			
			
			
			break;
		}
		case 3: {
		
			try {
				FileOutputStream escribir = new FileOutputStream("Academicos.dat");
				ObjectOutputStream escribirOb= new ObjectOutputStream(escribir);
				
				System.out.println("Nombre del academico");
				nombre=Dialogos.pedirCadena(rellenar);
				System.out.println("Año de su ingreso");
				anyo = Dialogos.pedirEntero(rellenar);
			
				System.out.println("Letra de su sillon");
				sillon=Dialogos.pedirCadena(rellenar).charAt(0);
				
				aux=new Academico(nombre,anyo);
				
				insertado=nuevoAcademico(Academia,aux,sillon);
				escribirOb.writeObject(Academia);
				if (insertado==false)
					System.out.println("No se ha podido insertar. Letra incorrecta");
			
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			break;
}
		case 4: {
	
			
			
			break;
}
		case 5: {
	
			
			
			break;
}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
	    }



}



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
