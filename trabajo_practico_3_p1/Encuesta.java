package trabajo_practico_3_p1;

import java.util.ArrayList;

public class Encuesta {

	private String nombre;
	private ArrayList<String> preguntas;
	private ArrayList<Persona> personasQueRespondieron;
	private ArrayList<Integer> dniPersonasQueRespondieron;
	private Empleado empleadoQueHaceEncuesta;

	public Encuesta(String nombre, Empleado empleado) {
		this.nombre = nombre;
		this.empleadoQueHaceEncuesta = empleado;
		this.preguntas = new ArrayList<>();
		this.personasQueRespondieron = new ArrayList<>();
		this.dniPersonasQueRespondieron = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getPreguntas() {
		return preguntas;
	}

	public ArrayList<Persona> getPersonasQueRespondieron() {
		return personasQueRespondieron;
	}

	public ArrayList<Integer> getDniPersonasQueRespondieron() {
		return dniPersonasQueRespondieron;
	}

	public Empleado getEmpleadoQueHaceEncuesta() {
		return empleadoQueHaceEncuesta;
	}

	public void agregarPregunta(String pregunta) {
		if (!this.preguntas.contains(pregunta)) {
			preguntas.add(pregunta);
		}
	}

	public void agregarPersonaQueRespondioEncuesta(Persona_encuestada persona) {
		if (!this.personasQueRespondieron.contains(persona)) {

			if (persona.getEncuestasRespondidas().contains(this)) {
				
				this.personasQueRespondieron.add(persona);
			}
			agregarDniQuePersonaQueRespondion();
		}
	}
	
	private void agregarDniQuePersonaQueRespondion() {
		if(!this.personasQueRespondieron.isEmpty()) {
			
			for(Persona p : this.personasQueRespondieron) {
				this.dniPersonasQueRespondieron.add(p.getDni());
			}
		}
	}

	@Override
	public String toString() {
		return "Encuesta [nombre=" + nombre + "]";
	}
	
	

}
