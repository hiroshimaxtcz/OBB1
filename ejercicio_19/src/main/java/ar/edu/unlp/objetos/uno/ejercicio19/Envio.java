package ar.edu.unlp.objetos.uno.ejercicio19;

import java.time.LocalDate;

import ar.edu.unlp.objetos.uno.ejercicio14A.DateLapse;

public abstract class Envio {
	private LocalDate fechaDespacho;
	private String direccionOrigen;
	private String direccionDestino;
	private double peso;
	public Envio(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino,double peso) {
		super();
		this.fechaDespacho = fechaDespacho;
		this.direccionOrigen = direccionOrigen;
		this.direccionDestino = direccionDestino;
		this.peso=peso;
	}
	public double getPeso() {
		return peso;
	}
	public boolean cumple(LocalDate ini,LocalDate fin) {
		DateLapse l = new DateLapse(ini,fin);

		return l.includesDate(fechaDespacho);
	}
	
	public abstract double getDistancia();
	
}
