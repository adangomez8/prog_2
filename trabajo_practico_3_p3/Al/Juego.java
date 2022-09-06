package trabajo_practico_3_p3.Al;

import java.util.ArrayList;

public class Juego {

	private String nombre;
	private ArrayList<Personaje> personajes;

	public Juego(String nombre) {
		this.nombre = nombre;
		this.personajes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Personaje> getPersonajes() {
		return personajes;
	}

	public void agregarPersonaje(Personaje personaje) {
		if (!this.personajes.contains(personaje)) {
			this.personajes.add(personaje);
		}
	}

	public String jugarComparandoVisionNoctura(Personaje personaje1, Personaje personaje2) {

		if (personaje1.compararVisionNocturna(personaje2) != null) {
			return "Ganador: " + personaje1.compararVisionNocturna(personaje2);
		}
		return ("Empate. Los jugadores tienen el mismo valor en Vision nocturna");
	}
	
	public String jugarComparandoFuerza(Personaje personaje1, Personaje personaje2) {

		if (personaje1.compararFuerza(personaje2) != null) {
			return "Ganador: " + personaje1.compararFuerza(personaje2);
		}
		return ("Empate. Los jugadores tienen el mismo valor en fuerza");
	}
	
	public String jugarComparandoPeso(Personaje personaje1, Personaje personaje2) {

		if (personaje1.compararPeso(personaje2) != null) {
			return "Ganador: " + personaje1.compararPeso(personaje2);
		}
		return ("Empate. Los jugadores tienen el mismo valor en peso");
	}
	
	public String jugarComparandoAltura(Personaje personaje1, Personaje personaje2) {

		if (personaje1.compararAltura(personaje2) != null) {
			return "Ganador: " + personaje1.compararAltura(personaje2);
		}
		return ("Empate. Los jugadores tienen el mismo valor en altura");
	}
	
	public String jugarComparandoEdad(Personaje personaje1, Personaje personaje2) {

		if (personaje1.compararEdad(personaje2) != null) {
			return "Ganador: " + personaje1.compararEdad(personaje2);
		}
		return ("Empate. Los jugadores tienen el mismo valor en edad");
	}

}
