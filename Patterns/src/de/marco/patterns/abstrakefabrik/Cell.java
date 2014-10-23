package de.marco.patterns.abstrakefabrik;

import java.util.ArrayList;
import java.util.List;

public abstract class Cell {

	/*
	 * eine Datenstruktur, die die beliebig vielen Zeilen einer Tabelle speichert
	 */
	protected String content  = "";

	/*
	 * der Konstruktor der Klasse wird mit Parameter aufgerufen
	 * 
	 * @param c 
	 */
	public Cell (String c) {
		this.content = c;
	}


	public abstract void display();
}
