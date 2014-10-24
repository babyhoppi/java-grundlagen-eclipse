package de.marco.patterns.abstrakefabrik;

public class TextCell extends Cell {

	/**
	 * der Konstruktor der Klasse reicht den Wert für den Zellinhalt direkt an
	 * den Konstruktor der Cell-Klasse weiter
	 * 
	 * @param c
	 */
	public TextCell(String c) {
		super(c);
	}

	@Override
	public void display() {

		System.out.print(" " + this.content);
		System.out.print(zeichneRahmen() + "|");
	}

	public String zeichneRahmen() {
		int x = 13 - this.content.length();
		String laenge = "";

		for (int i = 0; i < x; i++) {
			laenge = laenge + " ";
		}
		return laenge;

	}

}
