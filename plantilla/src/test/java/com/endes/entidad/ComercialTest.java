package com.endes.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComercialTest {
	
	Comercial comercial;
	Comercial comercial2;

	@BeforeEach
	void setUp() throws Exception {
		comercial = new Comercial("123465789","Pepe","Martin", 800.1, 50.1);
		comercial2 = new Comercial("123465787","Pepito","Martinez", 600.2, 150);
	}

	@Test
	void testGetSueldo() {
		Double sueldoEsperado = 800.1;
		Double actual = comercial.getSueldo()+comercial2.calcularExtra();
		assertEquals(sueldoEsperado, actual);
		
	}
	
	@Test
	void testGetSueldo2() {
		Double sueldoEsperado = 600.2;
		Double actual = comercial2.getSueldo()+comercial2.calcularExtra();
		assertEquals(sueldoEsperado, actual);
		
	}
	
	
	@Test
	void testCalcularExtra() {
		
		comercial.calcularExtra();
		double resultado = comercial.getSueldo();
		assertEquals(resultado, comercial.getSueldo());
		
	}

	@Test
	void testGetVentas() {
		Double ventasEsperada = 50.1;
		Double actual = comercial.getSueldo();
		assertEquals(ventasEsperada, actual);
	}

	@Test
	void testSetVentas() {
		IllegalArgumentException excepcion = assertThrows( IllegalArgumentException.class, () -> comercial.setVentas(-50) ); 
		// Solo verificamos que contenga la frase principal 
			assertTrue(excepcion.getMessage().contains("Las ventas no pueden ser negativas"));
	}

}
