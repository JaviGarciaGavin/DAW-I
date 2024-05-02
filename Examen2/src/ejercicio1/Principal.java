package ejercicio1;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
Scanner teclado=new Scanner (System.in);
//int[] amarre1= {2,6};
//int[] amarre2= {6,6};
//int[] amarre3= {2,2};
	
//Alquiler alq1=new Alquiler("Pepe","77889418P","barco",5,amarre1);
//Alquiler alq2=new Alquiler("Antonio","77885418T","velero",4,amarre2);	
//Alquiler alq3=new Alquiler("Val","77884418D","deportiva",3,amarre3);	


//Los calculos los hace bien pero ahora mismo no recuerdo como incorporar un metodo de una subclase a la clase principal
Barco bar1=new Barco(45567,32,1994);
Velero vel1=new Velero(45567,32,1994,3);
Deportiva depor1=new Deportiva(45567,32,1994,800);
Yate yat1=new Yate(45567,32,1994,800,7);

System.out.println("Alquiler de barco normal:"+bar1.calcularAlquiler());
System.out.println("Alquiler de velero:"+vel1.calcularAlquiler());
System.out.println("Alquiler de depor:"+depor1.calcularAlquiler());
System.out.println("Alquiler de yate:"+yat1.calcularAlquiler());
teclado.close();
}
}
