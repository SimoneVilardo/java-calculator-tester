package org.lessons.java;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class CalculatorTest {
	
	float num1  = 10;
	float num2 = 5;
	
	Calculator c = new Calculator();
	
	@Test
	public void testAddizione() {
		
		assertEquals(num1 + num2, c.addizione(num1 , num2), "Addizione non riuscita");
		
	}
	
	@Test
	public void testSottrazione(){
		
		assertEquals(num1 - num2, c.sottrazione(num1 , num2), "Sottrazione non riuscita");
		
	}
	
	@Test
	public void testDivisione() throws Exception {
		
		assertEquals(num1 / num2, c.divisione(num1 , num2));
		
	}
	
	@Test
	public void testDivisioneNoEccezioni() throws Exception{
		
		assertDoesNotThrow(() -> c.divisione(num1, num2), "Eccezione generata");
		
	}
	
	@Test
	public void testDivisioneEccezioni() throws Exception{
		
		assertThrows(Exception.class , () -> c.divisione(num1, 0), "Non è stata lanciata un eccezione");
		
	}
	
	@Test
	public void testMoltiplicazione(){
		
		assertEquals(num1 * num2, c.moltiplicazione(num1, num2), "Moltiplicazione non riuscita");
		
	}

}
