package trabajo_practico_3_p1Al;

public class Encuesta_respondida {

	private Encuesta encuesta;
	private Persona_encuestada personaEncuestada;
	
	public Encuesta_respondida(Empleado empleado, Encuesta encuesta, Persona_encuestada personaEncuestada) {
		this.encuesta = encuesta;
		this.personaEncuestada = personaEncuestada;
	}	
	
	public Encuesta getEncuesta() {
		return encuesta;
	}

	public Persona_encuestada getPersonaEncuestada() {
		return personaEncuestada;
	}

	public int getDniPersonaEncuestada() {
		
		return this.personaEncuestada.getDni();
	}

	public boolean equals(Object o1) {
		try {
			Encuesta_respondida e = ((Encuesta_respondida)o1);
			if(e.getDniPersonaEncuestada() == this.getDniPersonaEncuestada()) {
				return true;
			}
		} catch(Exception e) {
			return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Encuesta_respondida [encuesta=" + encuesta + "]";
	}
	
	
}
