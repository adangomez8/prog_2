package trabajo_practico_3_p1;


public class Main_empresa {

	public static void main(String[] args) {
		
		Persona_encuestada perEnc1 = new Persona_encuestada("Juan", "Perez", 123);
		Persona_encuestada perEnc2 = new Persona_encuestada("María", "Gonzalez", 213);
		
		Empleado emp1 = new Empleado("Martín", "Gómez", 456, 1000);
		
		Encuesta enc1 = new Encuesta("Encuesta 1", emp1);
		Encuesta enc2 = new Encuesta("Encuesta 2", emp1);
		Encuesta enc3 = new Encuesta("Encuesta 3", emp1);
		
		Empresa empresa1 = new Empresa();
		
		enc1.agregarPregunta("Pregunta 1");
		enc1.agregarPregunta("Pregunta 2");
		enc1.agregarPregunta("Pregunta 3");
		enc1.agregarPregunta("Pregunta 4");
		enc1.agregarPregunta("Pregunta 5");
		
		enc2.agregarPregunta("Pregunta 1");
		enc2.agregarPregunta("Pregunta 2");
		enc2.agregarPregunta("Pregunta 3");
		enc2.agregarPregunta("Pregunta 4");
		enc2.agregarPregunta("Pregunta 5");
		
		enc3.agregarPregunta("Pregunta 1");
		enc3.agregarPregunta("Pregunta 2");
		enc3.agregarPregunta("Pregunta 3");
		enc3.agregarPregunta("Pregunta 4");
		enc3.agregarPregunta("Pregunta 5");
		
		perEnc1.responderEncuesta(enc1);
		perEnc2.responderEncuesta(enc2);
		
		enc1.agregarPersonaQueRespondioEncuesta(perEnc1);
		enc2.agregarPersonaQueRespondioEncuesta(perEnc2);
		
		//System.out.println(enc1.getPersonasQueRespondieron().size());
		//System.out.println(enc2.getPersonasQueRespondieron().size());
		empresa1.agregarEncuestasAresponder(enc1);
		empresa1.agregarEncuestasAresponder(enc2);
		empresa1.agregarEncuestasAresponder(enc3);
		
		empresa1.agregarEncuestasRespondidas();
		
		System.out.println(empresa1.getEncuestasRealizadas().size());
		System.out.println("Encuestas Respondidas: "+empresa1.getEncuestasRespondidas());
		System.out.println("Sueldo empleado: $" + emp1.getSueldo() + ". Total a cobrar con el plus: $" + empresa1.getSueldoEmpleado(emp1));

	}

}
