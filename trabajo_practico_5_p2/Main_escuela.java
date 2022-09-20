package trabajo_practico_5_p2;

public class Main_escuela {
	
	public static void main(String[] args) {
		
	Persona per1 = new Persona("Juan");
	Persona per2 = new Persona("María");
	
	Alumno alumn1 = new Alumno("Martin");
	Alumno alumn2 = new Alumno("Martina");
	Alumno alumn3 = new Alumno("Julian");	
	Alumno alumn4 = new Alumno("Juliana");
	Alumno alumn5 = new Alumno("Julia");
	
	CasaNormal gryffindor = new CasaNormal("Gryffindor", 50);
	CasaExigente hufflepuff = new CasaExigente("Hufflepuff", 40);
	CasaConEnemistades ravenclaw = new CasaConEnemistades("Ravenclaw", 30);
	
	alumn1.agregarCualidad("Valor");
	alumn1.agregarCualidad("Fuerza");
	alumn1.agregarCualidad("Audacia");
	alumn1.agregarCualidad("Justicia");
	alumn1.agregarCualidad("Lealtad");
	alumn1.agregarCualidad("Paciencia");
	
	alumn1.agregarFamiliar(per1);
	
	alumn2.agregarCualidad("Valor");
	alumn2.agregarCualidad("Fuerza");
	
	
	gryffindor.agregarCualidad("Valor");
	gryffindor.agregarCualidad("Fuerza");
	gryffindor.agregarCualidad("Audacia");
	
	gryffindor.agregarAlumno(alumn1);
	gryffindor.agregarAlumno(alumn2);
	
	System.out.println("Alumnos de " + gryffindor.getNombre() + ": " + gryffindor.getAlumnos());
	
	hufflepuff.agregarCualidad("Justicia");
	hufflepuff.agregarCualidad("Lealtad");
	hufflepuff.agregarCualidad("Paciencia");
	
	alumn3.agregarCualidad("Justicia");
	alumn3.agregarCualidad("Lealtad");
	alumn3.agregarCualidad("Paciencia");
	alumn3.agregarFamiliar(per2);
	
	hufflepuff.agregarFamiliar(per2);
	hufflepuff.agregarAlumno(alumn1);
	hufflepuff.agregarAlumno(alumn2);
	hufflepuff.agregarAlumno(alumn3);
	
	System.out.println("Alumnos de " + hufflepuff.getNombre() + ": " + hufflepuff.getAlumnos());
	
	ravenclaw.agregarCualidad("Creatividad");
	ravenclaw.agregarCualidad("Erudiccion");
	ravenclaw.agregarCualidad("Inteligencia");
	
	ravenclaw.agregarCasaEnemiga(hufflepuff);
	
	alumn4.agregarCualidad("Creatividad");
	alumn4.agregarCualidad("Erudiccion");
	alumn4.agregarCualidad("Inteligencia");
	
	alumn5.agregarCualidad("Creatividad");
	alumn5.agregarCualidad("Erudiccion");
	alumn5.agregarCualidad("Inteligencia");
	
	System.out.println();
	System.out.println(alumn1.getNombre() +" cumple: " + ravenclaw.condicionAgregarAlumno(alumn1));
	System.out.println(alumn2.getNombre() +" cumple: " + ravenclaw.condicionAgregarAlumno(alumn2));
	System.out.println(alumn3.getNombre() +" cumple: " + ravenclaw.condicionAgregarAlumno(alumn3));
	System.out.println(alumn4.getNombre() +" cumple: " + ravenclaw.condicionAgregarAlumno(alumn4));
	System.out.println(alumn5.getNombre() +" cumple: " + ravenclaw.condicionAgregarAlumno(alumn5));
	
	ravenclaw.agregarAlumno(alumn4);
	ravenclaw.agregarAlumno(alumn5);
	
	//PREGUNTO SI EL ALUMNO ESTUVO EN CASA ENEMIGA
	System.out.println();
	System.out.println(alumn4.getNombre() + " " + alumn4.estuvoEnCasaEnemiga(ravenclaw));
	System.out.println(alumn5.getNombre() + " " + alumn5.estuvoEnCasaEnemiga(ravenclaw));
	
	System.out.println();
	System.out.println("Alumnos de " + ravenclaw.getNombre() + ": " + ravenclaw.getAlumnos());
	
	
	

	}
}
