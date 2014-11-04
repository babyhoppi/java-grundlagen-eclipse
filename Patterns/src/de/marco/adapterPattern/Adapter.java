/**
 * 
 */
package de.marco.adapterPattern;

/**
 * @Author Marco Hoppe
 */
public class Adapter implements Vehicle {

	protected Automobile automobile;
	
	public Adapter(Automobile automobile) {
		this.automobile = automobile;
	}

	@Override
	public int getMileage() {
		return this.automobile.getKilometerstand();
	}

	@Override
	public String getManufacturer() {
		return this.automobile.getHersteller();
	}

	@Override
	public String getColor() {
		return this.automobile.getFarbe();
	}

	@Override
	public int getMaxSpeed() {
		return this.automobile.getHoechstGeschwindigkeit();
	}

}
