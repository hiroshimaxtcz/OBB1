package ar.edu.unlp.objetos.uno.ejercicio25;

import java.time.LocalDate;

public class Consulta extends ServicioMedico{

	public Consulta(Medico M,LocalDate fechaAtencion) {
		super(M,fechaAtencion);
	}

	@Override
	public double materiales() {
		
		return 300;
	}



	
	
}
