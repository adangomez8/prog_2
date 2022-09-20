package trabajo_practico_5_p6;

public class Evaluador_comun extends Evaluador {

	public Evaluador_comun(String nombre, int dni) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esAptoParaTrabajo(Trabajo trabajo) {
		
		if (this.conocimientosEnComunConTrabajo(trabajo).size() >= this.getConocimientos().size()) {
			return true;
		}

		return false;
	}

}
