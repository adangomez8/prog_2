package trabajo_practico_4_p4;

import java.time.LocalDate;

public class Entrenador extends Contingente {

	private int id;

	public Entrenador(String nombre, String apellido, int nroPasaporte, LocalDate fechaNac, boolean viajando,
			boolean concentrando, boolean enPaisDeOrigen, int id) {
		super(nombre, apellido, nroPasaporte, fechaNac, viajando, concentrando, enPaisDeOrigen);
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public boolean equals(Object o1) {
		try {
			Entrenador e = ((Entrenador)o1);
			if(e.getId() == this.getId()) {
				return true;
			}
		} catch(Exception e) {
			return false;
		}
		return false;
	}
}
