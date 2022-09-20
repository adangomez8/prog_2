package trabajo_practico_5_p3;

import java.util.ArrayList;

public abstract class Cereal {

	private String nombre;
	private ArrayList<String> mineralesRequeridos;

	public Cereal(String nombre) {
		this.nombre = nombre;
		this.mineralesRequeridos = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<String> getMineralesRequeridos() {
		return new ArrayList<String>(this.mineralesRequeridos);
	}

	public void agregarMineralRequerido(String mineral) {
		if (!this.mineralesRequeridos.contains(mineral)) {
			this.mineralesRequeridos.add(mineral);
		}
	}

	public boolean cumpleCondicionParaLote(Lote lote) {

		int cantMineralesReq = this.getMineralesRequeridos().size();
		boolean tieneTodosMinerales = false;
		for (String mineralCereal : this.getMineralesRequeridos()) {
			for (String mineralLote : lote.getMinerales()) {
				if (mineralCereal.equals(mineralLote)) {
					cantMineralesReq--;
				}
				if(cantMineralesReq<=0) {
					tieneTodosMinerales = true;
				}
			}
		}
		if((tieneTodosMinerales)&&(cumple(lote))) {
			return true;
		}

		return false;
	}

	protected abstract boolean cumple(Lote lote);
	
	public boolean equals(Object ob) {
		Cereal c = ((Cereal)ob);
		if(c.nombre.equals(this.nombre)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
}
