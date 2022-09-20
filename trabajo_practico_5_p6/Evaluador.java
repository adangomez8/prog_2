package trabajo_practico_5_p6;

import java.util.ArrayList;

public abstract class Evaluador {

	private String nombre;
	private int dni;
	private ArrayList<String> conocimientos;

	public Evaluador(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.conocimientos = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public int getDni() {
		return dni;
	}

	public ArrayList<String> getConocimientos() {
		return new ArrayList<String>(this.conocimientos);
	}

	public void agregarConocimiento(String conoc) {
		if (!this.conocimientos.contains(conoc)) {
			this.conocimientos.add(conoc);
		}
	}

	public boolean contieneConocimiento(String conoc) {
		
		if(this.getConocimientos().contains(conoc)) {
			return true;
		}

		return false;
	}


	
	protected ArrayList<String> conocimientosEnComunConTrabajo(Trabajo trabajo) {
		ArrayList<String> conocimientosEnComun = new ArrayList<String>();

		for (int i = 0; i < this.conocimientos.size(); i++) {

			for (String t : trabajo.getPalabrasClaves()) {

				if (this.conocimientos.get(i).equals(t)) {
					conocimientosEnComun.add(t);
				}
			}
		}

		return conocimientosEnComun;
	}

	public abstract boolean esAptoParaTrabajo(Trabajo trabajo);

	public boolean equals(Object ob) {

		Evaluador e = ((Evaluador) ob);

		if (e.getDni() == this.dni) {
			return true;
		}
		return false;
	}
	
	public int cantTrabajosDeEvaluador(Comite comite) {
		int total = 0;

		for (Trabajo t : comite.getTrabajos()) {
			if (t.getEvaluador().equals(this)) {
				total++;
			}
		}

		return total;
	}

	@Override
	public String toString() {
		return  nombre;
	}
	
	
}
