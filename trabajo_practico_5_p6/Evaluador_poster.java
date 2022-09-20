package trabajo_practico_5_p6;

public class Evaluador_poster extends Evaluador {

	public Evaluador_poster(String nombre, int dni) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esAptoParaTrabajo(Trabajo trabajo) {
		
		if (!conocimientosEnComunConTrabajo(trabajo).isEmpty()) {
			return true;
		}

		return false;
	}

}
