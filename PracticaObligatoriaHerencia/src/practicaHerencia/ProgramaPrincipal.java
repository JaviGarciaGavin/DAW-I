package practicaHerencia;
public class ProgramaPrincipal {
	public static void main(String[] args) {
		Piano pia1= new Piano();
	
		pia1.introMelodia();
		pia1.duracion();
		pia1.interpretar();
		System.out.println(pia1.contarNota());
	}
}
