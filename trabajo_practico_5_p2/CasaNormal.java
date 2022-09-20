package trabajo_practico_5_p2;

public class CasaNormal extends Casa {

	public CasaNormal(String nombre, int cantMaxAlumnos) {
		super(nombre, cantMaxAlumnos);
	}

	@Override
	public boolean condicionAgregarAlumno(Alumno alumn) {
		if((!this.getAlumnos().contains(alumn)) && (getAlumnos().size() <= getCantMaxAlumnos())
		&& (cumpleCualidades(alumn))&&(!alumn.permaneceAalgunaCasa())) {
			return true;
		}
		return false;
	}

}
