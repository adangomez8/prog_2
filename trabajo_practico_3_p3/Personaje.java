package trabajo_practico_3_p3;

import java.util.HashMap;

public class Personaje {

	private String nombreReal, nombreSuperHeroe;
	private HashMap<String, Integer> cualidades;

	public Personaje(String nombreReal, String nombreSuperHeroe) {
		this.nombreReal = nombreReal;
		this.nombreSuperHeroe = nombreSuperHeroe;
		this.cualidades = new HashMap<>();
	}

	public String getNombreReal() {
		return nombreReal;
	}

	public String getNombreSuperHeroe() {
		return nombreSuperHeroe;
	}

	public HashMap<String, Integer> getCualidades() {
		return new HashMap<>(this.cualidades);
	}

	public void agregarCualidad(String nombre, int num) {
		if (!this.cualidades.containsKey(nombre)) {
			if (nombre != null) {
				this.cualidades.put(nombre, num);
			}
		}
	}
	
	public Personaje compararCualidad(Personaje personaje, String cualidad) {
		if(this.getCualidades().get(cualidad)>personaje.getCualidades().get(cualidad)) {
			return this;
		}else if(this.getCualidades().get(cualidad)<personaje.getCualidades().get(cualidad)) {
			return personaje;
		}
		return null;
	}

	@Override
	public String toString() {
		return "Personaje [nombreReal=" + nombreReal + ", nombreSuperHeroe=" + nombreSuperHeroe + "]";
	}
}
