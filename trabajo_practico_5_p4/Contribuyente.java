package trabajo_practico_5_p4;

public abstract class Contribuyente {
	
	private String nombre;
	private int codigoIdTrib;
	protected Ciudad ciudad;
	
	public Contribuyente(String nombre, int codigoIdTrib, Ciudad ciudad) {
		this.nombre = nombre;
		this.codigoIdTrib = codigoIdTrib;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCodigoIdTrib() {
		return codigoIdTrib;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}
	
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public boolean perteneceACiudad(Ciudad ciudad) {
		
		if(this.ciudad == ciudad) {
			return true;
		}
		
		return false;
	}
	
	public abstract double totalApagar(); 
	
	public boolean equals(Object ob) {
		
		Contribuyente c = ((Contribuyente)ob);
		if(c.getCodigoIdTrib()==this.codigoIdTrib) {
			return true;
		}
		
		return false;
	}

}
