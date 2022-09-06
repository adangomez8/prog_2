package trabajo_practico_3_p3;

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

	public Personaje jugar(Personaje personaje1, Personaje personaje2, String cualidad) {
		/*for()AARAY DE CUALIDADES
			Personaje retornado = j1.jugar(villano, heroe, "Vision nocturna");
			if(retornado==null) {
			}*/
		return personaje1.compararCualidad(personaje2, cualidad);
	}

}
