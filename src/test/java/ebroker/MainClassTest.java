package ebroker;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MainClassTest {

	private MainClass mainClass;

	@Before
	public void setUp() {
		mainClass = new MainClass();
	}


	@Test
	public void testCrearMensaje() {

		String nombre = "Paco";
		Sring mensaje = mainClass.crearMensaje(nombre);

		assertEquals(mensaje, "Hola Paco");

	}

	@Test
	public void testSaludar() {

		String nombre = "Pepe";
		mainClass.saludar(nombre);

		assertTrue(true);
	}

	@Test
	public void testMain() {

		String[] args = {};
		
		mainClass.main(args);

		assertTrue(true);
	}

}