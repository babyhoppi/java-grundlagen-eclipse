package de.marco.patterns.fabrik;

public class SolarAutoFabrik extends Fabrik{
	
	// die Methode zum Erzeugen neuer Fahrzeuge wird deklariert
	public Fahrzeug erzeuge() {
		
		return new SolarAuto();
		
	}

}
