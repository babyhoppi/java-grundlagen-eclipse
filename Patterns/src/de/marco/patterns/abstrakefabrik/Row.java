package de.marco.patterns.abstrakefabrik;

import java.util.ArrayList;
import java.util.List;

public abstract class Row {

	protected List<Cell> cells = new ArrayList<>();

	/**
	 * eine Methode, um beliebig viele Zellen zu einer Zeiler hizuzuf�gen
	 * 
	 * @param c
	 *            die hinzuzuf�gende Zelle
	 */
	public void addCell(Cell c) {
		this.cells.add(c);
	}

	public abstract void display();
}
