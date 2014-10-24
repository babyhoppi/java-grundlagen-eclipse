package de.marco.patterns.abstrakefabrik;

public class TextTable extends Table {

	/**
	 * der Konstruktor der Klasse reicht den Wert für den Zellinhalt direkt an
	 * den Konstruktor der Cell-Klasse weiter
	 * 
	 * @param c
	 */

	@Override
	public void display() {

		// die Startmarkierung einer HTML-Zeile ausgeben
		//System.out.println("");
		//System.out.println("ID\t\t\tName");
		System.out.println("");

		for (Row r : this.rows) {
			r.display();
		}

		// die Endmakierung einer HTML-Zeile ausgeben
		System.out.println("");
	}

}
