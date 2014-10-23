package de.marco.patterns.fabrikmethodedeAufgabeSpielzeug;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Allternativ kann das Fabrikmuster durch die Fabrikmethode ersetzt werden
		Fabrikmethode fm = new Fabrikmethode();
		Spielzeug spz = fm.erzeuge(EnumSpielzeugArt.barbie);
		spz.spielen();
		Spielzeug spz1 = fm.erzeuge(EnumSpielzeugArt.brummkreisel);
		spz1.spielen();
		Spielzeug spz2 = fm.erzeuge(EnumSpielzeugArt.pistole);
		spz2.spielen();
		
	
		
	}

}
