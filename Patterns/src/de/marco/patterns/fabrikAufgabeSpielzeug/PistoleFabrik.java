package de.marco.patterns.fabrikAufgabeSpielzeug;

public class PistoleFabrik extends Fabrik{
	
	// die Methode zum Erzeugen neuer Fahrzeuge wird deklariert
	public Spielzeug erzeuge() {
		
		return new Pistole();
		
	}

}
