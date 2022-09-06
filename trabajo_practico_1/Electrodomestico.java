package trabajo_practico_1;

public class Electrodomestico {

	/*nombre, precio base, color, consumo energético y peso. 
	 */
	private String nombre;
	private double precioBase;
	private String color;
	private double consumo;
	private double peso;
	
	public Electrodomestico(String nombre) {
		this.nombre = nombre;
		this.precioBase = 100;
		this.color = "Gris plata";
		this.consumo = 10;
		this.peso = 2;
	}
	
	public Electrodomestico(String nombre, double precioBase, String color, double consumo, double peso) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}
	
	public boolean esBajoConsumo (double consumo) {
		if(consumo < 45) {
			System.out.println("Es bajo consumo");
			return true;
		}else {
			System.out.println("No es bajo consumo");
			return false;
		}
	}
	
	public double getBalance(double precio, double peso) {
		return precio/peso;
	}
	
	public boolean esAltaGama(double precio, double peso) {
		return getBalance(precio, peso)>3;
	}
}
