package ar.edu.unlp.objetos.uno.ejercicio19;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public abstract class Modulo {

	private String nombre;
	private String direccion;
	private List<Envio> misEnvios;
	
	public Modulo(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		misEnvios = new LinkedList<Envio>();
	}
	public double calcularMonto(LocalDate inicio, LocalDate fin ) {
		return misEnvios.stream()
				.filter(envio -> envio.cumple(inicio,fin))
				.mapToDouble(monto -> this.devolverConDescuento(monto.getDistancia())).sum();				
	}
	
	public abstract double devolverConDescuento(double monto);
	
	public void agregarEnvio(Envio e) {
		misEnvios.add(e);
	}
	public int cantidadEnvios() {
		return misEnvios.size();
	}
	
}
