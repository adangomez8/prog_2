package trabajo_practico_2_p1;

import java.util.ArrayList;

public class Serie_tp1 {

	private String titulo, descripcion, creador, genero;
	private ArrayList<Temporada_tp1> temporadas;
	private double calificacionPromedio;
	
	public Serie_tp1(String titulo, String descripcion, String creador, String genero) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = new ArrayList<>();
		this.calificacionPromedio = getCalificacionPromedio();
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getCalificacionPromedio() {
		double calif = 0;
		int cantCap = 0;
		for (Temporada_tp1 t : this.temporadas) {
			if (t.getCalificacionPromedio() > 0) {
				calif += t.getCalificacionPromedio(); 
				cantCap++;
			}
		}

		return calif/cantCap;
	}

	public ArrayList<Temporada_tp1> getTemporadas() {
		return new ArrayList<Temporada_tp1>(this.temporadas);
	}

	public void agregarTemporada(Temporada_tp1 temp) {
		
		if(!this.temporadas.contains(temp)) {
			this.temporadas.add(temp);
		}
	}

	@Override
	public String toString() {
		return "Serie_tp1 [titulo=" + titulo + ", calificacionPromedio=" + calificacionPromedio + "]";
	}
	
	
	
}
