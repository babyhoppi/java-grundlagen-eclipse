package de.marco.patterns.fabrikAufgabeSpielzeug;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Wir testen unsere Fabriken und unsere Autos
		
		//... eine Solarautofabrik
		Fabrik p = new PistoleFabrik();
		// ... erzeugt Solarautos
		Spielzeug pistole = p.erzeuge();
		//... die ganz leise fahren
		pistole.spielen();
		
		Fabrik b = new BrummkreiselFabrik();
		Spielzeug brummkreisel = b.erzeuge();
		brummkreisel.spielen();
		
		Fabrik bb = new BrummbaerFabrik();
		Spielzeug brummbaer = bb.erzeuge();
		brummbaer.spielen();
		
		Fabrik ba = new BarbieFabrik();
		Spielzeug barbie = ba.erzeuge();
		barbie.spielen();
		
	}

}
