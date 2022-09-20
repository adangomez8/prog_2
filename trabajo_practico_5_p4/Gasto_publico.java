package trabajo_practico_5_p4;

public class Gasto_publico {
	
	private String nombre;
	private double valor;
	
	public Gasto_publico(String nombre, double valor) {
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
		return "Gasto_publico [nombre=" + nombre + ", valor=" + valor + "]";
	}
	
	

}
