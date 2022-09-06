package trabajo_practico_2_p5;

import java.time.LocalDateTime;

public class Main_peluqueria {

	public static void main(String[] args) {
		
		Peluquero peluq1 = new Peluquero("Juan", "Perez");
		Peluquero peluq2 = new Peluquero("Pedro", "Perez");
		Peluquero peluq3 = new Peluquero("María", "Perez");
		Peluquero peluq4 = new Peluquero("Franco", "Perez");
		Peluquero peluq5 = new Peluquero("José", "Perez");

		Cliente cliente1 = new Cliente("Juan", "Gonzalez", peluq1);
		Cliente cliente2 = new Cliente("Pedro", "Gonzalez", peluq1);
		Cliente cliente3 = new Cliente("María", "Gonzalez", peluq1);
		Cliente cliente4 = new Cliente("Franco", "Gonzalez", peluq2);
		Cliente cliente5 = new Cliente("José", "Gonzalez", peluq2);
		
		Turno turno1 = new Turno("Turno 1", cliente1, 100, LocalDateTime.of(2022, 8, 29, 12, 0));
		Turno turno2 = new Turno("Turno 2", cliente2, 100, LocalDateTime.of(2022, 8, 29, 15, 0));
		Turno turno3 = new Turno("Turno 3", cliente3, 100, LocalDateTime.of(2022, 8, 29, 11, 30));
		Turno turno4 = new Turno("Turno 4", cliente4, 100, LocalDateTime.of(2022, 8, 29, 9, 0));
		Turno turno5 = new Turno("Turno 5", cliente5, 100, LocalDateTime.of(2022, 8, 29, 14, 30));
		
		Peluqueria peluqueria1 = new Peluqueria("Peluquería 1");
		
		turno1.agregarPeluquero(peluq1);
		turno1.agregarPeluquero(peluq2);
		turno1.agregarPeluquero(peluq3);
		turno1.agregarPeluquero(peluq4);
		turno1.agregarPeluquero(peluq5);
		
		turno2.agregarPeluquero(peluq1);
		turno2.agregarPeluquero(peluq2);
		turno2.agregarPeluquero(peluq3);
		turno2.agregarPeluquero(peluq4);
		turno2.agregarPeluquero(peluq5);
		
		turno3.agregarPeluquero(peluq1);
		turno3.agregarPeluquero(peluq2);
		turno3.agregarPeluquero(peluq3);
		turno3.agregarPeluquero(peluq4);
		turno3.agregarPeluquero(peluq5);
		
		turno4.agregarPeluquero(peluq1);
		turno4.agregarPeluquero(peluq2);
		turno4.agregarPeluquero(peluq3);
		turno4.agregarPeluquero(peluq4);
		turno4.agregarPeluquero(peluq5);
		
		turno5.agregarPeluquero(peluq1);
		turno5.agregarPeluquero(peluq2);
		turno5.agregarPeluquero(peluq3);
		turno5.agregarPeluquero(peluq4);
		turno5.agregarPeluquero(peluq5);
		
		peluqueria1.agregarTurno(turno1);
		peluqueria1.agregarTurno(turno2);
		peluqueria1.agregarTurno(turno3);
		peluqueria1.agregarTurno(turno4);
		peluqueria1.agregarTurno(turno5);
		
		//NO FUNCIONA
		System.out.println(peluqueria1.getTurnos());
		peluqueria1.ordenarTurnos();
		
		System.out.println(peluqueria1.getTurnos());

		//NO FUNCIONA
		peluqueria1.asignarTurno(turno1);
		peluqueria1.asignarTurno(turno2);
		peluqueria1.asignarTurno(turno3);
		peluqueria1.asignarTurno(turno4);
		peluqueria1.asignarTurno(turno5);
	}
	
	

}
