public abstract class Usuario {
	private String nombre;
	private double saldo;
	public Usuario(String nombre, double saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}
	public String getNombre() {

		return nombre;
	}

	public double getSaldo() {

		return saldo;
	}
	private void decrementarSaldo(double saldo) {

		this.saldo -=saldo ;
	}
	private void aumentarSaldo(double saldo) {

		this.saldo +=saldo ;
	}
	public void descontarSaldo(double monto) {

		this.aplicarBonificacion(monto);
	}
	public void cargar(double monto) {
		double x=this.devolverConDescuento(monto);
		this.aumentarSaldo(x);
	}
	public abstract double devolverConDescuento(double monto);
	public abstract double aplicarBonificacion(double monto);
}
