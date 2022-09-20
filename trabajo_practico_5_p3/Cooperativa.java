package trabajo_practico_5_p3;

import java.util.ArrayList;

public class Cooperativa {

	private String nombre;
	private ArrayList<Cereal> cereales;
	private ArrayList<Lote> lotes;
	private ArrayList<String> mineralesPrimarios;
	private ArrayList<String> mineralesSecundarios;
	private int cantMinMineralesParaSerPrimario;

	public Cooperativa(String nombre) {
		this.nombre = nombre;
		this.cantMinMineralesParaSerPrimario = 2;
		this.cereales = new ArrayList<Cereal>();
		this.lotes = new ArrayList<Lote>();
		this.mineralesPrimarios = new ArrayList<String>();
		this.mineralesSecundarios = new ArrayList<String>();
	}

	public Cooperativa(String nombre, int cantMin) {
		this.nombre = nombre;
		this.cantMinMineralesParaSerPrimario = cantMin;
		this.cereales = new ArrayList<Cereal>();
		this.mineralesPrimarios = new ArrayList<String>();
		this.mineralesSecundarios = new ArrayList<String>();
		this.lotes = new ArrayList<Lote>();
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantMinMineralesParaSerPrimario() {
		return cantMinMineralesParaSerPrimario;
	}

	public void setCantMinMineralesParaSerPrimario(int cantMinMineralesParaSerPrimario) {
		this.cantMinMineralesParaSerPrimario = cantMinMineralesParaSerPrimario;
	}

	public ArrayList<Cereal> getCereales() {
		return new ArrayList<Cereal>(this.cereales);
	}

	public ArrayList<Lote> getLotes() {
		return new ArrayList<Lote>(this.lotes);
	}

	public ArrayList<String> getMineralesPrimarios() {
		return new ArrayList<String>(this.mineralesPrimarios);
	}

	public ArrayList<String> getMineralesSecundarios() {
		return new ArrayList<String>(this.mineralesSecundarios);
	}

	public void agregarCereal(Cereal cereal) {
		if (!this.cereales.contains(cereal)) {
			this.cereales.add(cereal);
		}
	}

	public void agregarLote(Lote lote) {
		if (!this.lotes.contains(lote)) {
			this.lotes.add(lote);
		}
	}

	public void agregarMineralPrimario(String mineral) {
		if (!this.mineralesPrimarios.contains(mineral)) {
			this.mineralesPrimarios.add(mineral);
		}
	}

	public void agregarMineralSecundario(String mineral) {
		if (!this.mineralesSecundarios.contains(mineral)) {
			this.mineralesSecundarios.add(mineral);
		}
	}

	public ArrayList<Cereal> cerealesQuePuedenPlantarseEnLote(Lote lote) {

		ArrayList<Cereal> cerealesQuePuedenPlantarse = new ArrayList<Cereal>();

		for (Cereal c : this.cereales) {
			if (c.cumpleCondicionParaLote(lote)) {
				cerealesQuePuedenPlantarse.add(c);
			}
		}

		return cerealesQuePuedenPlantarse;
	}

	public ArrayList<Lote> lotesQuePuedeSembrarseCereal(Cereal cereal) {

		ArrayList<Lote> lotesQuePuedenSembrarse = new ArrayList<Lote>();

		for (Lote l : this.lotes) {
			if (l.cumpleRequisitoCereal(cereal)) {
				
				lotesQuePuedenSembrarse.add(l);
			}
		}

		return lotesQuePuedenSembrarse;
	}

	private ArrayList<String> mineralesPrimariosDeLote(Lote lote) {

		ArrayList<String> mineralesPrimariosDeLote = new ArrayList<String>();
		
		for (String mineralesPrimarios : this.mineralesPrimarios) {
			for (String mineralesLote : lote.getMinerales()) {
				if (mineralesPrimarios.equals(mineralesLote)) {
					mineralesPrimariosDeLote.add(mineralesPrimarios);
				}
			}
		}

		return mineralesPrimariosDeLote;
	}
	
	public boolean esLoteEspecial(Lote lote) {
		
		if(this.mineralesPrimariosDeLote(lote).size()>=this.cantMinMineralesParaSerPrimario) {
			return true;
		}
		
		return false;
	}

	public boolean esLoteComun(Lote lote) {

		boolean esLoteComun = false;

		for (String mineralesSec : this.mineralesSecundarios) {
			for (String mineralesLote : lote.getMinerales()) {
				if ((mineralesSec.equals(mineralesLote))&&(mineralesPrimariosDeLote(lote)).isEmpty()) {
						esLoteComun = true;
				}
			}
		}
		
		if(esLoteComun) {
			return true;
		}

		return false;
	}
}
