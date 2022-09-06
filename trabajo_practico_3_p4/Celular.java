package trabajo_practico_3_p4;

import java.util.ArrayList;

public class Celular {

	private ArrayList<Contacto> contactos;
	private ArrayList<Contacto> contactos_repetidos;
	private ArrayList<Contacto> contactos_mismoNroTelefono;

	public Celular() {
		this.contactos = new ArrayList<>();
		this.contactos_repetidos = new ArrayList<>();
		this.contactos_mismoNroTelefono = new ArrayList<>();
	}

	public ArrayList<Contacto> getContactos() {
		return new ArrayList<Contacto>(this.contactos);
	}

	public ArrayList<Contacto> getContactos_repetidos() {
		return new ArrayList<Contacto>(this.contactos_repetidos);
	}

	public ArrayList<Contacto> getContactos_mismoNroTelefono() {
		return new ArrayList<Contacto>(this.contactos_mismoNroTelefono);
	}

	public void agregarContacto(Contacto contacto) {
		if (!this.contactos.contains(contacto)) {
			this.contactos.add(contacto);
		} else {
			if (this.esContactoRepetido(contacto)) {
				this.contactos_repetidos.add(contacto);
			}
			if (this.tieneMismoNumeroTelefono(contacto)) {
				this.contactos_mismoNroTelefono.add(contacto);
			}
		}
	}

	public boolean esContactoRepetido(Contacto contacto) {

		for (Contacto c : this.contactos) {
			if (c.contactoRepetido(contacto)) {
				return true;
			}
		}

		return false;
	}
	
	public boolean tieneMismoNumeroTelefono(Contacto contacto) {

		for (Contacto c : this.contactos) {
			if (c.mismoNumero(contacto)) {
				return true;
			}
		}

		return false;
	}
	public double getPromedioEdad() {
		
		int totalEdad = 1;
		int cantContactos = 1;
		
		for(Contacto c : this.contactos) {
			totalEdad += c.getEdad();
			cantContactos++;
		}
		
		return totalEdad/cantContactos;
	}

}
