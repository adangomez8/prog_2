package trabajo_practico_3_p3;

public class Main_juego {

	public static void main(String[] args) {
		Personaje villano = new Personaje("Villano", "Supervillanito");
		Personaje heroe = new Personaje("Heroe", "Superheroe");
		
		Juego j1 = new Juego("Juego de personajes");

		villano.agregarCualidad("Vision nocturna", 50);
		villano.agregarCualidad("Fuerza", 500);
		villano.agregarCualidad("Peso", 80);
		villano.agregarCualidad("Altura", 150);
		villano.agregarCualidad("Edad", 30);
		
		heroe.agregarCualidad("Vision nocturna", 50);
		heroe.agregarCualidad("Fuerza", 550);
		heroe.agregarCualidad("Peso", 70);
		heroe.agregarCualidad("Altura", 110);
		heroe.agregarCualidad("Edad", 33);
		
		j1.agregarPersonaje(heroe);
		j1.agregarPersonaje(villano);
		
		
		
	}

}
