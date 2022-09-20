package trabajo_practico_5_p6;

import java.util.ArrayList;

public class Comite {

	private String nombre;
	private ArrayList<Evaluador> evaluadores;
	private ArrayList<Trabajo> trabajos;
	private ArrayList<String> conocimientosGeneral;
	private ArrayList<String> conocimientosExperto;

	public Comite(String nombre) {
		this.nombre = nombre;
		this.evaluadores = new ArrayList<Evaluador>();
		this.trabajos = new ArrayList<Trabajo>();
		this.conocimientosGeneral = new ArrayList<String>();
		this.conocimientosExperto = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Evaluador> getEvaluadores() {
		return new ArrayList<Evaluador>(this.evaluadores);
	}

	public ArrayList<Trabajo> getTrabajos() {
		return new ArrayList<Trabajo>(this.trabajos);
	}

	public ArrayList<String> getConocimientosGenerales() {

		return new ArrayList<String>(this.conocimientosGeneral);
	}

	public ArrayList<String> getConocimientosExperto() {

		return new ArrayList<String>(this.conocimientosExperto);
	}

	public void agregarEvaluador(Evaluador eval) {
		if (!this.evaluadores.contains(eval)) {
			this.evaluadores.add(eval);
		}
	}

	public void agregarTrabajo(Trabajo trab) {
		if (!this.trabajos.contains(trab)) {
			this.trabajos.add(trab);
		}
	}

	public void agregarConocimientoGeneral(String conoc) {
		if (!this.conocimientosGeneral.contains(conoc)) {
			this.conocimientosGeneral.add(conoc);
		}
	}

	public void agregarConocimientoExperto(String conoc) {
		if (!this.conocimientosExperto.contains(conoc)) {
			this.conocimientosExperto.add(conoc);
		}
	}

	public ArrayList<Evaluador> getEvaluadoresGenerales() {

		ArrayList<Evaluador> evaluadoresGenerales = new ArrayList<Evaluador>();

		for (Evaluador e : this.evaluadores) {
			// Abstract
			if (!this.esEvaluadorExperto(e)) {
				evaluadoresGenerales.add(e);
			}
		}
		return evaluadoresGenerales;
	}

	public ArrayList<Evaluador> getEvaluadoresExpertos() {
		ArrayList<Evaluador> evaluadoresExpertos = new ArrayList<Evaluador>();

		for (Evaluador e : this.evaluadores) {


				if (this.esEvaluadorExperto(e)) {
					evaluadoresExpertos.add(e);
				}
			}

		
		return evaluadoresExpertos;
	}

	public ArrayList<Evaluador> getEvaluadoresParaTrabajo(Trabajo trabajo) {

		ArrayList<Evaluador> evaluadores = new ArrayList<Evaluador>();

		for (Evaluador e : this.evaluadores) {
			if (e.esAptoParaTrabajo(trabajo)) {
				evaluadores.add(e);
			}
		}

		return evaluadores;
	}

	public ArrayList<Trabajo> getTrabajosParaEvaluador(Evaluador evaluador) {

		ArrayList<Trabajo> trabajos = new ArrayList<Trabajo>();

		for (Trabajo t : this.trabajos) {
			if (evaluador.esAptoParaTrabajo(t)) {
				trabajos.add(t);
			}
		}

		return trabajos;
	}

	public int cantTrabajosDeEvaluador(Evaluador evaluador) {

		return evaluador.cantTrabajosDeEvaluador(this);
	}

	public Boolean esEvaluadorExperto(Evaluador evaluador) {

		for (String c : this.conocimientosExperto) {

			if (evaluador.contieneConocimiento(c)) {
				return true;
			}
		}
			return false;
	}
}
