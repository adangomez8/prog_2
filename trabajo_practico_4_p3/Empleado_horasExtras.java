package trabajo_practico_4_p3;

public class Empleado_horasExtras extends Empleado {

	private double extraXhoraTrabajada;
	private int cantHorasExtrasTrabajadas;

	public Empleado_horasExtras(String nombre, String apellido, double sueldo, double extraXhoraTrabajada,
			int cantHorasExtrasTrabajadas) {
		super(nombre, apellido, sueldo);
		this.extraXhoraTrabajada = extraXhoraTrabajada;
		this.cantHorasExtrasTrabajadas = cantHorasExtrasTrabajadas;
	}

	public double getExtraXhoraTrabajada() {
		return extraXhoraTrabajada;
	}

	public void setExtraXhoraTrabajada(double extraXhoraTrabajada) {
		this.extraXhoraTrabajada = extraXhoraTrabajada;
	}

	public int getCantHorasExtrasTrabajadas() {
		return cantHorasExtrasTrabajadas;
	}

	public void setCantHorasExtrasTrabajadas(int cantHorasExtrasTrabajadas) {
		this.cantHorasExtrasTrabajadas = cantHorasExtrasTrabajadas;
	}
	
	public double getSueldo() {
		return super.getSueldo()+(this.cantHorasExtrasTrabajadas*this.extraXhoraTrabajada);
	}
	
}
