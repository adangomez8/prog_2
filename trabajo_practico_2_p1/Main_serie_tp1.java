package trabajo_practico_2_p1;

public class Main_serie_tp1 {

	public static void main(String[] args) {
		//USUARIO
		Usuario_tp1 u1 = new Usuario_tp1("Juan", "Perez");
		Usuario_tp1 u2 = new Usuario_tp1("María", "Rodriguez");
		Usuario_tp1 u3 = new Usuario_tp1("Pedro", "Gómez");
		Usuario_tp1 u4 = new Usuario_tp1("Pepe", "Argento");
		
		//SERIES
		Serie_tp1 serie1 = new Serie_tp1("Serie1", "Descripcion 1", "Creador 1", "Género 1");
		Serie_tp1 serie2 = new Serie_tp1("Serie2", "Descripcion 1", "Creador 1", "Género 1");
		
		//TEMPORADAS
		
		Temporada_tp1 temp1S1 = new Temporada_tp1(1, "Temporada 1");
		Temporada_tp1 temp2S1 = new Temporada_tp1(2, "Temporada 2");
		Temporada_tp1 temp3S1 = new Temporada_tp1(3, "Temporada 3");
		
		Temporada_tp1 temp1S2 = new Temporada_tp1(1, "Temporada 1");
		
		//CAPÍTULOS
		
		Capitulo_tp1 cap1T1S1 = new Capitulo_tp1("Capitulo 1T1S1", "Descripción 1");
		Capitulo_tp1 cap2T1S1 = new Capitulo_tp1("Capitulo 2T1S1", "Descripción 2");
		Capitulo_tp1 cap3T1S1 = new Capitulo_tp1("Capitulo 3T1S1", "Descripción 3");
		Capitulo_tp1 cap4T1S1 = new Capitulo_tp1("Capitulo 4T1S1", "Descripción 4");
		Capitulo_tp1 cap5T1S1 = new Capitulo_tp1("Capitulo 5T1S1", "Descripción 5");
		Capitulo_tp1 cap6T1S1 = new Capitulo_tp1("Capitulo 6T1S1", "Descripción 6");
		Capitulo_tp1 cap7T1S1 = new Capitulo_tp1("Capitulo 7T1S1", "Descripción 7");
		Capitulo_tp1 cap8T1S1 = new Capitulo_tp1("Capitulo 8T1S1", "Descripción 7");
		Capitulo_tp1 cap9T1S1 = new Capitulo_tp1("Capitulo 9T1S1", "Descripción 8");
		
		Capitulo_tp1 cap1T2S1 = new Capitulo_tp1("Capitulo 1T2S1", "Descripción 1");
		Capitulo_tp1 cap2T2S1 = new Capitulo_tp1("Capitulo 2T2S1", "Descripción 2");
		Capitulo_tp1 cap3T2S1 = new Capitulo_tp1("Capitulo 3T2S1", "Descripción 3");
		Capitulo_tp1 cap4T2S1 = new Capitulo_tp1("Capitulo 4T2S1", "Descripción 4");
		Capitulo_tp1 cap5T2S1 = new Capitulo_tp1("Capitulo 5T2S1", "Descripción 5");
		Capitulo_tp1 cap6T2S1 = new Capitulo_tp1("Capitulo 6T2S1", "Descripción 6");
		Capitulo_tp1 cap7T2S1 = new Capitulo_tp1("Capitulo 7T2S1", "Descripción 7");
		Capitulo_tp1 cap8T2S1 = new Capitulo_tp1("Capitulo 8T2S1", "Descripción 7");
		Capitulo_tp1 cap9T2S1 = new Capitulo_tp1("Capitulo 9T2S1", "Descripción 8");
		
		Capitulo_tp1 cap1T3S1 = new Capitulo_tp1("Capitulo 1T3S1", "Descripción 1");
		Capitulo_tp1 cap2T3S1 = new Capitulo_tp1("Capitulo 2T3S1", "Descripción 2");
		Capitulo_tp1 cap3T3S1 = new Capitulo_tp1("Capitulo 3T3S1", "Descripción 3");
		Capitulo_tp1 cap4T3S1 = new Capitulo_tp1("Capitulo 4T3S1", "Descripción 4");
		Capitulo_tp1 cap5T3S1 = new Capitulo_tp1("Capitulo 5T3S1", "Descripción 5");
		Capitulo_tp1 cap6T3S1 = new Capitulo_tp1("Capitulo 6T3S1", "Descripción 6");
		Capitulo_tp1 cap7T3S1 = new Capitulo_tp1("Capitulo 7T3S1", "Descripción 7");
		Capitulo_tp1 cap8T3S1 = new Capitulo_tp1("Capitulo 8T3S1", "Descripción 7");
		Capitulo_tp1 cap9T3S1 = new Capitulo_tp1("Capitulo 9T3S1", "Descripción 8");
		
		Capitulo_tp1 cap1T1S2 = new Capitulo_tp1("Capitulo 1T1S2", "Descripción 1");
		Capitulo_tp1 cap2T1S2 = new Capitulo_tp1("Capitulo 2T1S2", "Descripción 2");
		Capitulo_tp1 cap3T1S2 = new Capitulo_tp1("Capitulo 3T1S2", "Descripción 3");
		Capitulo_tp1 cap4T1S2 = new Capitulo_tp1("Capitulo 4T1S2", "Descripción 4");
		
		//AGREGO LAS TEMPORADAS A LA SERIE 
		
		serie1.agregarTemporada(temp1S1);
		serie1.agregarTemporada(temp2S1);
		serie1.agregarTemporada(temp3S1);
		
		serie2.agregarTemporada(temp1S2);
		
		//AGREGO LOS CAPÍTULOS A CADA TEMPORADA
		
		temp1S1.agregarCapituloATemporada(cap1T1S1);
		temp1S1.agregarCapituloATemporada(cap2T1S1);
		temp1S1.agregarCapituloATemporada(cap3T1S1);
		temp1S1.agregarCapituloATemporada(cap4T1S1);
		temp1S1.agregarCapituloATemporada(cap5T1S1);
		temp1S1.agregarCapituloATemporada(cap6T1S1);
		temp1S1.agregarCapituloATemporada(cap7T1S1);
		temp1S1.agregarCapituloATemporada(cap8T1S1);
		temp1S1.agregarCapituloATemporada(cap9T1S1);
		
		temp2S1.agregarCapituloATemporada(cap1T2S1);
		temp2S1.agregarCapituloATemporada(cap2T2S1);
		temp2S1.agregarCapituloATemporada(cap3T2S1);
		temp2S1.agregarCapituloATemporada(cap4T2S1);
		temp2S1.agregarCapituloATemporada(cap5T2S1);
		temp2S1.agregarCapituloATemporada(cap6T2S1);
		temp2S1.agregarCapituloATemporada(cap7T2S1);
		temp2S1.agregarCapituloATemporada(cap8T2S1);
		temp2S1.agregarCapituloATemporada(cap9T2S1);
		
		temp3S1.agregarCapituloATemporada(cap1T3S1);
		temp3S1.agregarCapituloATemporada(cap2T3S1);
		temp3S1.agregarCapituloATemporada(cap3T3S1);
		temp3S1.agregarCapituloATemporada(cap4T3S1);
		temp3S1.agregarCapituloATemporada(cap5T3S1);
		temp3S1.agregarCapituloATemporada(cap6T3S1);
		temp3S1.agregarCapituloATemporada(cap7T3S1);
		temp3S1.agregarCapituloATemporada(cap8T3S1);
		temp3S1.agregarCapituloATemporada(cap9T3S1);
		
		temp1S2.agregarCapituloATemporada(cap1T1S2);
		temp1S2.agregarCapituloATemporada(cap2T1S2);
		temp1S2.agregarCapituloATemporada(cap3T1S2);
		temp1S2.agregarCapituloATemporada(cap4T1S2);
		
		//AGREGO CAPÍTULOS VISTOS
		u1.verCapitulo(cap1T1S1);
		u1.verCapitulo(cap2T1S1);
		u1.verCapitulo(cap3T1S1);
		u1.verCapitulo(cap4T1S1);
		u1.verCapitulo(cap5T1S1);
		u1.verCapitulo(cap1T2S1);		
		u1.verCapitulo(cap1T1S2);
		u1.verCapitulo(cap2T1S2);
		u1.verCapitulo(cap3T1S2);
		
		//CALIFICO CAPÍTULOS
		u1.calificarCapitulo(cap1T1S1, 8);
		u1.calificarCapitulo(cap2T1S1, 5);
		u1.calificarCapitulo(cap2T1S1, 7);
		u1.calificarCapitulo(cap1T3S1, 5);
		u1.calificarCapitulo(cap1T1S2, 5);
		
		//TOTAL DE EPISODIOS VISTOS DE TEMPORADA

		System.out.println(u1.getCapitulosVistosTemporada(temp1S2).size());
		
		//TOTAL DE EPISODIOS VISTOS DE SERIE
		System.out.println(u1.getCapitulosVistosSerie(serie1).size());
		
		//PROMEDIO DE TEMPORADA
		System.out.println("Promedio temporada " + temp1S1.getNombre());
		System.out.println(temp1S1.getCalificacionPromedio());
		
		//PROMEDIO DE SERIE
		System.out.println("Promedio serie " + serie1.getTitulo());
		System.out.println(serie1.getCalificacionPromedio());
	}

}
