package practicaHerencia;
import java.util.*;
public class Instrumento {
Scanner teclado=new Scanner(System.in);
private String [] melodia;
public Instrumento() {}
public void introMelodia() {
	System.out.println("Melodia Derecha:");
	this.melodia=new String [7];
	 for (int i = 0; i <this.melodia.length; i++) {
		this.melodia[i]=teclado.next();
	} 
}//introMelodia
 public void interpretar() {
	 System.out.println("Melodia Derecha");
	 for (int i = 0; i <this.melodia.length; i++) {
		System.out.print(this.melodia[i]+" ");
	}
 }//Interpretar

	 public void duracion(){
		 
		System.out.println("Melodia Derecha: "+this.melodia.length);
	} //Duracion
	 
   public int contarNota() {
	   String nota;
	   int contador=0;
	   System.out.println("¿Que nota desea contar?");
	   nota=teclado.next();
	   for (int i = 0; i < this.melodia.length; i++) {
		if(this.melodia[i].equals(nota)) {
			contador++;
		}//if
	}//for
		return contador;
   }//contarNota
}
