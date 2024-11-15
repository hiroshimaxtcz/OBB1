package ar.edu.unlp.objetos.uno.ejercicio14A;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
public class DateLapse implements Dates{
	private LocalDate from;
	private LocalDate to;
	
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	public DateLapse(int day, int month, int year) {
		this.from = LocalDate.now();
		this.to= LocalDate.of(year, month, day);
	}
	public LocalDate getFrom() {
		return from;
	}
	
	public void setFrom(LocalDate from) {
		this.from = from;
	}
	
	public LocalDate getTo() {
		return to;
	}
	
	public void setTo(LocalDate to) {
		this.to = to;
	}
	public int sizeInDays(){
		
		return (int)ChronoUnit.DAYS.between(from, to);
	}
	public boolean includesDate(LocalDate other){
		//System.out.println(this.getFrom().toString() + "  "+ this.getTo().toString());
		return other.isAfter(this.getFrom()) && other.isBefore(this.getTo()) 
				|| other.isEqual(this.getFrom()) || other.isEqual(this.getTo());
	}
	//el b implica cambiar el modelo a una interfaz, preguntar en alguna clase de consulta antes del jueves

}
