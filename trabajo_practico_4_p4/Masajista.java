package trabajo_practico_4_p4;

import java.time.LocalDate;

public class Masajista extends Contingente {

	private String tituloQuePosee;
	private LocalDate fechaInicioEnSeleccion;

	public Masajista(String nombre, String apellido, int nroPasaporte, LocalDate fechaNac, boolean viajando,
			boolean concentrando, boolean enPaisDeOrigen, String tituloQuePosee, LocalDate fechaInicioEnSeleccion) {
		super(nombre, apellido, nroPasaporte, fechaNac, viajando, concentrando, enPaisDeOrigen);
		this.tituloQuePosee = tituloQuePosee;
		this.fechaInicioEnSeleccion = fechaInicioEnSeleccion;
	}

	public String getTituloQuePosee() {
		return tituloQuePosee;
	}

	public LocalDate getFechaInicioEnSeleccion() {
		return fechaInicioEnSeleccion;
	}
	
	public int getCantAniosExperiencia() {
		int totalA�os = 0;
		
		LocalDate hoy = LocalDate.now();
		int diferencia = hoy.getYear() - this.fechaInicioEnSeleccion.getYear();

		if (hoy.getYear() > this.fechaInicioEnSeleccion.getYear()) {
			if (hoy.getMonthValue() > this.fechaInicioEnSeleccion.getMonthValue()) {
				if (hoy.getDayOfMonth() > this.fechaInicioEnSeleccion.getDayOfMonth()) {
					totalA�os = diferencia;
				} else {
					totalA�os = diferencia + 1;
				}
			} else {
				totalA�os = diferencia + 1;
			}
		}
		
		return totalA�os;
		
	}
}
