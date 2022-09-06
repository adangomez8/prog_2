package trabajo_practico_4_p1;

public class AlarmaLuminosa extends Alarma {
	
	public void dispararAlarma() {
		super.dispararAlarma();
		Luz.encender();
	}
	
	

}
