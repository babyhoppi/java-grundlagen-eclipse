/**
 * 
 */
package de.marco.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author Marco Hoppe
 */
public class Car implements Vehicle {

	private String manufacturer = "";
	private String color = "";

	private int maxSpeed = 0;

	private int mileage = 0;

		/**
	 * Der Konstructor
	 */
	public Car(String m, String c, int s) {
		this.manufacturer = m;
		this.color = c;
		this.maxSpeed = s;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub

	}

	/**
	 * Beim Aufrur der Methode bewegt sich das Fahrzeug
	 * 
	 * Die Beobachter werden über die Änderung des Kilometerstandes informiert.
	 */
	@Override
	public void moveForward(int miles) {
		this.mileage += miles;
	}

	@Override
	public int getMileage() {
		return this.mileage;
	}

	@Override
	public int getDailyRate(int days) {
		// Tagesmiete für das Car-Objekt bei mehr als 7 Tagen...
		int rate = 50;

		// ... bei weniger als 7 Tgaen wird es teurer
		if (days <= 7) {
			rate = 65;
		}
		return rate;
	}

	@Override
	public String getManufacturer() {
		// TODO Auto-generated method stub
		return this.manufacturer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.marco.decorator.Vehicle#getColor()
	 */
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	/**
	 * Die Methoden liefert die Höchstgeschwindigkeit zu einem AUto.
	 * 
	 * Diese Methode soll als Beispiel für den Dekorierer dienen.
	 * 
	 * @return Höchstgeschwindigkeit
	 */
	@Override
	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		return this.maxSpeed;
	}
	
	public String toString() {
		return this.manufacturer + ","+ this.color + ","+this.maxSpeed;
	}
}
