package trabajo_practico_3_p2;

public class Producto {

	private double peso, precioFabricacion, porcParaVender;
	private String nombre, tipoMadera, color;

	public Producto(String nombre, double peso, double precioFabricacion, String tipoMadera, String color) {
		this.nombre = nombre;
		this.peso = peso;
		this.precioFabricacion = precioFabricacion;
		this.porcParaVender = 35;
		this.tipoMadera = tipoMadera;
		this.color = color;
	}

	public Producto(String nombre, double peso, double precioFabricacion, double porc, String tipoMadera,
			String color) {
		this.nombre = nombre;
		this.peso = peso;
		this.precioFabricacion = precioFabricacion;
		this.porcParaVender = porc;
		this.tipoMadera = tipoMadera;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioFabricacion() {
		return precioFabricacion;
	}

	public void setPrecioFabricacion(double precioFabricacion) {
		this.precioFabricacion = precioFabricacion;
	}

	public double getPorcParaVender() {
		return porcParaVender;
	}

	public double getPrecioVenta() {

		return (this.getPrecioFabricacion() + (this.getPrecioFabricacion() * this.porcParaVender) / 100);
	}

	public String getTipoMadera() {
		return tipoMadera;
	}

	public void setTipoMadera(String tipoMadera) {
		this.tipoMadera = tipoMadera;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Producto [Nombe=" + nombre + "]";
	}

}
