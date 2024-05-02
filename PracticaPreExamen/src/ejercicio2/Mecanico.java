package ejercicio2;

public class Mecanico extends Personal{
	private int telefono;
	enum especialidad {frenos,hidraulica,electricidad,motor};
	private especialidad especialidad;
	
	public Mecanico() {
	super();
	this.telefono=0;
	this.especialidad=especialidad.frenos;
}
	public especialidad getEspecialidad() {
	return especialidad;	
	}
}
