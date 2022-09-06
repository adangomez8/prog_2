package trabajo_practico_4_p5;

import java.time.LocalDate;

public class CongeladoXaire extends Producto_congelado {
	
	private double cantNitrogeno, cantOxigeno, cantDioxidCarb, cantVaporAgua;

	public CongeladoXaire(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,
			String granjaOrigen, int codigoOrg, double tempRecom, double cantNitrogeno, double cantOxigeno,
			double cantDioxidCarb, double cantVaporAgua) {
		super(nombre, fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen, codigoOrg, tempRecom);
		this.cantNitrogeno = cantNitrogeno;
		this.cantOxigeno = cantOxigeno;
		this.cantDioxidCarb = cantDioxidCarb;
		this.cantVaporAgua = cantVaporAgua;
	}

	public double getCantNitrogeno() {
		return cantNitrogeno;
	}

	public double getCantOxigeno() {
		return cantOxigeno;
	}

	public double getCantDioxidCarb() {
		return cantDioxidCarb;
	}

	public double getCantVaporAgua() {
		return cantVaporAgua;
	}
	
	
	

}
