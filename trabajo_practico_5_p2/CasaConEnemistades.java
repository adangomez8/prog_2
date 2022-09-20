package trabajo_practico_5_p2;

import java.util.ArrayList;

public class CasaConEnemistades extends Casa{

	ArrayList<Casa>casasEnemigas;

	public CasaConEnemistades(String nombre, int cantMaxAlumnos) {
		super(nombre, cantMaxAlumnos);
		this.casasEnemigas = new ArrayList<Casa>();
	}

	public ArrayList<Casa> getCasasEnemigas() {
		return new ArrayList<Casa>(this.casasEnemigas);
	}
	
	public void agregarCasaEnemiga(Casa casa) {
		if(!this.casasEnemigas.contains(casa)) {
			this.casasEnemigas.add(casa);
		}
			
	}

	@Override
	public boolean condicionAgregarAlumno(Alumno alumn) {
		if ((!this.getAlumnos().contains(alumn)) && (this.getAlumnos().size() <= this.getCantMaxAlumnos())
				&& (cumpleCualidades(alumn))
				&& (!alumn.estuvoEnCasaEnemiga(this))&&(!alumn.permaneceAalgunaCasa())) {
			
			return true;
		}
		return false;
	}
}
