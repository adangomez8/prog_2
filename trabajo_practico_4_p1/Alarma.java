package trabajo_practico_4_p1;

public class Alarma {
	/*Implementar en Java todo el c�digo necesario para el funcionamiento de una alarma. La alarma tiene tres variables que indican si:
	 *  se rompi� un vidrio, se abri� una puerta o ventana, se detect� un movimiento dentro del domicilio. Cuando se invoca al m�todo comprobar() 
	 *  de la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la se�al sonora.
Crea una clase denominada AlarmaLuminosa que, adem�s de activar la se�al sonora, encienda una luz cuando alguno de los indicadores est� activado.
Nota: Asumir que hay una clase Timbre, con un m�todo hacerSonar() y una clase Luz con el m�todo encender().
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
