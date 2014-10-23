package de.marco.patterns.fabrikmethode;

public class MainApp {
	
		private int solar = 1;
		private int diesel = 2;
		private int tret = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Allternativ kann das Fabrikmuster durch die Fabrikmethode ersetzt werden
		Fabrikmethode fm = new Fabrikmethode();
		Fahrzeug fzg = fm.erzeuge(1);
		fzg.move();
		
	
		
	}

}
