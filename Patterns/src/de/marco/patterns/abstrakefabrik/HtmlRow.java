package de.marco.patterns.abstrakefabrik;

public class HtmlRow extends Row {

	/**
	 * der Konstruktor der Klasse reicht den Wert für den Zellinhalt direkt an
	 * den Konstruktor der Cell-Klasse weiter
	 * 
	 * @param c
	 */

	@Override
	public void display() {

		// die Startmarkierung einer HTML-Zeile ausgeben
		System.out.println("\t<tr>");

		for (Cell c : this.cells) {
			c.display();
		}

		// die Endmakierung einer HTML-Zeile ausgeben
		System.out.println("\t</tr>");
	}

}
