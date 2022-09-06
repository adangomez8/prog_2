package trabajo_practico_4_p5;

import java.time.LocalDate;

public class Producto_refrigerado extends Producto {

	private double tempRecom;

	public Producto_refrigerado(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,
			String granjaOrigen, double tempRecom) {
		super(nombre, fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen);
		this.tempRecom = tempRecom;
	}

	public double getTempRecom() {
		return tempRecom;
	}
	
	
	
}
