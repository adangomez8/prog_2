package trabajo_practico_2_p1;

import java.util.ArrayList;
import java.util.Objects;

public class Temporada_tp1 {

	private int nroTemp;
	private String nombre;
	private ArrayList<Capitulo_tp1> capitulos;
	private double calificacionPromedio;

	public Temporada_tp1(int nroTemp, String nombre) {
		this.nroTemp = nroTemp;
		this.nombre = nombre;
		this.capitulos = new ArrayList<>();
		this.calificacionPromedio = getCalificacionPromedio();
	}

	public int getNroTemp() {
		return nroTemp;
	}

	public void setNroTemp(int nroTemp) {
		this.nroTemp = nroTemp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCalificacionPromedio() {
		double calif = 0;
		int cantCap = 0;
		for (Capitulo_tp1 c : this.capitulos) {
			if (c.isCalificado()) {
				calif += c.getCalificacion(); 
				cantCap++;
			}
		}

		return calif/cantCap;
	}

	public ArrayList<Capitulo_tp1> getCapitulos() {
		return new ArrayList<Capitulo_tp1>(this.capitulos);
	}

	public void agregarCapituloATemporada(Capitulo_tp1 cap) {
		if (!this.capitulos.contains(cap)) {
			this.capitulos.add(cap);
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temporada_tp1 other = (Temporada_tp1) obj;
		return Double.doubleToLongBits(calificacionPromedio) == Double.doubleToLongBits(other.calificacionPromedio)
				&& Objects.equals(capitulos, other.capitulos)
				&& Objects.equals(nombre, other.nombre) && nroTemp == other.nroTemp;
	}

}
