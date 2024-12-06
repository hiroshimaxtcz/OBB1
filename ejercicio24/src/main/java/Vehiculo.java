import java.time.LocalDate;
public class Vehiculo {
	private Conductor c;
	private String descripcion;
	private int anioFabricacion;
	private double valorMercado;
	private int cantPasajeros;
	public Vehiculo(Conductor c, String descripcion, int anioFabricacion, double valorMercado, int cantPasajeros) {
		this.c = c;
		this.descripcion = descripcion;
		this.anioFabricacion = anioFabricacion;
		this.valorMercado = valorMercado;
		this.cantPasajeros = cantPasajeros;
	}
	
	public boolean hayLugar(int cantidad) {
		return (cantPasajeros-cantidad)>=0;
	}
	
	
	public Conductor getC() {
		return c;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public double getValorMercado() {
		return valorMercado;
	}

	public int getCantPasajeros() {
		return cantPasajeros;
	}

	public double getDescuento() {
		int edad= LocalDate.now().getYear() -this.getAnioFabricacion();
		if (edad < 5) {
			return 0.01;
		}
		else
			return 0.1;
		
	}
	
}
