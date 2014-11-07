/**
 * 
 */
package de.marco.iterator;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author Marco Hoppe
 */
public class CarList implements MyIterator<Car> {

	// wir brauchen eine Datenstruktur, die in der Lage ist, mehrere Autos
	// in Form einer Liste zu verwalten
	private List<Car> carList = new LinkedList<>();

	// wir benoetigen eine Positionsvariable
	private int position = 0;

	// Autos der Liste hinzufuegen
	public void hinzufuegen(Car c) {
		this.carList.add(c);
	}

	// Autos von der Liste loeschen
	public void loeschen(Car c) {
		this.carList.remove(c);
	}

	// -----------Klassen des Interface MyIterator
	/**
	 * Liefert das aktuelle Element aus dem Iterator
	 * 
	 * @return
	 */
	@Override
	public Car getCurrent() {
		return this.carList.get(position);
	}

	/**
	 * Setzt den internen Positionszeiger auf die nächste Position
	 */
	@Override
	public void next() {

		// holt aus der Liste das Auto von der angegebenen Position
		this.position++;

	}

	/**
	 * Spuhlt den Iterator zurueck
	 */
	@Override
	public void rewind() {
		this.position = 0;

	}
	/**
	 * Prüft, ob der Positionszeiger in den gülitigen Grenzen liegt.
	 */
	@Override
	public boolean valid() {
		if (this.position < this.carList.size()) {
			return true;
		}
		return false;
	}
	
}
