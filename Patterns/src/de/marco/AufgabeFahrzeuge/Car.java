/**
 * 
 */
package de.marco.AufgabeFahrzeuge;

/**
 * @Author Marco Hoppe
 */
public class Car implements Vehicle {

	private String manufacturer = "";
	private String color = "";

	private int maxSpeed = 0;

	private int ps = 0;

		/**
	 * Der Konstructor
	 */
	public Car(String m, String c,int p, int s) {
		this.manufacturer = m;
		this.color = c;
		this.maxSpeed = s;
		this.ps = p;
	}

	@Override
	public String getManufacturer() {
		return this.manufacturer;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	/**
	 * Die Methoden liefert die Höchstgeschwindigkeit zu einem AUto.
	 * 
	 * @return Höchstgeschwindigkeit
	 */
	@Override
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	@Override
	public int getPs() {
		return this.ps;
	}
	
	public String toString() {
		return this.manufacturer + ","+ this.color+ ","+this.ps + ","+this.maxSpeed;
	}	
}
