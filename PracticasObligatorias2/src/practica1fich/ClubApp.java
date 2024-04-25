package practica1fich;

import java.io.*;
import dialogos.Dialogos;

public class ClubApp {
public static void main(String[] args) {
	
	String [] opciones = {"Crear Socio", "Listar Socios", "Salir"};		
	int opcion;
	opcion=Dialogos.pedirOpcion("Que deseas hacer?", "App Socios", opciones);
	while (opcion!=2) {			
		switch (opcion) {
			case 0:
				
				crearSocio(); break;
			case 1:
				listarSocios(); break;
			default:
				Dialogos.mensajeInfo("Fin del programa","App Socios");break;				
		}
		opcion=Dialogos.pedirOpcion("Elige acción", "App Socios", opciones);
}
}

public static void crearSocio() {
	Socio soci=new Socio();

	try {
		File fichero=new File("socios.dat");		
		FileOutputStream fich;

		if (fichero.exists()==false) {				
			fich=new FileOutputStream("socios.dat");
			ObjectOutputStream fichIni=new ObjectOutputStream(fich);
			fichIni.writeObject(soci);
			fichIni.close();
		} else {	
			fich=new FileOutputStream("socios.dat",true);
			MiObjectOutputStream fichero1=new MiObjectOutputStream(fich);
			fichero1.writeObject(soci);			
			fichero1.close();
		}
	}		
	catch(FileNotFoundException e) {
		Dialogos.mensajeWarning("El fichero no existe", "ClubApp");
	}
	catch(IOException e) {
		Dialogos.mensajeError("Error de E/S", "ClubApp");
	}
}

public static void listarSocios() {
	//Leer objetos del fichero	
	Socio soci=null;
	try {
		FileInputStream fich=new FileInputStream("socios.dat");
		ObjectInputStream fichero=new ObjectInputStream(fich);				
		soci=(Socio)fichero.readObject();
		while(soci!=null) {					
			Dialogos.mensajeInfo(soci.toString(),"ClubApp");
			soci=(Socio)fichero.readObject();					
		}					
		fichero.close();			
	}	
	catch(EOFException e) {
		Dialogos.mensajeWarning("No hay más clientes", "ClubApp");
	}	
	catch(FileNotFoundException e) {
		Dialogos.mensajeWarning("El fichero no existe", "ClubApp");
	}
	catch (ClassNotFoundException e) {			
		Dialogos.mensajeWarning("La clase no se encuentra", "ClubApp");
	}
	catch(IOException e) {
		Dialogos.mensajeError("Error de E/S", "ClubApp");
	} 
}}
