package ar.edu.unlp.objetos.uno.ejercicio25;

import java.time.LocalDate;

public abstract class ServicioMedico extends Servicio{
	private Medico M;
	private LocalDate fecha;
	public ServicioMedico(Medico M,LocalDate fecha) {
		this.M=M;
		this.fecha=fecha;
	}
	@Override
	public LocalDate getFecha() {
		return fecha;
	}
	@Override
	public double DevolverMonto() {
		return this.getDia(LocalDate.now()) + 
				M.devolverHonorario()+this.materiales();	
	}
	
	public abstract double materiales();

	public double getDia(LocalDate fecha) {
		int dia=fecha.getDayOfWeek().getValue();
		if ( dia == 7) {
			return 300;
		}
		else
			return 0;
	}
	
	
}
