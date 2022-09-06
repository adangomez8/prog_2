package trabajo_practico_1;

import java.time.LocalDate;

public class Main_persona {

	public static void mostrarDatos(Persona p) {
		System.out.println(p.getNombre());
		System.out.println(
				"IMC: " + p.calcularImc(p.getPeso(), p.getAltura()) + ". Está cumpliendo años: " + p.esCumple(p.getFechaNac())
						+ ". Es maor de edad: " + p.esMayor(p.getEdad()) + ". Puede votar: " + p.puedeVotar(p.getEdad()));

	}
	
	public static void main(String[] args) {

		Persona p1 = new Persona("Juan", "Perez", LocalDate.of(1998, 8, 22), 123321, "Masculino", 75, 180);
		Persona p2 = new Persona(44556622);
		Persona p3 = new Persona(66223145, "María", "Lopez");
		Persona p4 = new Persona(58462123, "José", "Rodriguez", LocalDate.of(2015, 6, 21));

		mostrarDatos(p1);
		mostrarDatos(p2);
		mostrarDatos(p3);
		mostrarDatos(p4);

	}
}
