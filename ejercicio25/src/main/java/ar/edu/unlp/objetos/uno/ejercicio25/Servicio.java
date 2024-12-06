package ar.edu.unlp.objetos.uno.ejercicio25;
import java.time.LocalDate;
public abstract class Servicio {

	public abstract double DevolverMonto();
	public boolean cumpleFecha(LocalDate fecha) {
		if (this.getFecha()== fecha) {
			return true;
		}
		else
			return false;
	}
}
