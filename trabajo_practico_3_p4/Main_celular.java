package trabajo_practico_3_p4;

import java.time.LocalDate;

public class Main_celular {

	public static void main(String[] args) {
		
		Ciudad ciudad1 = new Ciudad("Rauch");
		Ciudad ciudad2 = new Ciudad("Tandil");
		
		Contacto cont1 = new Contacto("Juan", "Perez", "direccion 123", ciudad1, "juanperez123@gmail.com", LocalDate.of(2000, 1, 1),12365478);
		Contacto cont2 = new Contacto("Juan", "Perez", "direccion 143", ciudad1, "juanperez143@gmail.com", LocalDate.of(2003, 1, 1),12365478);
		Contacto cont3 = new Contacto("Maria", "Gonzalez", "direccion 523", ciudad2, "mariagonzalez123@gmail.com", LocalDate.of(1998, 1, 1),15882278);
		Contacto cont4 = new Contacto("Maria", "Gonzalez", "direccion 523", ciudad2, "mariagonzalez123@gmail.com", LocalDate.of(1997, 1, 1),15882278);
		Contacto cont5 = new Contacto("Jose", "Fernandez", "direccion 523", ciudad2, "josefernandez123@gmail.com", LocalDate.of(1994, 1, 1),17982278);
		
		Celular celular = new Celular();
		
		celular.agregarContacto(cont1);
		celular.agregarContacto(cont2);
		celular.agregarContacto(cont3);
		celular.agregarContacto(cont4);
		
		System.out.println(celular.getContactos().size());
		System.out.println(celular.getContactos_repetidos().size());
		System.out.println(celular.getContactos_mismoNroTelefono().size());
		
		System.out.println("Promedio de edad: " + celular.getPromedioEdad());
		
		System.out.println("Contactos: " + celular.getContactos());
	}

}
