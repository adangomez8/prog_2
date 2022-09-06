package trabajo_practico_3_p4;

import java.time.LocalDate;

public class Contacto {
	
	private String nombre,apellido, direccion, mail;
	private Ciudad ciudad;
	private LocalDate fechaNacimiento;
	private int nroTelefono;
	
	public Contacto(String nombre, String apellido, String direccion, Ciudad ciudad, String mail, LocalDate fechaNacimiento,
			int nroTelefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.mail = mail;
		this.fechaNacimiento = fechaNacimiento;
		this.nroTelefono = nroTelefono;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getNroTelefono() {
		return nroTelefono;
	}

	public void setNroTelefono(int nroTelefono) {
		this.nroTelefono = nroTelefono;
	}
	
	public int getEdad() {
		int edad = 0;
		LocalDate hoy = LocalDate.now();
		int diferencia = hoy.getYear() - fechaNacimiento.getYear();

		if (hoy.getYear() > fechaNacimiento.getYear()) {
			if (hoy.getMonthValue() > fechaNacimiento.getMonthValue()) {
				if (hoy.getDayOfMonth() > fechaNacimiento.getDayOfMonth()) {
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
	
	public boolean contactoRepetido (Contacto contacto) {

		if(this.equals(contacto)) {
			return true;
		}
		return false;
		
	}
	
	public boolean mismoNumero (Contacto contacto) {

		if(this.getNroTelefono()==contacto.getNroTelefono()) {
			return true;
		}
		return false;
		
	}
	
	public boolean equals(Object o1) {
		try {
			Contacto c = ((Contacto)o1);
			if(c.getNombre() == this.getNombre() && c.getApellido() == this.getApellido() && c.getNroTelefono() == this.getNroTelefono()) {
				return true;
			}
		} catch(Exception e) {
			return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellido=" + apellido + ", nroTelefono=" + nroTelefono + ", Edad: " + this.getEdad()+ ", ciudad: "+ this.getCiudad() +"]";
	}
	
	
	
	

}
