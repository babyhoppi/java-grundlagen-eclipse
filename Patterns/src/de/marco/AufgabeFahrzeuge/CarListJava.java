/**
 * 
 */
package de.marco.AufgabeFahrzeuge;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Marco Hoppe
 */
public class CarListJava implements Iterator<Car> {

	// wir brauchen eine Datenstruktur, die in der Lage ist, mehrere Autos
	// in Form einer Liste zu verwalten
	private List<Car> carList = new LinkedList<>();

	PrintWriter autoListe = null;

	// wir benoetigen eine Positionsvariable
	private int position = 0;

	@Override
	public boolean hasNext() {
		if (this.position < this.carList.size()) {
			return true;
		}
		this.position = 0;
		return false;
	}

	@Override
	public Car next() {
		if (hasNext()) {
			return this.carList.get(position++);
		}
		return null;
	}

	// Autos der Liste hinzufuegen
	public void hinzufuegen(Car c) {
		this.carList.add(c);
	}

	/**
	 * @param ausgabeDatei
	 */
	public void ausgebenInDatei(String dateiName) {

		try {
			AusgabeDatei ad = new AusgabeDatei().ausgebenInDatei(this.carList.get(position++), dateiName);
		} finally {
			if (autoListe != null) {
				autoListe.close();
			}
		}
	}
	public void einlesenAusDatei(String dateiName) {

	carList = new DateiEinlesen().dateiEinlesen(dateiName);
		
	}
}
