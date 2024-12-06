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
		}
		
		
	}
	private boolean Cumple() {
		return ChronoUnit.DAYS.between(LocalDate.now(),this.getFechaViaje())>2;
		
	}
	
	//procesar viaje
	public void descontarCostoViaje() {
		double valor= this.getCostoTotal()/this.getL().size();
		this.getL().forEach(aux -> aux.descontarSaldo(valor));
	}
	
	public double getCostoTotal() {
		return costoTotal;
	}


	public LocalDate getFechaViaje() {
		return fechaViaje;
	}

	public List<Usuario> getL() {
		return L;
	}
	public boolean fueRealizado() {
		return ChronoUnit.DAYS.between(LocalDate.now(),this.getFechaViaje())<=30;
	}
	public boolean fueHecho() {
		return ChronoUnit.DAYS.between(LocalDate.now(),this.getFechaViaje())>0;
	}
	
}
