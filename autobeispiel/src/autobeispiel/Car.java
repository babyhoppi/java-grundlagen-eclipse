/**
 * 
 */
package autobeispiel;

import java.util.Comparator;
import java.util.PrimitiveIterator;

/**
 * @Author Marco Hoppe
 */
public class Car implements Vehicle, Comparator<Car>,Comparable<Car> {
	private boolean engineStatus;
	private int milage;

	public Car() {
		this.engineStatus = false;
		this.milage = 0;
	}

	public Car(boolean engineStatus, int milage) {
		this.engineStatus = engineStatus;
		this.milage = milage;
	}

	@Override
	public void startEngine() {
		this.engineStatus = true;
	}

	@Override
	public void stopEngine() {
		this.engineStatus = false;
	}

	@Override
	public void move(int distance) {
		// Motor wird gestartet falls dieser noch nicht läuft
		if (!this.engineStatus) {
			this.engineStatus = true;
		}
		// ungültige Werte abfangen
		if (distance < 0) {
			// throw new FerrisMachtBlauException("so nicht!");
		}
		this.milage += distance;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + this.milage;
	}

	@Override
	public boolean equals(Object obj) {
		// Reflexibität
		if (this == obj) {
			return true;
		}
		// mit NICHTS verglichen muss immer FALSE ergeben
		if (obj == null) {
			return false;
		}
		// Prüfen auf Vergleichbarkeit (wir vergleichen nur Objekte einer Klasse
		// miteinander)
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		// --- prüfen aller Attribute auf Gleichheit
		if (this.milage != ((Car) obj).milage) {
			return false;
		}
		// --- prüfen aller Attribute auf Gleichheit
		if (this.engineStatus != ((Car) obj).engineStatus) {
			return false;
		}
		// nach dem Test aller Attribute steht die Gleichheit fest
		return true;
	}

	@Override
	public int hashCode() {
		// int Werte direkt verarbeiten
		int result = 37 * 19 + ((this.engineStatus) ? 1:0);
		result = 37 * 19 + this.milage;
		// ggfs. negative Zahlen ausmaskieren
		return result & 0x7fffffff;
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Car c1, Car c2) {
			if(c1.milage == c2.milage) {
				return 0;
			}
			
			if(c1.milage > c2.milage) {
				return 1;
			}
			
			return -1;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Car c) {
		if(this.milage == c.milage){
		return 0;
		}
		if(this.milage > c.milage){
			return 1;
		}
		return -1;
	}
}
