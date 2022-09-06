package trabajo_practico_4_p3;

public class Empleado_Xcomision extends Empleado {

	private double porcentajeXVenta;
	private int cantVentasRealizadas;
	
	public Empleado_Xcomision(String nombre, String apellido, double sueldo, double porcentajeXVenta,
			int cantVentasRealizadas) {
		super(nombre, apellido, sueldo);
		this.porcentajeXVenta = porcentajeXVenta;
		this.cantVentasRealizadas = cantVentasRealizadas;
	}
	
	

	public double getPorcentajeXVenta() {
		return porcentajeXVenta;
	}

	public void setPorcentajeXVenta(double porcentajeXVenta) {
		this.porcentajeXVenta = porcentajeXVenta;
	}

	public int getCantVentasRealizadas() {
		return cantVentasRealizadas;
	}

	public void setCantVentasRealizadas(int cantVentasRealizadas) {
		this.cantVentasRealizadas = cantVentasRealizadas;
	}
	
	public double getSueldo() {
		return super.getSueldo()+(this.cantVentasRealizadas*this.porcentajeXVenta);
	}
	
	
}
