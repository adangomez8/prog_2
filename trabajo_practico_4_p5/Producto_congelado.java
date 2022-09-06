package trabajo_practico_4_p5;

import java.time.LocalDate;

public class Producto_congelado extends Producto {

	private int codigoOrg;
	private double tempRecom;
	
	public Producto_congelado(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,
			String granjaOrigen, int codigoOrg, double tempRecom) {
		super(nombre, fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen);
		this.codigoOrg = codigoOrg;
		this.tempRecom = tempRecom;
	}

	public int getCodigoOrg() {
		return codigoOrg;
	}

	public double getTempRecom() {
		return tempRecom;
	}
	
	
	
}
