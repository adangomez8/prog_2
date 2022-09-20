package trabajo_practico_5_p6;

public class Main_comite {

	public static void main(String[] args) {
	
		Evaluador_comun  e1= new Evaluador_comun("Juan", 231);
		Evaluador_comun  e2= new Evaluador_comun("María", 455);
		Evaluador_poster  e3= new Evaluador_poster("Pedro", 963);
		
		Trabajo tr1 = new Trabajo("Trabajo 1");
		Trabajo tr2 = new Trabajo("Trabajo 2");
		
		Comite comite = new Comite("Comité");
		
		comite.agregarEvaluador(e1);
		comite.agregarEvaluador(e2);
		comite.agregarEvaluador(e3);
		
		comite.agregarTrabajo(tr1);
		comite.agregarTrabajo(tr2);
		
		comite.agregarConocimientoGeneral("Algoritmo");
		comite.agregarConocimientoGeneral("lenguajes de programacion");
		
		comite.agregarConocimientoExperto("Agentes");
		comite.agregarConocimientoExperto("Visualizacion");
		comite.agregarConocimientoExperto("Redes de comunicacion");

		e1.agregarConocimiento("Algoritmo");
		e1.agregarConocimiento("lenguajes de programacion");
		
		e2.agregarConocimiento("Agentes");
		e2.agregarConocimiento("Visualizacion");
		e2.agregarConocimiento("Redes de comunicacion");
		
		e2.agregarConocimiento("Agentes");
		e2.agregarConocimiento("Visualizacion");	
		
		
		tr1.agregarPalabraCave("Agentes");
		tr1.agregarPalabraCave("Visualizacion");
		tr1.agregarPalabraCave("Redes de comunicacion");

		tr2.agregarPalabraCave("Algoritmo");
		tr2.agregarPalabraCave("lenguajes de programacion");
		
		tr1.asignarEvaluador(e3);
		//COMPRUEBO QUE EL EVALUADOR TENGA LOS CONOCIMIENTOS DEL TEMA DEL TRABAJO
		System.out.println(e3.esAptoParaTrabajo(tr1));
		System.out.println(tr1.getEvaluador());
		
		tr1.asignarEvaluador(e2);
		System.out.println(e2.esAptoParaTrabajo(tr1));
		System.out.println(tr1.getEvaluador());
		
		
		System.out.println("Evaluadores que pueden asignar el trabajo " + tr1.getNombre() + comite.getEvaluadoresParaTrabajo(tr1));
		System.out.println("Evaluadores que pueden asignar el trabajo " + tr2.getNombre() + comite.getEvaluadoresParaTrabajo(tr2));
		
		System.out.println("Trabajos que pueden ser asignados a " + e1.getNombre() + comite.getTrabajosParaEvaluador(e1));
		System.out.println("Trabajos que pueden ser asignados a " + e2.getNombre() + comite.getTrabajosParaEvaluador(e2));
		System.out.println("Trabajos que pueden ser asignados a " + e3.getNombre() + comite.getTrabajosParaEvaluador(e3));
		
		System.out.println("Cantidad de trabajos que tiene " + e1.getNombre() + ": " + comite.cantTrabajosDeEvaluador(e1));
		System.out.println("Cantidad de trabajos que tiene " + e2.getNombre() + ": " + comite.cantTrabajosDeEvaluador(e2));
		System.out.println("Cantidad de trabajos que tiene " + e3.getNombre() + ": " + comite.cantTrabajosDeEvaluador(e3));
		
		/*
		 * 
		 * 
		 * 
		 * */
		
		//PREGUNTAR
		
		System.out.println(e2.getNombre() + " es evaluador experto: " + comite.esEvaluadorExperto(e2));
		

	}

}
