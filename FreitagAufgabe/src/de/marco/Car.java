package de.marco;

public class Car implements Vehicle {
	
	//TODO equals(), hashCode() und toString() in Class Car implementieren
	
	
	protected int kmStand, km;


	public Car() {	}
	
	public Car(int kmStand) {
		this.kmStand = kmStand;
	}

	public Car(int kmStand, int km) {
		this.kmStand 	= 	kmStand;
		this.km			=	km;
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
	public void move(int km) {
		// TODO Auto-generated method stub
		this.km = km;
	}

}
