package trabajo_practico_5_p5;

public class Main_empresa {

	public static void main(String[] args) {
		
		Empleado juan = new Empleado("Juan", "Hernandez", 123, 17000);
		Empleado_ventas martin = new Empleado_ventas("Martin", "Gonzalez", 222, 15000, 50, 5);
		Empleado_ventas pablo = new Empleado_ventas("Pablo", "Gutierrez", 333, 13000, 40, 10);
		//PREGUNTAR
		Empleado_bono julian = new Empleado_bono("Julian", "Perez", 444, 10000, 60, 15, 50, 1000);
		Empleado_bono mauro = new Empleado_bono("Mauro", "Szeta", 555, 20000, 20, 15, 30, 3000);
		Empresa empresa = new Empresa("Empresa");
		
		empresa.agregarEmpleado(juan);
		empresa.agregarEmpleado(martin);
		empresa.agregarEmpleado(pablo);
		empresa.agregarEmpleado(julian);
		empresa.agregarEmpleado(mauro);
		

		System.out.println("Total gastos en sueldos: $" + empresa.getGastosEnSueldos());
		System.out.println("Sueldo de " + julian.getNomre() + ": " + julian.getSueldo());
		System.out.println("Sueldo de " + mauro.getNomre() + ": " + mauro.getSueldo());
	}

}
