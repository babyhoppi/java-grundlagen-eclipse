package de.marco.iterator;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Wir testen unsere MyIterator
		 */
		
		CarListJava cl = new CarListJava();
		cl.hinzufuegen(new Car("BMW", "rot", 300));
		cl.hinzufuegen(new Car("VW", "gruen", 220));
		cl.hinzufuegen(new Car("Mercedes", "blau", 240));
		cl.hinzufuegen(new Car("Audi", "lila", 230));
		cl.hinzufuegen(new Car("Mazda", "orange", 220));
		cl.hinzufuegen(new Car("Trabant", "pink", 120));
		cl.hinzufuegen(new Car("Toyota", "rosa", 180));
		
		// wir testen die eigentliche Iterator-Funktionalität
		
		while(cl.hasNext()) {
			// wir geben das aktuelle Element aus
			System.out.println(cl.next());						
		}
	}

}
