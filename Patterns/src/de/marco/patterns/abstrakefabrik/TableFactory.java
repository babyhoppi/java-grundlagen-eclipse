package de.marco.patterns.abstrakefabrik;

public abstract class TableFactory { // kann aber auch ein Interface sein

	// hier werden die Erzeugungsmethoden für die Objekte der Objektfamilien
	// deklariert

	// eine Methode zum Erzeugen von Tabellen
	public abstract Table createTable();

	// eine Methode zum Erzeugen von Zeilen
	public abstract Row createRow();

	// eine Methode zum Erzeugen von Zellen
	public abstract Cell createCell(String c);
}
