package trabajo_practico_5_p1;

public class Elemento {

	private String nombre;

	public Elemento(String nombre) {
		super();
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
		return "Elemento [nombre=" + nombre + "]";
	}
	
	
}
