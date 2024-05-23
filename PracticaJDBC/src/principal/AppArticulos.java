package principal;

import dialogos.Dialogos;
import modelo.*;
import java.util.ArrayList;
import java.util.Iterator;

public class AppArticulos {

	public static void main(String[] args) {
		String [] opciones = {"Crear", "Borrar", "Modificaciones", "Consultas","Articulos de un fabricante particular", "Salir"};
		
		int opcion=-1;		
		while (opcion<5) {	
			opcion=Dialogos.pedirOpcion("Elige opción", "AppArtículos", opciones);
			switch (opcion) {
				case 0:
					inserArt();
					break;
				case 1:
					delArt();
					break;
				case 2:
					modifArt();
					break;
				case 3:
					consulArt();					
					break;
				case 4:
					consulArtFab();					
					break;
				case 5:
					Dialogos.mensajeInfo("FIN ", "AppArtículos"); 
					opcion=5; break;
				default:
					opcion = 5; break;
			}			
		}			
	}

	
	private static void consulArtFab() {
		ArrayList<Articulo> lista= new ArrayList<Articulo>();
		String codFab;
		Articulo art;
		codFab=Dialogos.pedirCadena("Che pibe pasame el codigo de fabricante ");
		for (int i = 0; i < 3; i++) {
		art=ArticuloDAO.readMixto(codFab);
		Dialogos.mensajeInfo(art.toString(),"AppArtículos");
		}
	
	}
	
	public static void inserArt() {
		Articulo articulo;
		String codArt,nomArt,codFab;
		Double precio;
		codArt=Dialogos.pedirCadena("Código de artículo: ");
		nomArt=Dialogos.pedirCadena("Nombre de artículo: ");
		precio=Dialogos.pedirDouble("Precio: ");
		codFab=Dialogos.pedirCadena("Código de fabricante: ");
		articulo=new Articulo(codArt,nomArt,precio,codFab);
		ArticuloDAO.create(articulo);
	}
	
	public static void delArt() {
		String codArt;				
		codArt=Dialogos.pedirCadena("Código de artículo: ");				
		ArticuloDAO.delete(codArt);
	}
	
	public static void modifArt() {
		Articulo articulo;
		String codArt,nomArt,codFab;
		Double precio;
		codArt=Dialogos.pedirCadena("Código de artículo: ");
		articulo=ArticuloDAO.read(codArt);
		Dialogos.mensajeInfo("Los datos actuales son: "+articulo.toString(),"AppArtículos");
		
		nomArt=Dialogos.pedirCadena("Nombre de artículo: ");
		precio=Dialogos.pedirDouble("Precio: ");
		codFab=Dialogos.pedirCadena("Código de fabricante: ");
		articulo=new Articulo(codArt,nomArt,precio,codFab);
		ArticuloDAO.update(articulo);
	}
	
	public static void consulArt() {
		String codArt;
		Articulo articulo;		
		codArt=Dialogos.pedirCadena("Introduce código de artículo");
		articulo=ArticuloDAO.read(codArt);
		Dialogos.mensajeInfo(articulo.toString(),"AppArtículos");
	}

}
