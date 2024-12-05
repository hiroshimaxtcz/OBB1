package ar.edu.unlp.objetos.uno.ejercicio19;

import java.time.LocalDate;

public class EnvioInterUrbano extends Envio{
	private double distanciakm;
	public EnvioInterUrbano(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino,double peso,double distanciakm){
		super(fechaDespacho,direccionOrigen,direccionDestino,peso);
		this.distanciakm=distanciakm;
	}
	
	public double getDistanciakm() {
		return distanciakm;
	}
	public int costokm() {
		if(this.getDistanciakm() <100){
			return 20;
		}
		else if (this.getDistanciakm() <500) {
				return 25;
			}
			else return 30;
	}
	
	@Override
	public double getDistancia() {
		return (this.costokm()*this.getPeso());
	}

}
