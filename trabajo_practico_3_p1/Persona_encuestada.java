package trabajo_practico_3_p1;

import java.util.ArrayList;

public class Persona_encuestada extends Persona{

	private ArrayList<Encuesta> encuestasRespondidas;

	public Persona_encuestada(String nombre, String apellido, int dni) {
		super(nombre, apellido, dni);
		this.encuestasRespondidas = new ArrayList<>();
	}

	public ArrayList<Encuesta> getEncuestasRespondidas() {
		return new ArrayList<Encuesta>(this.encuestasRespondidas);
	}

	public void responderEncuesta(Encuesta encuesta) {
		if(!this.encuestasRespondidas.contains(encuesta)) {
			this.encuestasRespondidas.add(encuesta);
		}
	}
	
}
