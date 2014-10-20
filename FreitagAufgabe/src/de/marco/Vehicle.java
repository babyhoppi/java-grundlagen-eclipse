package de.marco;

public interface Vehicle {
	public void startEngine();		 	// engineStarted = true			startet das Fahrzeug
	public void startEngine(int distance);
	public void stopEngine();		 	// engineStoped  = flase		stopt das Fahrzeug	
	public void move(boolean statusEngine);					// move Methode ohne Parameter und mit zufallDistance
	public void move(int km);			// km += kmStand				bewegt das Fahrzeug
	public void move(int distance, boolean statusEngine);
	/**
	 * 
	 */
}
