package trabajo_practico_5_p2;

public class CasaExigente extends Casa {

	public CasaExigente(String nombre, int cantMaxAlumnos) {
		super(nombre, cantMaxAlumnos);
	}

	@Override
	public boolean condicionAgregarAlumno(Alumno alumn) {
		if ((!this.getAlumnos().contains(alumn)) && (this.getAlumnos().size() <= this.getCantMaxAlumnos())
				&& (cumpleCualidades(alumn))
				&& (alumn.familiarPermaneceMismaCasaQueAlumno(this))&&(!alumn.permaneceAalgunaCasa())) {
			
			return true;
		}
		return false;
	}
}
