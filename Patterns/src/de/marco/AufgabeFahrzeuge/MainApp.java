package de.marco.AufgabeFahrzeuge;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Wir testen unsere MyIterator
		 */

//		CarListJava cl = new CarListJava();
		CarListJava clTest = new CarListJava();

		// TODO Testeinträge
//		cl.hinzufuegen(new Car("BMW", "rot", 200, 300));
//		cl.hinzufuegen(new Car("VW", "gruen", 115, 220));
//		cl.hinzufuegen(new Car("Mercedes", "blau", 180, 240));
//		cl.hinzufuegen(new Car("Audi", "lila", 110, 230));
//		cl.hinzufuegen(new Car("Mazda", "orange", 145, 220));
//		cl.hinzufuegen(new Car("Trabant", "pink", 25, 120));
//		cl.hinzufuegen(new Car("Toyota", "rosa", 75, 180));
//
//		// wir testen die eigentliche Iterator-Funktionalität
//
//		while (cl.hasNext()) {
//			// wir geben das aktuelle Element aus
//			// System.out.println(cl.next());
//			cl.ausgebenInDatei("Hersteller.txt");
//
//		}
		clTest.einlesenAusDatei("Hersteller.txt");
		while (clTest.hasNext()) {
			System.out.println(clTest.next());
		}
	}
}
