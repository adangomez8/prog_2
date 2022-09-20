package trabajo_practico_5_p3;

public class Cereal_pastura extends Cereal {
	
	private int cantMinHectareasNec;

	public Cereal_pastura(String nombre, int cantHect) {
		super(nombre);
		this.cantMinHectareasNec = cantHect;
	}

	public int getCantMinHectareasNec() {
		return cantMinHectareasNec;
	}

	@Override
	protected boolean cumple(Lote lote) {
		if(this.getCantMinHectareasNec()>=lote.getCantHectareas()) {
			return true;
		}
		return false;
	}

}
