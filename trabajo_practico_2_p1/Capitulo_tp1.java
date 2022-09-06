package trabajo_practico_2_p1;

import java.util.Objects;

public class Capitulo_tp1 {

	private String titulo, descripcion;
	private double calificacionPromedio;
	private int cantUsuariosCalif;
	private double sumaCalific;
	private boolean calificado;

	public Capitulo_tp1(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.calificacionPromedio = calcularCalificacion(sumaCalific, cantUsuariosCalif);
		this.cantUsuariosCalif = 0;
		this.sumaCalific = 0;
		this.calificado = false;
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

	public double getCalificacion() {
		return calificacionPromedio;
	}
	
	private double calcularCalificacion(double sumaCalific, int cantUsuarios) {
		double calif = 0;
		calif = sumaCalific/cantUsuarios;
		return calif;
	}

	public void setCalificacion(double calificacion) {
		this.calificacionPromedio = calificacion;
	}

	public int getCantUsuariosCalif() {
		return cantUsuariosCalif;
	}

	public void setCantUsuariosCalif() {
		this.cantUsuariosCalif ++;
	}

	public double getSumaCalific() {
		return sumaCalific;
	}

	public void setSumaCalific(double sumaCalific) {
		this.sumaCalific += sumaCalific;
	}
	

	public boolean isCalificado() {
		return calificado;
	}

	public void setCalificado(boolean calificado) {
		this.calificado = calificado;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Capitulo_tp1 other = (Capitulo_tp1) obj;
		return Double.doubleToLongBits(calificacionPromedio) == Double.doubleToLongBits(other.calificacionPromedio)
				&& cantUsuariosCalif == other.cantUsuariosCalif && Objects.equals(descripcion, other.descripcion)
				&& Double.doubleToLongBits(sumaCalific) == Double.doubleToLongBits(other.sumaCalific)
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Capitulo_tp1 [titulo=" + titulo + ", descripcion=" + descripcion;
	}
	
	
	
	
}
