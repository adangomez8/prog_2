package trabajo_practico_4_p3;

public class Main_empresa {
	
	public static void main(String[] args) {
		

	Empleado empleadoCont = new Empleado("Juan", "Perez", 1000);
	Empleado_horasExtras empleadoHorEx = new Empleado_horasExtras("Maria", "Gonzalez", 2000, 8, 50);
	Empleado_Xcomision empleadoXcom = new Empleado_Xcomision("Jose", "Fernandez", 3000, 10, 70);
	
	Empresa empresa = new Empresa();
	
	empresa.agregarEmpleado(empleadoCont);
	empresa.agregarEmpleado(empleadoHorEx);
	empresa.agregarEmpleado(empleadoXcom);
	
	System.out.println(empresa.getSueldoEmpleado(empleadoCont));
	System.out.println(empresa.getSueldoEmpleado(empleadoHorEx));
	System.out.println(empresa.getSueldoEmpleado(empleadoXcom));
	
	}
}
