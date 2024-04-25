package practica1fich;
import java.time.LocalDate;
import java.io.*;
import dialogos.Dialogos;
import javax.xml.bind.annotation.*;
@XmlRootElement(name="Socio")  
@XmlType(propOrder= {"id","nombre","direccion","fechaAlta"})
@XmlAccessorType(XmlAccessType.FIELD)


public class Socio implements Serializable{
	private static final long serialVersionUID = 1L;
	@XmlElement(name="id",required=true)
	private String id;
	@XmlElement(name="nombre")
	private String nombre;
	@XmlElement(name="direccion")
	private String direccion;
	@XmlElement(name="fechaAlta")
	protected LocalDate fecha;
	
public Socio () {
	datosSocio();
}

public void datosSocio() {		
	this.id=Dialogos.pedirCadena(id);
	this.nombre=Dialogos.pedirCadena(nombre);
	this.direccion=Dialogos.pedirCadena(direccion);
	this.fecha=LocalDate.now();
}


@Override
public String toString() {
	return "Socio \n id= " + id + "\n nombre= " + nombre + "\n direccion= "+direccion+"\n Fecha de alta= "+fecha;

}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
}
