package alquiler;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
	private String nombre;
	private String DNI;
	//private int numDias;
	private LocalDate fechIni;
	private int []pos=new int[2];
	private Barco barco;
	private final int PRBASE=15;
		
	public Alquiler() {
		this.nombre="";
		this.DNI="";
	}
	
	public Alquiler(String nombre, String dNI, String fechIni, int[] pos, Barco barco) {		
		this.nombre = nombre;
		DNI = dNI;
		this.fechIni = LocalDate.parse(fechIni);
		this.pos = pos;
		this.barco = barco;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	
	public LocalDate getFechIni() {
		return fechIni;
	}

	public void setFechIni(LocalDate fechIni) {
		this.fechIni = fechIni;
	}

	public int getPRBASE() {
		return PRBASE;
	}

	public Barco getBarco() {
		return barco;
	}
	public void setBarco(Barco b) {
		this.barco = b;
	}
	public int[] getPos() {
		return pos;
	}
	public void setPos(int[] pos) {
		this.pos = pos;
	}
	public long calcNumDias() {
		long numDias;
		numDias=ChronoUnit.DAYS.between(this.fechIni,LocalDate.now());
		return(numDias);
	}
	public double calcAlquiler() {
		double valor;		
		valor=this.barco.calculaValor(this.PRBASE)*this.calcNumDias();		
		return(valor);
	}
}
