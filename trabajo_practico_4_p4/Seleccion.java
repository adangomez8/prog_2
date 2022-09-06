package trabajo_practico_4_p4;

import java.util.ArrayList;

public class Seleccion {
	
	private String nombre;
	private ArrayList<Contingente>contingentes;
	
	public Seleccion(String nombre) {
		super();
		this.nombre = nombre;
		this.contingentes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Contingente> getContingentes() {
		return new ArrayList<Contingente>(this.contingentes);
	}
	
	public void agregarContingente(Contingente contingente) {
		if(!this.contingentes.contains(contingente)) {
					this.contingentes.add(contingente);			
		}
	}
	
	public boolean estaDisponible(Contingente contingente) {
		if(this.contingentes.contains(contingente)) {
			return contingente.estaDisponible();			
		}
		return false;
	}
	
	
	

}
