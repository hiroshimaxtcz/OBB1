package ar.edu.unlp.objetos.uno.ejercicio25;

import java.time.LocalDate;

public class Guarderia extends Servicio{
	private int cantDias;
	private LocalDate fecha;
	private Mascota M;
	public Guarderia(int cantDias, LocalDate fecha, Mascota m) {
		super();
		this.cantDias = cantDias;
		this.fecha = fecha;
		M = m;
	}
	public LocalDate getFecha(){
		return fecha;
		
	}
	
	@Override
	public double DevolverMonto() {
		double total = 500 *cantDias;
		if(M.cumple()) {
			return total-(total*0.1);
		}
		else return total;
	}
	
	
	


}
