package trabajo_practico_1;

public class Main_electrodomestico {
	
	public static void mostrarDatos(Electrodomestico e) {
		System.out.println(e.getNombre());
		System.out.println(
				"Color: " + e.getColor() + ". Consumo: " + e.getConsumo()
						+ ". Es bajo consumo: " + e.esBajoConsumo(e.getConsumo()) + ". Balance: " + e.getBalance(e.getPrecioBase(), e.getPeso()) + ". Es alta gama: " + e.esAltaGama(e.getPrecioBase(), e.getPeso()));

	}

	public static void main(String[] args) {
		
		Electrodomestico e1 = new Electrodomestico("Heladera", 2000, "Negro", 46, 50);
		Electrodomestico e2 = new Electrodomestico("Freezer");
		
		mostrarDatos(e1);
		mostrarDatos(e2);

	}

}
