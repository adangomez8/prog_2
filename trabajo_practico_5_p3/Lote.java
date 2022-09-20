package trabajo_practico_5_p3;

import java.util.ArrayList;

public class Lote {

	private String nombre;
	private int cantHectareas;
	private ArrayList<String> minerales;
	private ArrayList<Cereal> cereales;

	public Lote(String nombre, int cantHectareas) {
		super();
		this.nombre = nombre;
		this.cantHectareas = cantHectareas;
		this.minerales = new ArrayList<String>();
		this.cereales = new ArrayList<Cereal>();
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantHectareas() {
		return cantHectareas;
	}

	public ArrayList<String> getMinerales() {
		return new ArrayList<String>(this.minerales);
	}

	public void agregarMineral(String mineral) {
		if (!this.minerales.contains(mineral)) {
			this.minerales.add(mineral);
		}
	}

	public void agregarCereal(Cereal cereal) {
		if (!this.cereales.contains(cereal)) {
			this.cereales.add(cereal);
		}
	}

	public boolean cumpleRequisitoCereal(Cereal cereal) {

		int cantMineralesReq = this.getMinerales().size();
		boolean tieneTodosMinerales = false;

		for (String mineralCereal : cereal.getMineralesRequeridos()) {

			for (String mineralLote : this.getMinerales()) {
				if (mineralCereal.equals(mineralLote)) {
					cantMineralesReq--;
				}
				if (cantMineralesReq <= 0) {
					tieneTodosMinerales = true;
				}
			}
		}

		if (tieneTodosMinerales) {
			return true;
		}
		return false;
	}

	public boolean equals(Object ob) {
		Lote l = ((Lote) ob);
		if (l.nombre.equals(this.nombre)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
