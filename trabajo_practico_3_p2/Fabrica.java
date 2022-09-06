package trabajo_practico_3_p2;

import java.util.ArrayList;

public class Fabrica {

	private String nombre;
	private double porcParaVender;
	private ArrayList<Producto>productos;
	private ArrayList<Producto>productos_stock;
	
	public Fabrica(String nombre) {
		this.nombre = nombre;
		this.porcParaVender = 35;
		this.productos = new ArrayList<>();
		this.productos_stock = new ArrayList<>();
	}
	
	public Fabrica(String nombre, double porcParaVender) {
		this.nombre = nombre;
		this.porcParaVender = porcParaVender;
		this.productos = new ArrayList<>();
		this.productos_stock = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public double getPorcParaVender() {
		return porcParaVender;
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
	
	public double getPrecioVenta(Producto producto) {
		
		return (producto.getPrecioFabricacion()+(producto.getPrecioFabricacion()*this.porcParaVender)/100);
	}

	public void setPorcParaVenderAproducto(Producto producto, double porcentaje) {
		
		double porcAux=0;
		if(this.productos.contains(producto)) {
			//porcAux = (producto.getPrecioFabricacion()+(producto.getPrecioFabricacion()*porcentaje)/100);
		}
		this.porcParaVender = porcAux;
	}
	
	public void agregarProductoConDistintoProcVenta(Producto producto, double porcentaje) {
		
		if(!this.productos.contains(producto)) {
			this.productos.add(producto);
		}
	}
}
