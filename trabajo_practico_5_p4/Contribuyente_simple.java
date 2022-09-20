package trabajo_practico_5_p4;

public class Contribuyente_simple extends Contribuyente {

	public Contribuyente_simple(String nombre, int codigoIdTrib, Ciudad ciudad) {
		super(nombre, codigoIdTrib, ciudad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double totalApagar() {

		double total = 0;
		
		total = this.ciudad.getTotalImpuestos();

		return total;
	}

}
