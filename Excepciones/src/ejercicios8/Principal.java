package ejercicios8;

public class Principal {
public static void main(String[] args) {
	int [] array=new int [3];
	try {
		System.out.println(array [4]);
	}//try
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Esto se sale del array");
	}//catch
	}
}
