package trabajo_practico_4_p1;

public class Alarma {
	/*Implementar en Java todo el código necesario para el funcionamiento de una alarma. La alarma tiene tres variables que indican si:
	 *  se rompió un vidrio, se abrió una puerta o ventana, se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() 
	 *  de la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal sonora.
Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora, encienda una luz cuando alguno de los indicadores está activado.
Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el método encender().
*/
	
	
private boolean vidrioRoto;
private boolean puertaAbierta;
private boolean ventanaAbierta;
private boolean hayMovimiento;

public Alarma() {
	this.vidrioRoto = false;
	this.puertaAbierta = false;
	this.ventanaAbierta = false;
	this.hayMovimiento = false;
}

public boolean comprbar() {
	if(this.vidrioRoto || this.puertaAbierta || this.ventanaAbierta || this.hayMovimiento) {
		
		return true;
	}
	return false;
}

public void activarAlarma() {
	if(this.comprbar()) {
		this.dispararAlarma();
	}
}


public void dispararAlarma() {
	// TODO Auto-generated method stub
	Timbre.hacerSonar();
	
}

public boolean isVidrioRoto() {
	return vidrioRoto;
}

public void setVidrioRoto(boolean vidrioRoto) {
	this.vidrioRoto = vidrioRoto;
}

public boolean isPuertaAbierta() {
	return puertaAbierta;
}

public void setPuertaAbierta(boolean puertaAbierta) {
	this.puertaAbierta = puertaAbierta;
}

public boolean isVentanaAbierta() {
	return ventanaAbierta;
}

public void setVentanaAbierta(boolean ventanaAbierta) {
	this.ventanaAbierta = ventanaAbierta;
}

public boolean isHayMovimiento() {
	return hayMovimiento;
}

public void setHayMovimiento(boolean hayMovimiento) {
	this.hayMovimiento = hayMovimiento;
}




}
