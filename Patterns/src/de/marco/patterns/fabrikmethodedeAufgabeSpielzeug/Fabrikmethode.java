package de.marco.patterns.fabrikmethodedeAufgabeSpielzeug;

public class Fabrikmethode {
	
	Spielzeug spielzeug = null;
	//private String art;

/**
 * die Fabrikmethode erzeugt Dahrzeuge
 * 
 * @param art beschreibt, welche Art von Auto erzeugt werden soll
 * @return das konkrete Spielzeug | null 
 */
	public Spielzeug erzeuge(Integer art){
		// der übergebene Parameter wird in kleinbuchstaben umgewandelt
		//this.art = string.toLowerCase();
		
		switch(art){
			case 1: 
				spielzeug = new Brummbaer();
				break;
			case 2: 
				spielzeug = new Brummkreisel();
				break;
			case 3: 
				spielzeug = new Barbie();
				break;
			case 4: 
				spielzeug = new Pistole();
				break;
		}
		return spielzeug;
	}



}
