package ar.edu.unlp.objetos.uno.ejercicio19;

import java.time.LocalDate;

public class EnvioLocal extends Envio {
	private Boolean esExpress=false;
	public EnvioLocal(LocalDate fechaDespacho, String direccionOrigen,  String direccionDestino,double peso,Boolean esExpress){
		super(fechaDespacho,direccionOrigen,direccionDestino,peso);
		this.esExpress=true;
		
	}
	public int monto() {
		if(esExpress) {
			return 500;
		}
		else return 0;
	}
	@Override
	public double getDistancia() {
	
		return 1000+ this.monto();
	}

}
