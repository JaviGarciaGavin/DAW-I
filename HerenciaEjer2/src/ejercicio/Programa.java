package ejercicio;

public class Programa {
public static void main(String[] args) {
Mamifero mamiferos[]=new Mamifero[2];
Persona personas[]=new Persona[3];
//Creacion de objetos
Animal anim1=new Animal();
for (int i = 0; i < mamiferos.length; i++) {
	mamiferos[i]=new Mamifero();
}
for (int i = 0; i < personas.length; i++) {
	personas[i]=new Persona();
}

anim1.pedirDatos();
anim1.mostrarDatos();
//Mamiferos

for (int i = 0; i < mamiferos.length; i++) {
	mamiferos[i].pedirDatos();
	mamiferos[i].mostrarDatos();
}//for

//Personas
for (int i = 0; i < personas.length; i++) {
	personas[i].pedirDatos();
	personas[i].mostrarDatos();
}//for
	
	
}
}
