package trabajo_practico_3_p1Al;

import java.util.ArrayList;

public class Encuesta {

	private ArrayList<String> preguntas;
	private Empleado empleadoQueHaceEncuesta;
	private Persona_encuestada personaEncuestada;
	private int dni;

	public Encuesta(Empleado empleado, Persona_encuestada persona) {
		this.empleadoQueHaceEncuesta = empleado;
		this.personaEncuestada = persona;
		this.dni = this.getDni(persona);
		this.preguntas = new ArrayList<>();
	}

	public Persona_encuestada getPersonaEncuestada() {
		return personaEncuestada;
	}

	public void setPersonaEncuestada(Persona_encuestada personaEncuestada) {
		this.personaEncuestada = personaEncuestada;
	}

	public ArrayList<String> getPreguntas() {
		return preguntas;
	}

	public Empleado getEmpleadoQueHaceEncuesta() {
		return empleadoQueHaceEncuesta;
	}

	public void agregarPregunta(String pregunta) {
		if (!this.preguntas.contains(pregunta)) {
			preguntas.add(pregunta);
		}
	}
	
	public int getDni(Persona_encuestada persona) {
		return persona.getDni();
	}

	@Override
	public String toString() {
		return "Encuesta []";
	}
	
	

}
