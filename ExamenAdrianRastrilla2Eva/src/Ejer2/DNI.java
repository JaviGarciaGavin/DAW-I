package Ejer2;

public class DNI {
	
	private int numero;
	private String letra;
	
	String letrasArray[]= new String[22];
	
	public DNI(int numero, String letra) {
		if(numero>0 && numero<99999999) {
			this.numero=numero;
		}else {
			this.numero=0;
		}
			
	}
	
	public int calcularLetra() {
		int numLetra;
		numLetra=this.numero%23;
		
		return numLetra;
	}
	
	public boolean comprobarLetra(String letra) {
		
		
		
		
		return false;
		
	}
	
	public boolean comprobarNumero(int Numero) {
		if(this.numero>0 && numero<99999999) {
			return true;
		}else {
			return false;
		}
	}
	
	public void mostrarDNI() {
		System.out.println("DNI--"+numero+letra);
	}

}
