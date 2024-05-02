package ejercicio;
import java.util.Scanner;
public class Programa {
public static void main(String[] args) {
	int menu=0;
	Scanner teclado=new Scanner(System.in);
do {	
	System.out.println("Que accion desea realizar");
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	System.out.println("1--Modificar el sueldo base para todos los empleados");
	System.out.println("2--Modificar el plus para todos los jefes");
	System.out.println("3--Visualizar los datos de todos los empleados");
	System.out.println("4--Salir");
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	menu=teclado.nextInt();
	switch (menu) {
	case 1: {
		System.out.println("Inserte el nuevo sueldo base");
		Empleado.sueldoB=teclado.nextDouble();
		break;
	}
case 2: {
	System.out.println("Inserte el nuevo sueldo base");
	Jefe.plusJefe=teclado.nextInt();
		break;
	}
case 3: {
	break;
}
case 4: {
	break;
}
	default:
	System.out.println("Por facor introduzca un numero correspondiente a una de las acciones del menu");
	}
}while(menu!=4);
teclado.close();
}}
