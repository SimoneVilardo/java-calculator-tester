package org.lessons.java;

public class Ticket {
	
	private int km;
	private int eta;
	
	public Ticket(int km, int eta) throws Exception {
		
		if(km <= 0 || eta < 0) {
			throw new Exception("I valori devono essere maggiori di zero");
		}
		
		setKm(km);
		setEta(eta);
		
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public double calcolaPrezzo() {
		double prezzo = getKm() * 0.21;
		
		double nuovoPrezzo = 0;
		
		if (getEta() < 18) {
			nuovoPrezzo = prezzo * 0.8;
		}else if (getEta() > 65) {
			nuovoPrezzo = prezzo * 0.6;
		}else {
			nuovoPrezzo = prezzo;
		}
		
		return nuovoPrezzo;
	}
}
