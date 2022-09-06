package trabajo_practico_3_p3.Al;

public class Personaje {

	private String nombreReal, nombreSuperHeroe;
	private int vision_nocturna, fuerza, peso, altura, edad;

	public Personaje(String nombreReal, String nombreSuperHeroe, int vision_nocturna, int fuerza, int peso, int altura,
			int edad) {
		this.nombreReal = nombreReal;
		this.nombreSuperHeroe = nombreSuperHeroe;
		this.vision_nocturna = vision_nocturna;
		this.fuerza = fuerza;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}

	public String getNombreReal() {
		return nombreReal;
	}

	public String getNombreSuperHeroe() {
		return nombreSuperHeroe;
	}

	public int getVision_nocturna() {
		return vision_nocturna;
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getPeso() {
		return peso;
	}

	public int getAltura() {
		return altura;
	}

	public int getEdad() {
		return edad;
	}
	
	public Personaje compararVisionNocturna(Personaje personaje) {
		if (this.getVision_nocturna() > personaje.getVision_nocturna()) {
			return this;
		} else if (this.getVision_nocturna() > personaje.getVision_nocturna()) {
			return personaje;
		}
		return null;
	}
	
	
	public Personaje compararFuerza(Personaje personaje) {
		if (this.getFuerza() > personaje.getFuerza()) {
			return this;
		} else if (this.getFuerza() > personaje.getFuerza()) {
			return personaje;
		}
		return null;
	}

	public Personaje compararPeso(Personaje personaje) {
		if (this.getPeso() > personaje.getPeso()) {
			return this;
		} else if (this.getPeso() > personaje.getPeso()) {
			return personaje;
		}
		return null;
	}
	
	public Personaje compararAltura(Personaje personaje) {
		if (this.getAltura() > personaje.getAltura()) {
			return this;
		} else if (this.getAltura() > personaje.getAltura()) {
			return personaje;
		}
		return null;
	}
	
	public Personaje compararEdad(Personaje personaje) {
		if (this.getEdad() > personaje.getEdad()) {
			return this;
		} else if (this.getEdad() > personaje.getEdad()) {
			return personaje;
		}
		return null;
	}
	@Override
	public String toString() {
		return "Personaje [nombreReal=" + nombreReal + ", nombreSuperHeroe=" + nombreSuperHeroe + "]";
	}
}
