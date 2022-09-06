package trabajo_practico_2_p5;

import java.time.LocalDate;
import java.util.ArrayList;


public class Peluqueria {

	private String nombre;
	private ArrayList<Turno> turnos;
	private int descuento;
	private int cantMinTurnosSacados;
	private int cantMesesParaSerFrecuente;
	
	public Peluqueria(String nombre) {
		this.nombre = nombre;
		this.descuento = 10;
		this.cantMinTurnosSacados = 1;
		this.cantMesesParaSerFrecuente = 1;
		this.turnos = new ArrayList<>();
	}
	
	public Peluqueria(String nombre, int descuento, int minTurnos, int cantDiasFrecuente) {
		this.nombre = nombre;
		this.descuento = descuento;
		this.cantMinTurnosSacados = minTurnos;
		this.cantMesesParaSerFrecuente = cantDiasFrecuente;
		this.turnos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public int getCantMinTurnosSacados() {
		return cantMinTurnosSacados;
	}

	public void setCantMinTurnosSacados(int cantMinTurnosSacados) {
		this.cantMinTurnosSacados = cantMinTurnosSacados;
	}

	public int getCantMesesParaSerFrecuente() {
		return cantMesesParaSerFrecuente;
	}

	public void setCantMesesParaSerFrecuente(int cantMesesParaSerFrecuente) {
		this.cantMesesParaSerFrecuente = cantMesesParaSerFrecuente;
	}

	public ArrayList<Turno> getTurnos() {
		return new ArrayList<Turno>(this.turnos);
	}

	public void agregarTurno(Turno turno) {
		if (!this.turnos.contains(turno)) {
			this.turnos.add(turno);
		}
	}

	public void ordenarTurnos() {
		ArrayList<Turno> turnosOrdenados = new ArrayList<Turno>();
		if (!this.turnos.isEmpty()) {
			for (int i = 0; i < this.turnos.size(); i++) {
				if ((i < this.turnos.size() - 1)
						&& (this.turnos.get(i).getInicioTurno().isAfter(this.turnos.get(i + 1).getInicioTurno()))) {
					turnosOrdenados.add(this.turnos.get(i));
				}
				System.out.println(this.turnos.get(i));
			}
		}
	}

	public void asignarTurno(Turno turno) {
		if (!turno.peluqueroDisponible(turno)) {
			for (int i = 0; i < this.turnos.size() - 1; i++) {
				this.turnos.get(i + 1).setCliente(turno.getCliente());
				if (this.turnos.get(i) == null) {
					System.out.println(
							"No se puede asignar el turno porque el peluquero tiene todos sus turnos ocu pados");
				} else { 
					System.out.println(
							"Funciono");
				}

			}
		}
	}
	
	public LocalDate getFechaLimite() {

		LocalDate hoy = LocalDate.now();
		LocalDate fechaLimite = LocalDate.of(hoy.getYear(), (hoy.getMonthValue()- this.cantMesesParaSerFrecuente),	hoy.getDayOfMonth());

		return fechaLimite;
	}
	
	public boolean isClienteFrecuente(Cliente cliente) {
		
		int turnosSacados = 0;
		
		for(Turno t : this.turnos) {
			LocalDate fechaTurno = LocalDate.of(t.getInicioTurno().getYear(), t.getInicioTurno().getMonthValue(), t.getInicioTurno().getDayOfMonth());
			if(t.getCliente().equals(cliente)&&(fechaTurno.isAfter(this.getFechaLimite()))) {
				turnosSacados++;
			}
		}
		
		return turnosSacados>=this.cantMinTurnosSacados;
	}
	
	public double cobrarTurno(Turno turno) {
		double total = 0;
		
		if(this.isClienteFrecuente(turno.getCliente())) {
			total = (turno.getPrecioTurno()-((turno.getPrecioTurno()*this.descuento)/100));
		}
		else {
			total = turno.getPrecioTurno();
		}
		return total;
		
	}

	@Override
	public String toString() {
		return "Peluqueria [nombre=" + nombre + "]";
	}

}
