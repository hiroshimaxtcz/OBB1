public class Conductor extends Usuario{
	private Vehiculo miVehiculo;
	public Conductor(String nombre, double saldo,Vehiculo miVehiculo) {
		super(nombre, saldo);
		this.miVehiculo=miVehiculo;
	}

	@Override
	public double devolverConDescuento(double monto) {
		
		return monto+(monto * miVehiculo.getDescuento());
	}

	@Override
	public double aplicarBonificacion(double monto) {
		
		return monto+(miVehiculo.getValorMercado()*0.1);
	}

}
