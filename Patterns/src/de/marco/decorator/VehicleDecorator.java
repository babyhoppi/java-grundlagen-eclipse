package de.marco.decorator;

public abstract class VehicleDecorator implements Vehicle {

	
	//der Dekorierer kann entweder ein Car-Objekt oder ein anderes Dekorierer-Objekt referenzieren
	protected Vehicle vehicle = null;
	
	/**
	 * Der Konstructor bekommt als Parameter das zu dekorierende Objekt übergeben
	 * 
	 * @param v etwas, das sie wie ein Vehicle verhält
	 */
	
	public VehicleDecorator(Vehicle v) {
		this.vehicle = v;
	}

	/** 
	 * Die Methode dekoriert nicht, sondern reicht den Aufruf direkt an das dekorierente Objekt weiter
	 */
	@Override
	public void startEngine() {
		this.vehicle.startEngine();
	}

	/** 
	 * Die Methode dekoriert nicht, sondern reicht den Aufruf direkt an das dekorierente Objekt weiter
	 */
	@Override
	public void stopEngine() {
		this.vehicle.stopEngine();
	}

	/** 
	 * Die Methode dekoriert nicht, sondern reicht den Aufruf direkt an das dekorierente Objekt weiter
	 */
	@Override
	public void moveForward(int miles) {
		this.vehicle.moveForward(miles);
	}

	/** 
	 * Die Methode dekoriert nicht, sondern reicht den Aufruf direkt an das dekorierente Objekt weiter
	 */
	@Override
	public int getMileage() {
		return this.vehicle.getMileage();
	}

	/** 
	 * Die Methode dekoriert nicht, sondern reicht den Aufruf direkt an das dekorierente Objekt weiter
	 */
	@Override
	public int getDailyRate(int days) {
		return this.vehicle.getDailyRate(days);
	}

	/** 
	 * Die Methode dekoriert nicht, sondern reicht den Aufruf direkt an das dekorierente Objekt weiter
	 */
	@Override
	public String getManufacturer() {
		return this.vehicle.getManufacturer();
	}

	/** 
	 * Die Methode dekoriert nicht, sondern reicht den Aufruf direkt an das dekorierente Objekt weiter
	 */
	@Override
	public String getColor() {
		return this.vehicle.getColor();
	}

	/** 
	 * Die Methode dekoriert nicht, sondern reicht den Aufruf direkt an das dekorierente Objekt weiter
	 */
	@Override
	public int getMaxSpeed() {
		return this.vehicle.getMaxSpeed();
	}

}
