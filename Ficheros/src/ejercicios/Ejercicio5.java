package ejercicios;


import java.io.*;
import java.util.Iterator;

public class Ejercicio5 {
public static void main(String[] args) {
	double [] precios= {350, 400,890,6200,8730};
	int [] unidades= {5,7,12,8,30};
	String [] descripciones ={"Grapas","Lapices","Boligrafos","Carteras","Estilografias"};
	int unidad;
	double precio,total=0.0;
	String descripcion;
	

	try {
		DataOutputStream salida= new DataOutputStream(new FileOutputStream(".\\Pedidos.txt"));
		for (int i = 0; i < precios.length; i++) {
			salida.writeUTF(descripciones[i]);
			salida.writeInt(unidades[i]);
			salida.writeDouble(precios[i]);
			}
		salida.close();
	}catch(IOException e) {
		System.out.println("Error Error....");
	}
	try {
		FileInputStream fichero=new FileInputStream(".\\Pedidos.txt");
		DataInputStream entrada=new DataInputStream(fichero);
		descripcion=entrada.readUTF();
		while (descripcion!=null) { 
		unidad=entrada.readInt();
		precio=entrada.readDouble();
		System.out.println("Has pedida "+unidad+" "+descripcion+" a "+precio+" euros");
		total=total+unidad*precio;
		descripcion=entrada.readUTF();
		}
		entrada.close();
		}
		catch(EOFException e) {
		    System.out.println(" ");
		}
		catch(IOException e) {
		    System.out.println("Error E/S");
		}
		finally {
		    System.out.println("Por un total de: "+total+" euros.");
		}

	 
}
}
