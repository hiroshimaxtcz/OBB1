package ar.edu.unlp.objetos.uno.ejercicio14A;
import java.time.LocalDate;
public interface Dates {
	LocalDate getFrom();
	LocalDate getTo();
	int sizeInDays();
	boolean includesDate(LocalDate other);
}
