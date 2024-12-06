package ar.edu.unlp.objetos.uno.ejercicio25;

import java.time.LocalDate;

public class Consulta extends ServicioMedico{
	private LocalDate fechaAtencion;

	public Consulta(Medico M,LocalDate fechaAtencion) {
		super(M);
		this.fechaAtencion = fechaAtencion;
	}

	public LocalDate getFecha() {
		return fechaAtencion;
	}

	@Override
	public double materiales() {
		
		return 300;
	}



	
	
}
