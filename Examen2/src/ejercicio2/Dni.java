package ejercicio2;

public class Dni{
private char[] letras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
private int numero;
private char letra;
public Dni(){
this.numero=0;
this.letra='T';
}

public Dni(int num,char let){
Boolean validNum=comprobarNumero(num);
Boolean validChar=comprobarLetra(num,let);
	if (validNum=false) {
		this.numero=0;
	}else{
		this.numero=num;}
	if (validChar=false) {
		this.letra='T';
	}else {
		this.letra=let;}
}

public Dni(int num) {
	this.letra=calcularLetra(num);	
}

public char calcularLetra(int num){
	int posicion;
	char charResult;
	posicion=num%23;
	charResult=letras[posicion];
	return charResult;
	}
	
public boolean comprobarLetra(int num,char let) {
	boolean valido=true;
	if (num<0||num>99999999){
	valido=false;
	System.out.println("El numero introducido no es valido");
	return valido;
	}
	else {
	return valido;
	}
}

public boolean comprobarNumero(int num) {
	boolean valido=true;
	if (num<0||num>99999999){
	valido=false;
	System.out.println("El numero introducido no es valido");
	return valido;
	}
	else {
	return valido;
	}
}

public void mostrarDni() {
	System.out.println("DNI--"+this.numero+this.letra);
}



}

