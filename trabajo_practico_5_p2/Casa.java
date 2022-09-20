package trabajo_practico_5_p2;

import java.util.ArrayList;


public abstract class Casa {

	private String nombre;
	private int cantMaxAlumnos;
	private ArrayList<String> cualidades;
	private ArrayList<Alumno> alumnos;
	private ArrayList<Persona> familiales;

	public Casa(String nombre, int cantMaxAlumnos) {
		this.nombre = nombre;
		this.cantMaxAlumnos = cantMaxAlumnos;
		this.cualidades = new ArrayList<String>();
		this.alumnos = new ArrayList<Alumno>();
		this.familiales = new ArrayList<Persona>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantMaxAlumnos() {
		return cantMaxAlumnos;
	}

	public void setCantMaxAlumnos(int cantMaxAlumnos) {
		this.cantMaxAlumnos = cantMaxAlumnos;
	}

	protected ArrayList<String> getCualidades() {
		return new ArrayList<String>(this.cualidades);
	}

	protected ArrayList<Alumno> getAlumnos() {
		return new ArrayList<Alumno>(this.alumnos);
	}

	public ArrayList<Persona> getFamiliales() {
		return new ArrayList<Persona>(this.familiales);
	}

	public void agregarAlumno(Alumno alumn) {
		int capacidad = this.cantMaxAlumnos;
		if (condicionAgregarAlumno(alumn)) {
			this.alumnos.add(alumn);
			alumn.agregarCasaEnLaQueEstuvo(this);
			alumn.asignarCasa(this);
			capacidad--;
		}else if(alumn.permaneceAalgunaCasa()) {
			alumn.setCasa(this);
			alumn.agregarCasaEnLaQueEstuvo(this);
			capacidad--;
		}
	}

	public abstract boolean condicionAgregarAlumno(Alumno alumn);

	protected boolean cumpleCualidades(Alumno alumn) {
		int cantCualidadesAcumplir = this.cualidades.size();
		for(int i = 0; i< alumn.getCualidades().size(); i++) {
			for(int j = 0; j<this.cualidades.size(); j++) {
				if(alumn.getCualidades().get(i).equals(this.cualidades.get(j))) {
					cantCualidadesAcumplir--;
				}
			}
		}
		if(cantCualidadesAcumplir<=0) {
			return true;
		}
		return false;
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
	
	public boolean equals(Object o1) {
		try {
			Casa c = ((Casa)o1);
			if(c.getNombre() == this.getNombre()) {
				return true;
			}
		} catch(Exception e) {
			return false;
		}
		return false;
	}
	

	
}
