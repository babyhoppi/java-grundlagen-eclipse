package de.marco.patterns.fabrikmethode;

public class Fabrikmethode {
	
	Fahrzeug fzg = null;
	//private String art;

/**
 * die Fabrikmethode erzeugt Dahrzeuge
 * 
 * @param art beschreibt, welche Art von Auto erzeugt werden soll
 * @return das konkrete Spielzeug | null 
 */
	public Fahrzeug erzeuge(Integer art){
		// der übergebene Parameter wird in kleinbuchstaben umgewandelt
		//this.art = string.toLowerCase();
		
		switch(art){
			case 1: 
				fzg = new SolarAuto();
				break;
			case 2: 
				fzg = new DieselAuto();
				break;
			case 3: 
				fzg = new TretAuto();
				break;
		}
		return fzg;
	}



}
