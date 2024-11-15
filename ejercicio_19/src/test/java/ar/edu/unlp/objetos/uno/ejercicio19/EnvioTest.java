package ar.edu.unlp.objetos.uno.ejercicio19;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnvioTest {
	private ClienteCorporativo c;
	private PersonaFisica p;
	private Envio envioLocal;
	private Envio envioInterUrbano;
	private Envio envioInternacional;
	
	@BeforeEach
	void setUp() {
		envioLocal= new EnvioLocal(LocalDate.now(),"genova","la plata",50,true);
		envioInterUrbano= new EnvioInterUrbano(LocalDate.of(2024,11, 3),"genova","la plata",500.0,5000);
		envioInternacional= new EnvioInternacional(LocalDate.of(2024,12, 3),"la plata","berisso",500.0);
		p= new PersonaFisica("daniel","berisso",44718534);
		c=new ClienteCorporativo("expressia","berisso",247185343);




	}
	@Test
	void testAgregarEnvio() {
		p.agregarEnvio(envioInterUrbano);
		p.agregarEnvio(envioLocal);
		p.agregarEnvio(envioInternacional);
		
		assertEquals(p.cantidadEnvios(),3);
		
		c.agregarEnvio(envioInterUrbano);
		c.agregarEnvio(envioLocal);
		c.agregarEnvio(envioInternacional);

		assertEquals(p.cantidadEnvios(),3);
	}
	@Test
	void testMontoAPagar() {
		p.agregarEnvio(envioInterUrbano);
		p.agregarEnvio(envioLocal);
		p.agregarEnvio(envioInternacional);

		c.agregarEnvio(envioInterUrbano);
		c.agregarEnvio(envioLocal);
		c.agregarEnvio(envioInternacional);

		//fecha donde se realizaron envios
		assertEquals (p.calcularMonto(LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 30)),14850.0);
		assertEquals (c.calcularMonto(LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 30)),16500.0);
		//fecha donde no se realizaron envio
		assertEquals (p.calcularMonto(LocalDate.of(2024, 10, 1), LocalDate.of(2024, 11, 1)),0);
		assertEquals (c.calcularMonto(LocalDate.of(2024, 10, 1), LocalDate.of(2024, 11, 1)),0);
	
	}

}
