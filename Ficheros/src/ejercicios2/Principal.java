package ejercicios2;
import java.io.*;
import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	int nClientes,i=0;
	Cliente client;
	Cliente lista[];
try {
	FileOutputStream file= new FileOutputStream("ListadoClientes.dat");
	ObjectOutputStream fichero = new ObjectOutputStream(file);
	System.out.println("Cuantos Clientes desea crear ");
	 	nClientes= teclado.nextInt();
	 	lista= new Cliente [nClientes];
	 //pedimos los datos de cada alumno de la clase
	//Guardamos los objetos en el fichero
	 	for(i=0;i<nClientes;i++) {
	 		lista[i]=new Cliente();
	 		fichero.writeObject(lista[i]);
	 	}
	 	fichero.close();
	 		}
catch(FileNotFoundException e) {
	System.out.println("El fichero no existe");
}
catch(IOException e) {
	System.out.println("error E/S");
}
teclado.close();
//Leemos el fichero
try {
	FileInputStream fich = new FileInputStream("ListadoClientes.dat");
	ObjectInput fichero= new ObjectInputStream(fich);
	client=(Cliente)fichero.readObject();
	System.out.println("Datos de la clase: ");
	while(client!=null) {
		System.out.println(client.toString());
		client=(Cliente) fichero.readObject();
	}
	fichero.close();
}
catch(EOFException e) {
	//interrumpe la ejecución del bucle indefinido al ser capturada por el correspondiente bloque catch
	System.out.println("Fin");
}
catch(FileNotFoundException e) {
	System.out.println("No se encuentra el fichero");
}
catch(ClassNotFoundException e) {
	System.out.println("La clase no existe");
}
catch (IOException e) {
	System.out.println("Error E/S");
}
}
}	


