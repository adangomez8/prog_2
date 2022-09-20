package trabajo_practico_5_p4;

public class Contribuyente_Factura extends Contribuyente {

	private double descuentoDeImpuesto, facturado, descuentoPorFacturado;

	public Contribuyente_Factura(String nombre, int codigoIdTrib, Ciudad ciudad, double facturado, double descuentoDeImpuesto,
			 double descuentoPorFacturado) {
		super(nombre, codigoIdTrib, ciudad);
		this.facturado = facturado;
		this.descuentoDeImpuesto = descuentoDeImpuesto;
		this.descuentoPorFacturado = descuentoPorFacturado;
	}

	public Contribuyente_Factura(String nombre, int codigoIdTrib, Ciudad ciudad, double facturado) {
		super(nombre, codigoIdTrib, ciudad);
		this.descuentoDeImpuesto = 50;
		this.facturado = facturado;
		this.descuentoPorFacturado = 3.5;
	}

	public double getDescuentoDeImpuesto() {
		return descuentoDeImpuesto;
	}

	public double getFacturado() {
		return facturado;
	}

	public double getDescuentoPorFacturado() {
		return descuentoPorFacturado;
	}

	@Override
	public double totalApagar() {
		double total = 0;

		total = (this.ciudad.getTotalImpuestos()
				- (this.ciudad.getTotalImpuestos() - (this.ciudad.getTotalImpuestos() * this.descuentoDeImpuesto) / 100)
				- ((this.facturado * this.descuentoPorFacturado) / 100));

		return total;
	}

}
