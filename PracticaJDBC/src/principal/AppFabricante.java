package principal;

import dialogos.Dialogos;
import modelo.Fabricante;
import modelo.FabricanteDAO;


public class AppFabricante {
public static void main(String[] args) {
String[]opciones = {"Crear", "Borrar", "Modificaciones", "Consultas", "Salir"}	;
int opcion=-1;

while (opcion<4) {	
	opcion=Dialogos.pedirOpcion("Elige opción", "AppArtículos", opciones);
	switch (opcion) {
		case 0:
			inserFab();
			break;
		
		case 1:
			delFab();
			break;
		
		case 2:
			modifFab();
			break;
		
		case 3:
			consulFab();					
			break;
		
		case 4:
			Dialogos.mensajeInfo("Cerrando Programa.... ", "AppArtículos"); 
			opcion=5; break;
		default:
			opcion = 5; break;
	}}
}

public static void inserFab() {
	Fabricante fabricante;
	String codFab,nomFab;
	codFab=Dialogos.pedirCadena("Código de fabricante: ");
	nomFab=Dialogos.pedirCadena("Nombre de fabricante: ");
	fabricante=new Fabricante(codFab,nomFab);
	FabricanteDAO.create(fabricante);
}

public static void delFab() {
	String codArt;				
	codArt=Dialogos.pedirCadena("Código de fabricante: ");				
	FabricanteDAO.delete(codArt);
}

public static void modifFab() {
	Fabricante fabricante;
	String nomFab,codFab;
	codFab=Dialogos.pedirCadena("Código de fabricante: ");
	fabricante=FabricanteDAO.read(codFab);
	Dialogos.mensajeInfo("Los datos actuales son: "+fabricante.toString(),"AppFabricante");
	codFab=Dialogos.pedirCadena("Código de fabricante: ");
	nomFab=Dialogos.pedirCadena("Nombre de fabricante: ");
	fabricante=new Fabricante(codFab,nomFab);
	FabricanteDAO.update(fabricante);
}

public static void consulFab() {
	String codFab;
	Fabricante fabricante;		
	codFab=Dialogos.pedirCadena("Introduce código de fabricante");
	fabricante=FabricanteDAO.read(codFab);
	Dialogos.mensajeInfo(fabricante.toString(),"App Fabricante");
}

}






