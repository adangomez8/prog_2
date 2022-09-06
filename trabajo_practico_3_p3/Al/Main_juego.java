package trabajo_practico_3_p3.Al;

public class Main_juego {

	public static void main(String[] args) {
		Personaje villano = new Personaje("Villano", "Supervillanito", 50, 500, 80, 150, 30);
		Personaje heroe = new Personaje("Heroe", "Superheroe", 50, 550, 70, 110, 33);
		
		Juego j1 = new Juego("Juego de personajes");
		
		j1.agregarPersonaje(heroe);
		j1.agregarPersonaje(villano);
		
		System.out.println(j1.jugarComparandoVisionNoctura(villano, heroe));
		j1.jugarComparandoFuerza(villano, heroe);
		j1.jugarComparandoPeso(villano, heroe);
		j1.jugarComparandoAltura(villano, heroe);
		j1.jugarComparandoEdad(villano, heroe);
		
	}

}
