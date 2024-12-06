package ar.edu.unlp.objetos.uno.ejercicio25;

import java.time.LocalDate;

public class Vacunacion extends ServicioMedico{
	private String nombre;
	private double costo;
	
	public Vacunacion(Medico M, String nombre, double costo, LocalDate fecha) {
		super(M,fecha);
		this.nombre = nombre;
		this.costo = costo;
	}

	@Override
	public double materiales() {
		return 500;
	}
	
}
