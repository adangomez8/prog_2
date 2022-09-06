package trabajo_practico_4_p3;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Empleado>empleados;

	public Empresa() {
		this.empleados = new ArrayList<>();
	}

	public ArrayList<Empleado> getEmpleados() {
		return new ArrayList<Empleado>(this.empleados);
	}
	
	public void agregarEmpleado(Empleado empleado) {
		if(!this.empleados.contains(empleado)) {
			this.empleados.add(empleado);
		}
	}
	
	public double getSueldoEmpleado(Empleado empleado) {
		if(this.empleados.contains(empleado)) {
			return empleado.getSueldo();
		}
		else return -1;
	}
	
	
}
