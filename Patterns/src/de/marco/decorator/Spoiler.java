package de.marco.decorator;

public class Spoiler extends VehicleDecorator {

	/**
	 * Ein Spoiler muss an ein Car-Objekt oder an ein Dekorierer-Objekt
	 * 
	 * @param v
	 */
	public Spoiler(Vehicle v) {
		super(v);
	}
	
	/**
	 * Ein Spoiler lässt das Auto um 15km/h schneller fahren.
	 * 
	 * return
	 */
	@Override
	public int getMaxSpeed() {
		return this.vehicle.getMaxSpeed() + 15;
	}
	
	/**
	 * Ein Auto kostet in der Vermietung 10 Euro mehr am Tag.
	 * 
	 * @param days
	 * return neue Rate mit einmalig 10 Euro Aufschlag
	 */
	@Override
	public int getDailyRate(int days) {
		return this.vehicle.getDailyRate(days) + 10;
	}
	

}
