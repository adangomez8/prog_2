package trabajo_practico_5_p4;

import java.util.ArrayList;

public class Provincia {
	
	private String nombre;
	private ArrayList<Ciudad>ciudades;
	private int cantMinimaHabitantesParaCalcularImp;
	
	public Provincia(String nombre) {
		this.nombre = nombre;
		this.ciudades = new ArrayList<>();
		this.cantMinimaHabitantesParaCalcularImp = 100000;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Ciudad> getCiudades() {
		return new ArrayList<Ciudad>(this.ciudades);
	}
	
	public void agregarCiudadApais(Ciudad ciudad) {
		if(!this.ciudades.contains(ciudad)) {
			this.ciudades.add(ciudad);
		}
	}

	public ArrayList<Ciudad> getCiudadesEnDeficil(){
		ArrayList<Ciudad>ciudadesEnDificit = new ArrayList<>();

		for(Ciudad c : this.ciudades) {
			if(c.gastaMasQueLoRecaudado()) {
				ciudadesEnDificit.add(c);
			}
		}
		return ciudadesEnDificit;
	}

	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + "]";
	}
	
	
}
