package trabajo_practico_4_p5;

import java.time.LocalDate;

public class Producto {

	//fecha de vencimiento y número de lote
	
	private String nombre;
	private LocalDate fechaVencimiento;
	private int nroLote;
	private LocalDate fechaEnvasado;
	private String granjaOrigen;
	
	public Producto(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,
			String granjaOrigen) {
		super();
		this.nombre = nombre;
		this.fechaVencimiento = fechaVencimiento;
		this.nroLote = nroLote;
		this.fechaEnvasado = fechaEnvasado;
		this.granjaOrigen = granjaOrigen;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public int getNroLote() {
		return nroLote;
	}


	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	public String getGranjaOrigen() {
		return granjaOrigen;
	}
	
}
