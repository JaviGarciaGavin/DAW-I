package ejercicio;

public class Jefes extends Empleados{
	private String tituloUniversitario;
	private String nombreDepartamento;
	public  Jefes() {
		super();
		this.tituloUniversitario="";
		this.nombreDepartamento="";
	}
	public  Jefes(String nom,double suel,String tituloUni,String nomDepar) {
		super(nom,suel);
		this.tituloUniversitario=tituloUni;
		this.nombreDepartamento=nomDepar;
	}

	public String getTituloUniversitario() {
		return tituloUniversitario;
	}

	public void setTituloUniversitario(String tituloUniversitario) {
		this.tituloUniversitario = tituloUniversitario;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}
	
	
	public void mostrarDatos() {
	super.mostrarDatos();
	System.out.println(this.tituloUniversitario);
	System.out.println(this.nombreDepartamento);

	}
}	
