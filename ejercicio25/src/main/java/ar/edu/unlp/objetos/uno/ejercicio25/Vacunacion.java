package ar.edu.unlp.objetos.uno.ejercicio25;

import java.time.LocalDate;

public class Vacunacion extends ServicioMedico{
	private String nombre;
	private double costo;
	private LocalDate fecha;
	
	public Vacunacion(Medico M, String nombre, double costo, LocalDate fecha) {
		super(M);
		this.nombre = nombre;
		this.costo = costo;
		this.fecha = fecha;
	}
	
	@Override
	public double materiales() {
		return 500;
	}
	
}
