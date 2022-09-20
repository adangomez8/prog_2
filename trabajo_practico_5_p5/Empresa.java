package trabajo_practico_5_p5;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private ArrayList<Empleado>empleados;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.empleados = new ArrayList<Empleado>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Empleado> getEmpleados() {
		return new ArrayList<Empleado>(this.empleados);
	}
	
	public void agregarEmpleado(Empleado empleado) {
		if(!this.empleados.contains(empleado)) {
			this.empleados.add(empleado);
		}
	}
	
	public double getGastosEnSueldos() {
		double total = 0;
		
		for(Empleado e : this.empleados) {
			total += e.getSueldo();
		}
		
		return total;
	}
	
}
