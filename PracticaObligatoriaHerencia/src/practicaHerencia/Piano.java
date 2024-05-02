package practicaHerencia;

public class Piano extends Instrumento{
	private String [] melodiaIzda;
	public Piano() {}
	public void introMelodia() {
		super.introMelodia();
		System.out.println("Melodia Izquierda");
		this.melodiaIzda=new String [7];
		 for (int i = 0; i <this.melodiaIzda.length; i++) {
			this.melodiaIzda[i]=teclado.next();
		} 
	}
	 public void interpretar() {
		 System.out.println("Melodia Izquierda");
		 super.interpretar();
		 for (int i = 0; i <this.melodiaIzda.length; i++) {
			System.out.print(this.melodiaIzda[i]+" ");
		 }
	 }
	 public void duracion(){
		 super.duracion();
		System.out.println("Melodia Izquierda: "+this.melodiaIzda.length);
		} //Duracion
	
	 public int contarNota() {
		 super.contarNota(); 
		 String nota;
		   int contadorIz=0;
		   System.out.println("¿Que nota desea contar?");
		   nota=teclado.next();
		   for (int i = 0; i < this.melodiaIzda.length; i++) {
			if(this.melodiaIzda[i].equals(nota)) {
				contadorIz++;
		}//If
			}//For
		   return contadorIz;
		   }//Contador
	 }
