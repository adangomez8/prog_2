package trabajo_practico_2_p3;

import java.util.ArrayList;

public class Pais {

	private String nombre;
	private ArrayList<Provincia>provincias;
	
	public Pais(String nombre) {
		this.nombre = nombre;
		this.provincias = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Provincia> getProvincias() {
		return new ArrayList<Provincia>(this.provincias);
	}
	
	public void agregarProvinciaApais(Provincia prov) {
		if(!this.provincias.contains(prov)) {
			this.provincias.add(prov);
		}
	}
	
	public ArrayList<Provincia> getProvinciasConMasDeLaMitadCiudadesEnDeficil(){
		ArrayList<Provincia>provinciasConMasDeLaMitadCiudadesEnDeficil = new ArrayList<>();

		for(Provincia p : this.provincias) {
			if((p.getCiudadesEnDeficil().size())>(p.getCiudades().size()/2)) {
				provinciasConMasDeLaMitadCiudadesEnDeficil.add(p);
			}
		}
		return provinciasConMasDeLaMitadCiudadesEnDeficil;
	}
	
}
