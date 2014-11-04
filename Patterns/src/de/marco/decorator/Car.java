/**
 * 
 */
package de.marco.decorator;

import javax.management.loading.PrivateClassLoader;

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

	/* (non-Javadoc)
	 * @see de.marco.decorator.Vehicle#startEngine()
	 */
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see de.marco.decorator.Vehicle#stopEngine()
	 */
	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see de.marco.decorator.Vehicle#moveForward(int)
	 */
	@Override
	public void moveForward(int miles) {
		this.mileage += miles;

	}

	/* (non-Javadoc)
	 * @see de.marco.decorator.Vehicle#getMileage()
	 */
	@Override
	public int getMileage() {
		return this.mileage;
	}

	/* (non-Javadoc)
	 * @see de.marco.decorator.Vehicle#getDailyRate(int)
	 */
	@Override
	public int getDailyRate(int days) {
		//Tagesmiete für das Car-Objekt bei mehr als 7 Tagen...
		int rate = 50;
		
		
		// ... bei weniger als 7 Tgaen wird es teurer
		if(days <= 7) {
			rate = 65;
		}
		return rate;
	}

	@Override
	public String getManufacturer() {
		// TODO Auto-generated method stub
		return this.manufacturer;
	}

	/* (non-Javadoc)
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

}
