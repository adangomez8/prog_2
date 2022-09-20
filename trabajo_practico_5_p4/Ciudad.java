package trabajo_practico_5_p4;

import java.util.ArrayList;

public class Ciudad {

	private String nombre;
	private int cantHabitantes;
	private ArrayList<Impuesto> impuestos;
	private ArrayList<Gasto_publico> gastos;
	private ArrayList<Contribuyente> contribuyentes;
	private int maxImpuestos;

	public Ciudad(String nombre) {
		this.nombre = nombre;
		this.cantHabitantes = 100001;
		this.maxImpuestos = 5;
		this.impuestos = new ArrayList<Impuesto>();
		this.gastos = new ArrayList<Gasto_publico>();
		this.contribuyentes = new ArrayList<Contribuyente>();
	}

	public Ciudad(String nombre, int habitantes) {
		this.nombre = nombre;
		this.cantHabitantes = habitantes;
		this.maxImpuestos = 5;
		this.impuestos = new ArrayList<Impuesto>();
		this.gastos = new ArrayList<Gasto_publico>();
		this.contribuyentes = new ArrayList<Contribuyente>();
	}

	public Ciudad(String nombre, int habitantes, int maxImp) {
		this.nombre = nombre;
		this.cantHabitantes = habitantes;
		this.maxImpuestos = maxImp;
		this.impuestos = new ArrayList<Impuesto>();
		this.gastos = new ArrayList<Gasto_publico>();
		this.contribuyentes = new ArrayList<Contribuyente>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Impuesto> getImpuestos() {
		return new ArrayList<Impuesto>(this.impuestos);
	}

	public ArrayList<Gasto_publico> getGastos() {
		return new ArrayList<Gasto_publico>(this.gastos);
	}

	public void agregarImpuestoAciudad(Impuesto imp) {
		if ((!this.impuestos.contains(imp)) && (this.impuestos.size() <= this.maxImpuestos)) {
			this.impuestos.add(imp);
		}
	}

	public void agregarGastoAciudad(Gasto_publico gasto) {
		if ((!this.gastos.contains(gasto))) {
			this.gastos.add(gasto);
		}
	}

	// ---------------------------------------MODIFICADO PARA TP5 P4

	public double getTotalImpuestos() {
		double total = 0;

		for (Impuesto i : this.impuestos) {
			total += i.getValor();
		}
		return total;
	}

	public double getMontoRecaudado() {
		double total = 0;

		for (Contribuyente c : this.contribuyentes) {
			total += c.totalApagar();
		}
		return total;
	}

	// --------------------------------------------------------------------

	public double getTotalGastos() {
		double total = 0;

		for (Gasto_publico g : this.gastos) {
			total += g.getValor();
		}
		return total;
	}

	public boolean gastaMasQueLoRecaudado() {
		return (this.getTotalGastos() > this.getMontoRecaudado());
	}

	public int getCantHabitantes() {
		return cantHabitantes;
	}

	public void setCantHabitantes(int cantHabitantes) {
		this.cantHabitantes = cantHabitantes;
	}

	public int getMaxImpuestos() {
		return maxImpuestos;
	}

	public ArrayList<Contribuyente> getContribuyentes() {
		return new ArrayList<Contribuyente>(this.contribuyentes);
	}

	public void agregarContribuyente(Contribuyente contri) {
		if (!this.contribuyentes.contains(contri)) {
			if (contri.perteneceACiudad(this)) {
				this.contribuyentes.add(contri);
			}
		}
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", impuestos=" + impuestos + ", gastos=" + gastos + "]";
	}

}
