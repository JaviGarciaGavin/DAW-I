package alquiler;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Principal {

	public static void main(String[] args) {		
//		int []pos1= {4,12};
//		int []pos2= {110,56};
//		int []pos3= {10,7};
//		int []pos4= {90,136};
//		Barco b1=new Barco();
//		Velero v1=new Velero("222333XXX",10,2019,2);
//		Deportiva d1=new Deportiva("2222xx",20,2021,130);
//		Yate y1=new Yate();
//		b1.setMatricula("7788CCC");
//		b1.setAño(2020);
//		b1.setSlora(12);
//		y1.setMatricula("3456CCC");
//		y1.setAño(2022);
//		y1.setSlora(15);
//		y1.setPotencia(120);
//		y1.setNumCamarotes(6);
//		
//		Alquiler a1=new Alquiler("Olga","12333444D",45,pos1,b1);
//		System.out.println("Alquiler 1: "+a1.calcAlquiler());
//		//System.out.println(a1.getBarco().toString());
//		
//		Alquiler a2=new Alquiler("Pepe","123444P",30,pos2,v1);
//		System.out.println("Alquiler 2: "+a2.calcAlquiler());
//		//System.out.println(a2.getBarco().toString());
//		
//		Alquiler a3=new Alquiler("María","xx",25,pos3,d1);
//		System.out.println("Alquiler 3: "+a3.calcAlquiler());
//		//System.out.println(a3.getBarco().toString());
//		
//		Alquiler a4=new Alquiler("Ángel","12333444D",55,pos4,y1);
//		System.out.println("Alquiler 4: "+a4.calcAlquiler());
		
		LocalDate fecha;
		String f1="2024-03-21";
		fecha=LocalDate.parse(f1);
		System.out.println("fecha: "+fecha);
		
	}

}
