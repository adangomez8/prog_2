package trabajo_practico_2_p3;

public class Impuesto {

	private String nombre;
	private double valor;
	
	public Impuesto(String nombre, double valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Impuesto [nombre=" + nombre + ", valor=" + valor + "]";
	}
	
	
	
}
