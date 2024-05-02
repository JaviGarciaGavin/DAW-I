package ejercicios2;
import dialogos.Dialogos;
import java.io.*;  
import java.util.*;
 public class Cliente {
	 	private String dato;
	    private String dir;
	 	private int id;
		private String nombre;
		public Cliente(){
			this.datosCliente();
		}
		
public void datosCliente() {
	Dialogos dial=new Dialogos();
	try {
	this.id=Dialogos.pedirEntero(dato);
	this.nombre=Dialogos.pedirCadena(dato);
	this.dir=Dialogos.pedirCadena(dato);
	}
	catch(Exception e) { 		
		System.out.println("Error");
	}
}	

	

}



