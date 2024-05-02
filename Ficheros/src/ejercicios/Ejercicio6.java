package ejercicios;

import java.io.*;

public class Ejercicio6 {
	final static  String RUTA="C:\\Users\\mañana\\eclipseWorkspace\\Ficheros";
	static File fich=new File(RUTA,"inven.dat");

public static void main(String[] args) {
	LineaOrden linea[]=new LineaOrden[5];
	String descrip;
	int uni;
	int i=0;
	double prec;
	try {
		FileInputStream fichero=new FileInputStream(fich);
		DataInputStream entrada=new DataInputStream(fichero);
		descrip=entrada.readUTF();
		while (descrip!=null) {
			uni=entrada.readInt();
			prec=entrada.readDouble();
			linea[i]=new LineaOrden(descrip,uni,prec);
			i++;
			descrip=entrada.readUTF();
		}
		entrada.close();
	}catch(FileNotFoundException e1){
		e1.printStackTrace();
		}
	catch(EOFException e2) {
		System.out.println("Fin");
	}
	catch(IOException e3) {
		System.out.println("Fin");
	}
	for ( i = 0; i < linea.length; i++) {
		System.out.println(linea[i].toString());
	}
	 
}}

