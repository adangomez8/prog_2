package trabajo_practico_3_p1;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Encuesta> encuestasRealizadas;
	private ArrayList<Encuesta> encuestasRespondidas;
	private double plusParaEmpleado;

	public Empresa() {
		this.plusParaEmpleado = 100;
		this.encuestasRealizadas = new ArrayList<>();
		this.encuestasRespondidas = new ArrayList<>();
	}

	public Empresa(double plusParaEmpleado) {
		this.plusParaEmpleado = plusParaEmpleado;
		this.encuestasRealizadas = new ArrayList<>();
		this.encuestasRespondidas = new ArrayList<>();
	}

	public double getPlusParaEmpleado() {
		return plusParaEmpleado;
	}

	public void setPlusParaEmpleado(double plusParaEmpleado) {
		this.plusParaEmpleado = plusParaEmpleado;
	}

	public ArrayList<Encuesta> getEncuestasRealizadas() {
		return new ArrayList<Encuesta>(this.encuestasRealizadas);
	}

	public ArrayList<Encuesta> getEncuestasRespondidas() {
		return new ArrayList<Encuesta>(this.encuestasRespondidas);
	}

	public void agregarEncuestasAresponder(Encuesta encuesta) {

		if ((!this.encuestasRealizadas.contains(encuesta)) && (!this.encuestasRespondidas.contains(encuesta))) {
			this.encuestasRealizadas.add(encuesta);
		}
	}

	public void agregarEncuestasRespondidas() {

		if (!this.encuestasRealizadas.isEmpty()) {
			for (Encuesta e : this.encuestasRealizadas) {
				if (!e.getPersonasQueRespondieron().isEmpty()) {
					this.encuestasRespondidas.add(e);
				}
			}
		}
	}

	public double getSueldoEmpleado(Empleado empleado) {

		double totalAcobrar = 0;
		int cantEncuestasPorEmpleado = 0;

		for (Encuesta e : this.encuestasRealizadas) {
			if (e.getEmpleadoQueHaceEncuesta().equals(empleado)) {
				cantEncuestasPorEmpleado++;
			}
		}

		totalAcobrar = (empleado.getSueldo() + (cantEncuestasPorEmpleado * this.plusParaEmpleado));

		return totalAcobrar;
	}

}
