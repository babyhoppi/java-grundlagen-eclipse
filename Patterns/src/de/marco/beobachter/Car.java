/**
 * 
 */
package de.marco.beobachter;

import java.util.Set;
import java.util.TreeSet;


/**
 * @Author Marco Hoppe
 */
public class Car implements Vehicle, Observable {
	
	private String manufacturer = "";
	private String color = "";
	
	private int maxSpeed = 0;
	
	private int mileage = 0;
	
	/**
	 * Wir ben�tigen eine Struktur, um m�gliche Observer zu verwalten.
	 */
	
	Set<Observer> stalker = new TreeSet<>();

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
		//Tagesmiete f�r das Car-Objekt bei mehr als 7 Tagen...
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
	 * Die Methoden liefert die H�chstgeschwindigkeit zu einem AUto.
	 * 
	 * Diese Methode soll als Beispiel f�r den Dekorierer dienen.
	 * 
	 * @return H�chstgeschwindigkeit
	 */
	@Override
	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		return this.maxSpeed;
	}

	
	
	/* Die Methoden des Inteface Observable*/
	
	@Override
	public void attach(Observer o) {
		if( null == o){
			return;
		}
		// f�ge den Observer zur Menge der Beobachter hinzu
		this.stalker.add(o);
	}

	@Override
	public void detach(Observer o) {
		if( null == o){
			return;
		}
		// l�scht den Observer aus der  Menge der Beobachter
		this.stalker.remove(o);
	}

	@Override
	public void inform() {
		//informiere alle Beobachter, dass sich der Zustand des Objektes ge�ndert hat
		for( Observer o: this.stalker) {
			o.update(this);
		}
	}

}
