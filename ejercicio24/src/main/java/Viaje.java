import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.time.temporal.ChronoUnit;
public class Viaje {
	private String origen;
	private String destino;
	private double costoTotal;
	private LocalDate fechaViaje;
	private List<Usuario> L ;
	private Vehiculo v;

	
	public Viaje(String origen,String destino, double costoTotal,LocalDate fechaViaje,Vehiculo v ) {
		this.origen=origen;
		this.destino=destino;
		this.costoTotal=costoTotal;
		this.fechaViaje=fechaViaje;
		L=new LinkedList<Usuario>();
		L.add(v.getC());
	}

	public void registrarPasajero(Pasajero p) {
		if(v.hayLugar(L.size()) && this.Cumple() && p.tieneSaldo()) {
			L.add(p);
			p.agregarViaje(this);
		}
	}
	private boolean Cumple() {
		return this.fechaValid(2);
	}
	public boolean fechaValid(int cant){
		return ChronoUnit.DAYS.between(LocalDate.now(),this.getFechaViaje()) > cant;

	}
	//procesar viaje
	public void descontarCostoViaje() {
		double valor= this.getCostoTotal()/this.L.size();
		this.L.forEach(aux -> aux.descontarSaldo(valor));
	}
	
	public double getCostoTotal() {
		return costoTotal;
	}


	public LocalDate getFechaViaje() {
		return fechaViaje;
	}


	public boolean fueRealizado() {
		return !this.fechaValid(30);
	}
	
}
