package trabajo_practico_2_p1;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario_tp1 {

	private String nombre, apellido;
	private ArrayList<Capitulo_tp1> capitulosVistos;
	private ArrayList<Capitulo_tp1> capitulosCalificados;
	private double califCapVisto;

	public Usuario_tp1(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.capitulosVistos = new ArrayList<>();
		this.capitulosCalificados = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getCalifCapVisto() {
		return califCapVisto;
	}

	public void setCalifCapVisto(double calif) {
		if ((calif < 0) || (calif > 10)) {
			System.out.println("Calificación no válida");
			calif = 0;
		} else {
			this.califCapVisto = calif;
		}
	}

	public ArrayList<Capitulo_tp1> getCapitulosVistos() {
		return new ArrayList<Capitulo_tp1>(this.capitulosVistos);
	}

	public ArrayList<Capitulo_tp1> getCapitulosVistosTemporada(Temporada_tp1 temp) {
		ArrayList<Capitulo_tp1> ct = temp.getCapitulos();
		ArrayList<Capitulo_tp1> ctv = new ArrayList<>();
		for (Capitulo_tp1 c : ct) {

			if (this.capitulosVistos.contains(c)) {
				ctv.add(c);
			}
		}
		return new ArrayList<Capitulo_tp1>(ctv);
	}

	public ArrayList<Capitulo_tp1> getCapitulosVistosSerie(Serie_tp1 serie) {
		ArrayList<Temporada_tp1> ts = serie.getTemporadas();
		ArrayList<Capitulo_tp1> ct = new ArrayList<>();
		ArrayList<Capitulo_tp1> ctv = new ArrayList<>();
		for (Temporada_tp1 t : ts) {

			if (ts.contains(t)) {
				ct.addAll(t.getCapitulos());
			}
		}

		for (Capitulo_tp1 c : ct) {

			if (this.capitulosVistos.contains(c)) {
				ctv.add(c);
			}
		}
		return new ArrayList<Capitulo_tp1>(ctv);
	}

	public ArrayList<Capitulo_tp1> getCapitulosCalificados() {
		return new ArrayList<Capitulo_tp1>(this.capitulosCalificados);
	}

	public void verCapitulo(Capitulo_tp1 cap) {
		if (!this.capitulosVistos.contains(cap)) {
			this.capitulosVistos.add(cap);
			System.out.println("vio" + cap.getTitulo());
		}
	}

	public void calificarCapitulo(Capitulo_tp1 cap, double calificacion) {

		System.out.println(cap.getTitulo());
		if ((this.capitulosVistos.contains(cap))) {
			if (this.capitulosVistos.contains(cap) && (!(this.capitulosCalificados.contains(cap)))) {
				System.out.println("Se calificó el capítulo con éxito");
				cap.setCalificacion(calificacion);
				cap.setCantUsuariosCalif();
				cap.setCalificado(true);
				cap.setSumaCalific(this.califCapVisto);
				this.capitulosCalificados.add(cap);
			} else if (this.capitulosVistos.contains(cap) && (this.capitulosCalificados.contains(cap))) {
				System.out.println("Calificación modificda");
				cap.setCalificacion(calificacion);
			}
		}
		if (!(this.capitulosVistos.contains(cap))) {
			System.out.println("No se puede clasificar este capítulo porque aún no fue visto");
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario_tp1 other = (Usuario_tp1) obj;
		return Objects.equals(apellido, other.apellido)
				&& Double.doubleToLongBits(califCapVisto) == Double.doubleToLongBits(other.califCapVisto)
				&& Objects.equals(capitulosCalificados, other.capitulosCalificados)
				&& Objects.equals(capitulosVistos, other.capitulosVistos) && Objects.equals(nombre, other.nombre);
	}

	public int totalCapitulosTemporadaVistos(Temporada_tp1 temp) {
		return this.capitulosVistos.size();
	}

	public boolean seVioTodosCapitulos(Temporada_tp1 temp) {
		if (this.capitulosVistos.size() == temp.getCapitulos().size()) {
			return true;
		}
		return false;
	}

}
