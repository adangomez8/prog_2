package trabajo_practico_3_p4;

public class Ciudad {
	
	private String nombre;

	public Ciudad(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return  nombre;
	}
	
	

}
