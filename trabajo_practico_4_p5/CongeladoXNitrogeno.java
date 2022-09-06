package trabajo_practico_4_p5;

import java.time.LocalDate;

public class CongeladoXNitrogeno extends Producto_congelado {

	private String infoMetodoCongelacion;
	private double tiempoExposicionNitrogeno;
	
	public CongeladoXNitrogeno(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,
			String granjaOrigen, int codigoOrg, double tempRecom, String infoMetodoCongelacion,
			double tiempoExposicionNitrogeno) {
		super(nombre, fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen, codigoOrg, tempRecom);
		this.infoMetodoCongelacion = infoMetodoCongelacion;
		this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
	}

	public String getInfoMetodoCongelacion() {
		return infoMetodoCongelacion;
	}

	public double getTiempoExposicionNitrogeno() {
		return tiempoExposicionNitrogeno;
	}
	
	
}
