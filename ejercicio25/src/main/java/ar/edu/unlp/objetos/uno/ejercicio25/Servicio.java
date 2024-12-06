package ar.edu.unlp.objetos.uno.ejercicio25;
import java.time.LocalDate;
public abstract class Servicio {

	public abstract double DevolverMonto();
	private LocalDate fecha;
	
	public boolean cumpleFecha(LocalDate fecha) {
		if (this.getFecha().equals(fecha)) {
			return true;
		}
		else
			return false;
	}
	public abstract LocalDate getFecha();


}
