package de.marco.patterns.abstrakefabrik;

public class HtmlCell extends Cell {

	/**
	 * der Konstruktor der Klasse reicht den Wert f�r den Zellinhalt direkt an
	 * den Konstruktor der Cell-Klasse weiter
	 * 
	 * @param c
	 */
	public HtmlCell(String c) {
		super(c);
	}

	@Override
	public void display() {
		System.out.println("\t\t<td>" + this.content + "</td>");
	}

}
