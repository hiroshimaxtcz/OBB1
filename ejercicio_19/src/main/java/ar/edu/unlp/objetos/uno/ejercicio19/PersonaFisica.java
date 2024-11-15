package ar.edu.unlp.objetos.uno.ejercicio19;

import java.util.LinkedList;
import java.util.List;

public class PersonaFisica extends Modulo{
	private int DNI ;
	public PersonaFisica(String nombre, String direccion, int DNI) {
		super(nombre,direccion);
		this.DNI = DNI;
	}
	@Override
	public double devolverConDescuento(double monto) {
		return monto-(monto*0.1);
	}
}
