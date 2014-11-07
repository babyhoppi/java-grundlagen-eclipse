/**
 * 
 */
package de.marco.iterator;

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

	// wir benoetigen eine Positionsvariable
	private int position = 0;

	/**
	 * @param split
	 */
	public CarListJava(String[] split) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasNext() {
		if(position < this.carList.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Car next() {
		if(hasNext()) {
			return this.carList.get(position++);			
		}
		return null;
	}
	// Autos der Liste hinzufuegen
		public void hinzufuegen(Car c) {
			this.carList.add(c);
		}

}
