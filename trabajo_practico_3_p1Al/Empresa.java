package trabajo_practico_3_p1Al;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Encuesta> encuestasRealizadas;
	private ArrayList<Encuesta_respondida> encuestasRespondidas;
	private double plusParaEmpleado;
	private int cantVEcesRespodidaMismaEncuesta;

	public Empresa() {
		this.plusParaEmpleado = 100;
		this.cantVEcesRespodidaMismaEncuesta = 1;
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

	public int getCantVEcesRespodidaMismaEncuesta() {
		return cantVEcesRespodidaMismaEncuesta;
	}

	public void setCantVEcesRespodidaMismaEncuesta(int cantVEcesRespodidaMismaEncuesta) {
		this.cantVEcesRespodidaMismaEncuesta = cantVEcesRespodidaMismaEncuesta;
	}

	public ArrayList<Encuesta> getEncuestasRealizadas() {
		return new ArrayList<Encuesta>(this.encuestasRealizadas);
	}

	public ArrayList<Encuesta_respondida> getEncuestasRespondidas() {
		return new ArrayList<Encuesta_respondida>(this.encuestasRespondidas);
	}

	public void agregarEncuestasAresponder(Encuesta encuesta) {

		if (!this.encuestasRealizadas.contains(encuesta)) {
			this.encuestasRealizadas.add(encuesta);
		}
	}

	public void agregarEncuestasRespondidas(Encuesta_respondida encuesta) {
		if (!this.encuestasRespondidas.contains(encuesta)) {
			boolean fueRespondida = false;
			for (Encuesta_respondida er : this.encuestasRespondidas) {
				if (er.equals(encuesta)) {
					fueRespondida = true;
				}
			}
			if (!fueRespondida) {
				this.encuestasRespondidas.add(encuesta);
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
