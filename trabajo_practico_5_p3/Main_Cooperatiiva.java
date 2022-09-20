package trabajo_practico_5_p3;

public class Main_Cooperatiiva {

	public static void main(String[] args) {
		
		Cereal_grano_cosecha girasol = new Cereal_grano_cosecha("Girasol");
		Cereal_grano_cosecha trigo = new Cereal_grano_cosecha("Trigo");
		Cereal_pastura alfalfa = new Cereal_pastura("Alfalfa", 30);
		Cereal_pastura trebol = new Cereal_pastura("Trebol", 60);
		
		Lote lote1 = new Lote("Lote 1", 50);
		Lote lote2 = new Lote("Lote 2", 40);
		Lote lote3 = new Lote("Lote 3", 60);
		
		Cooperativa coop = new Cooperativa("Cooperativa");
		
		girasol.agregarMineralRequerido("min1");
		girasol.agregarMineralRequerido("min2");
		girasol.agregarMineralRequerido("min3");
		
		trigo.agregarMineralRequerido("min1");
		
		alfalfa.agregarMineralRequerido("min3");
		alfalfa.agregarMineralRequerido("min4");
		alfalfa.agregarMineralRequerido("min5");
		
		trebol.agregarMineralRequerido("min4");
		trebol.agregarMineralRequerido("min5");
		trebol.agregarMineralRequerido("min6");
		
		lote1.agregarMineral("min1");
		lote1.agregarMineral("min2");
		lote1.agregarMineral("min3");
		
		lote2.agregarMineral("min1");
		lote2.agregarMineral("min4");
		lote2.agregarMineral("min5");
		
		lote3.agregarMineral("min6");
		lote3.agregarMineral("min7");
		lote3.agregarMineral("min8");
		
		coop.agregarCereal(girasol);
		coop.agregarCereal(trigo);
		coop.agregarCereal(alfalfa);
		coop.agregarCereal(trebol);
		
		coop.agregarLote(lote1);
		coop.agregarLote(lote2);
		coop.agregarLote(lote3);
		
		coop.agregarMineralPrimario("min1");
		coop.agregarMineralPrimario("min2");
		coop.agregarMineralPrimario("min3");
		
		coop.agregarMineralSecundario("min4");
		coop.agregarMineralSecundario("min5");
		coop.agregarMineralSecundario("min6");
		coop.agregarMineralSecundario("min7");
		
		//ANDA
		System.out.println("Cereales que pueden plantarse en " + lote1.getNombre() + ": " + coop.cerealesQuePuedenPlantarseEnLote(lote1));
		
		//ANDA
		System.out.println("Lotes en los que se puede plantar el cereal " + trigo.getNombre() + ": " + coop.lotesQuePuedeSembrarseCereal(girasol));
		//PREGUNTO SI EL LOTE TIENE LOS MINERALES QUE NECESITA EL CEREAL
		//System.out.println(lote1.cumpleRequisitoCereal(girasol));
		
		//ANDAN
		System.out.println("El lote "+ lote1.getNombre() +" es especial: " + coop.esLoteEspecial(lote1));
		System.out.println("El lote "+ lote2.getNombre() +" es comun: " + coop.esLoteComun(lote2));
		System.out.println("El lote "+ lote3.getNombre() +" es comun: " + coop.esLoteComun(lote3));
	}

}
