package ejercicio2;
import java.util.Scanner;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		int edad,numEmpleados;
		Scanner teclado=new Scanner(System.in);
		Empleado[] lista;
		
		System.out.println("Cuantos empleados deseas tener en la empresa");
		numEmpleados=teclado.nextInt();
		if(numEmpleados>0){
		lista=new Empleado[numEmpleados];
		}else {
		System.out.println("Este numero de empleados no esta permitido introduzca un numero positivo por favor");
		}
		System.out.println("A partir de que edad desea ver los empleados");
		edad=teclado.nextInt();
	}
	public void mosrarDatos(Empleado[]lista) {
		for (int i = 0; i <lista.length; i++) {
		}
	}
	
	
	
	
	public void mostrarDatosMayores(Empleado[]lista,int edad) {
	for (int i = 0; i < lista.length; i++) {
		System.out.println();
	}
		
	}
	
	
	
}
