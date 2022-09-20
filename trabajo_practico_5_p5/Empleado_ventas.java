package trabajo_practico_5_p5;

public class Empleado_ventas extends Empleado {

	protected int cantVentas;
	private double porcVentas;
	
	public Empleado_ventas(String nomre, String apellido, int dni, double sueldo, int cantVentas, double porcVentas) {
		super(nomre, apellido, dni, sueldo);
		this.cantVentas = cantVentas;
		this.porcVentas = porcVentas;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public double getPorcVentas() {
		return porcVentas;
	}
	
	public double getSueldo() {
		return (super.getSueldo()+((this.cantVentas*this.porcVentas)/100));
	}
}
