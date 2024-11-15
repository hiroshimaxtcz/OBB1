package ar.edu.unlp.objetos.uno.ejercicio19;

import java.util.LinkedList;
import java.util.List;

public class ClienteCorporativo extends Modulo{
	private int cuit;
	public ClienteCorporativo(String nombre, String direccion, int cuit) {
		super(nombre,direccion);
		this.cuit = cuit;
	}
	@Override
	public double devolverConDescuento(double monto) {
		return monto;
	}
}
