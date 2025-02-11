import java.util.LinkedList;
import java.util.List;

public class Pasajero extends Usuario{
	private List<Viaje> misViajes;
	public Pasajero(String nombre, double saldo) {
		super(nombre, saldo);
		misViajes= new LinkedList<Viaje>();
	}

	public void agregarViaje(Viaje v) {

		misViajes.add(v);
	}
	public boolean tieneSaldo() {
		return this.getSaldo()>0;
	}

	@Override
	public double devolverConDescuento(double monto) {
		if(!this.viajesEn30() ) {
			return monto-(monto*0.1);
		}
		else return monto;
	}
	
	public boolean viajesEn30() {
		return misViajes.stream()
				.anyMatch(aux->aux.fueRealizado());
	}

	@Override
	public double aplicarBonificacion(double monto) {
		if(misViajes.size()>0) {
			return monto-500;
		}
		else return monto;
	}
	
	
}
