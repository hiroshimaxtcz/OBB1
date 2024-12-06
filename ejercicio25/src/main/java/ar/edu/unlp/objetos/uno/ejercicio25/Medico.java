package ar.edu.unlp.objetos.uno.ejercicio25;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Medico {
	private String nombre;
	private LocalDate ingreso;
	private double honorario;
	
	public Medico(String nombre, LocalDate ingreso, double honorario) {
		this.nombre = nombre;
		this.ingreso = ingreso;
		this.honorario = honorario;
	
	}
	
	public String getNombre() {
		return nombre;
	
	}


	public LocalDate getIngreso() {
		return ingreso;
	
	}

	public double getHonorario() {
		return honorario;
	
	}

	public double devolverHonorario() {
		return this.getHonorario() + this.getAntiguedad();
		
	}

	public double getAntiguedad() {
		int tiempo = (int)ChronoUnit.YEARS.between(this.getIngreso(), LocalDate.now());
		return tiempo * 100;
	
	}
	

	

}
