package trabajo_practico_1;

import java.time.LocalDate;
public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaNac;
	private int dni;
	private String sexo;
	private double peso;
	private double altura;

	public Persona(String nombre, String apellido, LocalDate fechaNac, int dni, String sexo, double peso,
			double altura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = calcularEdad(fechaNac);
		this.fechaNac = fechaNac;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public Persona(int dni) {
		this("N", "N", LocalDate.of(2000, 1, 1), dni, "Femenino", 1, 1);
	}

	public Persona(int dni, String nombre, String apellido) {
		this(nombre, apellido, LocalDate.of(2000, 1, 1), dni, "Femenino", 1, 1);
	}

	public Persona(int dni, String nombre, String apellido, LocalDate fechaNac) {
		this(nombre, apellido, fechaNac, dni, "Femenino", 1, 1);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public int getDni() {
		return dni;
	}

	public String getSexo() {
		return sexo;
	}

	private int calcularEdad(LocalDate fechaNac) {
		int edad = 0;
		LocalDate hoy = LocalDate.now();
		int diferencia = hoy.getYear() - fechaNac.getYear();

		if (hoy.getYear() > fechaNac.getYear()) {
			if (hoy.getMonthValue() > fechaNac.getMonthValue()) {
				if (hoy.getDayOfMonth() > fechaNac.getDayOfMonth()) {
					edad = diferencia;
				} else {
					edad = diferencia + 1;
				}
			} else {
				edad = diferencia + 1;
			}
		}
		return edad;
	}

	public double calcularImc(double peso, double altura) {

		double imc = peso / (altura/100 * altura/100);

		if ((imc > 18.5) && (imc < 25)) {
			System.out.println("Está en forma");
		} else {
			System.out.println("No está en forma");
		}
		return imc;
	}

	public boolean esCumple(LocalDate fechaNac) {
		LocalDate hoy = LocalDate.now();

		if (hoy.getMonthValue() == fechaNac.getMonthValue()) {
			if (hoy.getDayOfMonth() == fechaNac.getDayOfMonth()) {
				return true;
			}
		}

		return false;
	}

	public boolean esMayor(int edad) {
		if (edad >= 18) {
			return true;
		}
		return false;
	}

	public boolean puedeVotar(int edad) {
		if (edad >= 16) {
			return true;
		}
		return false;
	}

}
