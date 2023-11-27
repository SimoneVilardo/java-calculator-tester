package org.lessons.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TicketTest {
	
	@Test
	public void  testCalcolaPrezzo() throws Exception {
		
		Ticket ticket = new Ticket(100, 25);
		assertEquals(21, ticket.calcolaPrezzo(), "Il prezzo intero è stato calcolato male");
		
	}
	
	@Test
	public void  testCalcolaPrezzoConScontoUnder18() throws Exception {
		
		Ticket ticket = new Ticket(100, 17);
		assertEquals(16.8, ticket.calcolaPrezzo(), "Il prezzo con sconto under 18 è stato calcolato male");
		
	}
	
	@Test
	public void  testCalcolaPrezzoConScontoOver65() throws Exception {
		
		Ticket ticket = new Ticket(100, 66);
		assertEquals(12.6, ticket.calcolaPrezzo(), "Il prezzo con sconto over 65 è stato calcolato male");
		
	}
	
	@Test
	public void testConKmNegativo() {
		
		assertThrows(Exception.class,() -> new Ticket(-70, 35), "Non è stata lanciata un eccezione per i km negativi");
		
	}
	
	@Test
	public void testConEtaNegativo() {
		
		assertThrows(Exception.class, () -> new Ticket(70, -35), "Non è stata lanciata un eccezione per l'eta negativa");
		
	}
	
}
