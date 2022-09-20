package trabajo_practico_5_p2;

import java.util.ArrayList;

public class Alumno extends Persona {

	private ArrayList<String> cualidades;
	private ArrayList<Persona> familiales;
	private Casa casa;

	public Alumno(String nombre) {
		super(nombre);
		this.cualidades = new ArrayList<String>();
		this.familiales = new ArrayList<Persona>();
	}

	public ArrayList<String> getCualidades() {
		return new ArrayList<String>(this.cualidades);
	}

	private ArrayList<Persona> getFamiliales() {
		return new ArrayList<Persona>(this.familiales);
	}

	public void agregarFamiliar(Persona persona) {
		if (!this.familiales.contains(persona)) {
			this.familiales.add(persona);
		}
	}

	public void agregarCualidad(String cualidad) {
		if (!this.cualidades.contains(cualidad)) {
			this.cualidades.add(cualidad);
		}
	}
	
	public boolean permaneceAalgunaCasa() {
		
		if(this.casa!=null) {
			return true;
		}
		return false;
	}

	public boolean familiarPermaneceMismaCasaQueAlumno(Casa casa) {

		for (int i = 0; i < this.getFamiliales().size(); i++) {
			if (casa.getFamiliales().contains(this.familiales.get(i))) {
				return true;
			}
		}
		return false;
	}

	public boolean estuvoEnCasaEnemiga(CasaConEnemistades casa) {

		for (int i = 0; i < this.getCasasEnLaQueEstuvo().size(); i++) {
			for (int j = 0; j < casa.getCasasEnemigas().size(); j++) {

				if (this.getCasasEnLaQueEstuvo().get(i).equals(casa.getCasasEnemigas().get(j))) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void asignarCasa(Casa casa) {
		if(this.casa!=null) {
			this.casa = casa;
		}
	}

	public void setCasa(Casa casa) {
		this.casa = casa;
	}
}
