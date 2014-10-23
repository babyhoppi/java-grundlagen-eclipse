package de.marco.patterns.abstrakefabrik;

import java.util.ArrayList;
import java.util.List;

public abstract class Table {

	/*
	 * eine Datenstruktur, die die beliebig vielen Zeilen einer Tabelle
	 * speichert
	 */
	protected List<Row> rows = new ArrayList<>();

	/*
	 * die Methode fügt eine Tabellenzeile zur Tabelle hinzu
	 * 
	 * @param r die hinzuzufügende Zeile
	 */
	public void addRow(Row r) {
		this.rows.add(r);
	}

	public abstract void display();
}
