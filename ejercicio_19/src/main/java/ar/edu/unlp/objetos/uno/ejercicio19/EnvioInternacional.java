package ar.edu.unlp.objetos.uno.ejercicio19;

import java.time.LocalDate;

public class EnvioInternacional extends Envio{

	
	public EnvioInternacional(LocalDate fechaDespacho, double direccionOrigen, double direccionDestino,double peso){
		super(fechaDespacho,direccionOrigen,direccionDestino,peso);
	}
	@Override
	public double getDistancia() {
		return 5000* super.getPeso();
	}

}
