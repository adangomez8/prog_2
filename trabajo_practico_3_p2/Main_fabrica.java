package trabajo_practico_3_p2;

public class Main_fabrica {

	public static void main(String[] args) {
		
		Producto silla = new Producto("Silla", 5, 100, "Algarrobo", "Marron");
		Producto mesa = new Producto("Mesa", 10, 1000, "Pino", "Negro");
		Producto banco = new Producto("Banco", 7, 500, "Pino", "Marron");
		Producto cajonera = new Producto("Cajonera", 12, 2000, 10, "Algarrobo", "Gris");
		
		Fabrica fabrica1 = new Fabrica("Fabrica 1");

		fabrica1.agregarProducto(silla);
		fabrica1.agregarProducto(mesa);
		fabrica1.agregarProducto(banco);
		fabrica1.agregarProducto(cajonera);
		
		fabrica1.agregarProductoAstock(silla);
		fabrica1.agregarProductoAstock(silla);
		fabrica1.agregarProductoAstock(silla);
		fabrica1.agregarProductoAstock(silla);
		fabrica1.agregarProductoAstock(mesa);
		fabrica1.agregarProductoAstock(mesa);
		fabrica1.agregarProductoAstock(mesa);
		fabrica1.agregarProductoAstock(banco);
		fabrica1.agregarProductoAstock(banco);
		
		
		System.out.println("Precio silla para la venta: " + silla.getPrecioVenta());
		
		System.out.println("Precio cajonera para la venta: " + cajonera.getPrecioVenta());
		
	}

}
