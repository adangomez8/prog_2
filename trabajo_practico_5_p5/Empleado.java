package trabajo_practico_5_p5;

public class Empleado {

	private String nomre, apellido;
	private int dni;
	protected double sueldo;
	
	public Empleado(String nomre, String apellido, int dni, double sueldo) {
		this.nomre = nomre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldo = sueldo;
	}

	public String getNomre() {
		return nomre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getDni() {
		return dni;
	}

	public double getSueldo() {
		return sueldo;
	}
	
	public boolean equals(Object ob) {
		
		Empleado e = ((Empleado)ob);
		if(e.dni==this.dni) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Empleado [nomre=" + nomre + ", apellido=" + apellido + "]";
	}
	
	
}
