package trabajo_practico_5_p5;

public class Empleado_bono extends Empleado_ventas {

	private int cantMinVentas;
	private double bono;
	
	public Empleado_bono(String nomre, String apellido, int dni, double sueldo, int cantVentas, double porcVentas,
			int cantMinVentas, double bono) {
		super(nomre, apellido, dni, sueldo, cantVentas, porcVentas);
		this.cantMinVentas = cantMinVentas;
		this.bono = bono;
	}

	public int getCantMinVentas() {
		return cantMinVentas;
	}

	public double getBono() {
		return bono;
	}
	
	public boolean hizoMinimoVentas() {
		if(this.cantVentas>=this.cantMinVentas) {
			return true;
		}
		
		return false;
	}
	
	public double getSueldo() {
		if(hizoMinimoVentas()) {
			return this.sueldo + this.bono;
		}
		return this.sueldo;
	}
	
}
