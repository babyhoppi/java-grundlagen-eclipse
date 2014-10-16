package de.marco;

public interface Vehicle {
	public void startEngine();		 	// engineStarted = true			startet das Fahrzeug
	public void stopEngine();		 	// engineStoped  = flase		stopt das Fahrzeug	
	public void move(int km);			// km += kmStand				bewegt das Fahrzeug
}
