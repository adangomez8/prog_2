package trabajo_practico_5_p6;

import java.util.ArrayList;

public class Trabajo {

	private String nombre;
	private ArrayList<String> palabrasClaves;
	private Evaluador evaluador;
	
	public Trabajo(String nombre) {
		this.nombre = nombre;
		this.palabrasClaves = new ArrayList<String>();
		this.evaluador = new Evaluador_comun(null, 1);
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<String>(this.palabrasClaves);
	}

	public Evaluador getEvaluador() {
		return evaluador;
	}

	public void agregarPalabraCave(String palabC) {
		if (!this.palabrasClaves.contains(palabC)) {
			this.palabrasClaves.add(palabC);
		}
	}
	
	public void asignarEvaluador(Evaluador evaluador) {
		
		if(evaluador.esAptoParaTrabajo(this)) {
			
			this.evaluador = evaluador;
		}
	}
	
	

	public boolean equals(Object ob) {

		Trabajo t = ((Trabajo) ob);

		if (t.getNombre() == this.nombre) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return nombre;
	}

	
}
