package de.marco.patterns.fabrikmethodedeAufgabeSpielzeug;

public class MainApp {
	
		private int brummbaer = 1;
		private int brummkreisel = 2;
		private int barbie = 3;
		private int pistole = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Allternativ kann das Fabrikmuster durch die Fabrikmethode ersetzt werden
		Fabrikmethode fm = new Fabrikmethode();
		Spielzeug spz = fm.erzeuge(2);
		spz.spielen();
		
	
		
	}

}
