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
	public Spielzeug erzeuge(EnumSpielzeugArt art){
		// der übergebene Parameter wird in kleinbuchstaben umgewandelt
		//this.art = string.toLowerCase();
		
		switch(art){
			case brummbaer: 
				spielzeug = new Brummbaer();
				break;
			case brummkreisel: 
				spielzeug = new Brummkreisel();
				break;
			case barbie: 
				spielzeug = new Barbie();
				break;
			case pistole: 
				spielzeug = new Pistole();
				break;
		}
		return spielzeug;
	}



}
