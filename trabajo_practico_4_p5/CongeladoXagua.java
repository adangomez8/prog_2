package trabajo_practico_4_p5;

import java.time.LocalDate;

public class CongeladoXagua extends Producto_congelado{
	
	private double gramosSalXlitroAgua;

	public CongeladoXagua(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,
			String granjaOrigen, int codigoOrg, double tempRecom, double gramosSalXlitroAgua) {
		super(nombre, fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen, codigoOrg, tempRecom);
		this.gramosSalXlitroAgua = gramosSalXlitroAgua;
	}

	public double getGramosSalXlitroAgua() {
		return gramosSalXlitroAgua;
	}
	
	

}
