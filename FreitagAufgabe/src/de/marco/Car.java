package de.marco;

public class Car implements Vehicle {
	
	//TODO equals(), hashCode() und toString() in Class Car implementieren
	
	
	protected int kmStand, distance;
	protected boolean statusEngine = false;


	public Car() {	}
	
	public Car(int kmStand) {
		this.kmStand = kmStand;
	}
	
	public Car(int kmStand, int distance) {
		this.kmStand 	= 	kmStand;
		this.distance	=	distance;
	}

	public Car(int kmStand, int distance, boolean statusEngine) {
		this.kmStand 	= 	kmStand;
		this.distance	=	distance;
		this.statusEngine = statusEngine;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		this.statusEngine = true;
	}
	
	@Override
	public void startEngine(int distance) {
		// TODO Auto-generated method stub
		this.statusEngine = true;
		this.move(distance);	
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		this.statusEngine = false;
		
	}

	@Override
	public void move(int distance) {
		// TODO Auto-generated method stub
		//this.distance = distance;
		this.kmStand += distance;
	}

}
