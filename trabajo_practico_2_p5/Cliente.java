package trabajo_practico_2_p5;

public class Cliente extends Persona{

	private Peluquero peluquero;
	
	public Cliente(String nombre, String apellido, Peluquero peluquero) {
		super(nombre, apellido);
		this.peluquero = peluquero;
	}

	public Peluquero getPeluquero() {
		return peluquero;
	}

	public void setPeluquero(Peluquero peluquero) {
		this.peluquero = peluquero;
	}
	
	
}
