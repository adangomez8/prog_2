package trabajo_practico_3_p2;

import java.util.ArrayList;

public class Fabrica {

	private String nombre;
	private ArrayList<Producto>productos;
	private ArrayList<Producto>productos_stock;
	
	public Fabrica(String nombre) {
		this.nombre = nombre;
		this.productos = new ArrayList<>();
		this.productos_stock = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public ArrayList<Producto> getProductos() {
		return new ArrayList<Producto>(this.productos);
	}

	public ArrayList<Producto> getProductos_stock() {
		return new ArrayList<Producto>(this.productos_stock);
	}
	
	public void agregarProducto(Producto producto) {
		if(!this.productos.contains(producto)) {
			this.productos.add(producto);
		}
	}
	
	public void agregarProductoAstock(Producto producto) {
		if(this.productos.contains(producto)) {
			this.productos_stock.add(producto);
		}
	}
	
	public void agregarProductoConDistintoProcVenta(Producto producto, double porcentaje) {
		
		if(!this.productos.contains(producto)) {
			this.productos.add(producto);
		}
	}
}
