package ejer4Hash;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Socio implements Comparable {

private int id;
private String name;
LocalDate fechaNacimiento;

public Socio(int id,String name, String fechaNacimiento) {
	this.id=id;
	this.name=name;
	DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");//MESES EN MAYUSCULA
	this.fechaNacimiento=LocalDate.parse(fechaNacimiento,f);
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int edad() {
	int años=(int) this.fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
	return(años);
}

@Override
public int compareTo(Object ob) {
	int resul=0;
	Socio otroS=(Socio) ob;
	if(this.id<otroS.id) {
	resul=-1;
	}else {
		if(this.id==otroS.id) {
			resul=0;
	}else {
		if(this.id>otroS.id)
			resul=1;}
	}
	return (resul);
}

@Override
public boolean equals(Object soc) {
	boolean iguales;
	Socio otroS=(Socio) soc;
	if(this==soc) {
		iguales=false;
	}
	if(soc==null) {
		iguales=false;
	}
	if(this.id==otroS.id) {
			iguales=true;
	}else {
			iguales=false;
	}
return iguales;
}

@Override
public int hashCode() {
	return (this.id);
}

@Override
public String toString() {
	return "\nSOCIO \nId=" + id + "   //Name= " + name + "   // FechaNacimiento=" + fechaNacimiento+ "\n----------------------------------------------------------------------------------------------------------------------------";
}	
}

