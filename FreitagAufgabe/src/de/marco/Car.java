package src.de.marco;

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
	public void move(boolean statusEngine) {
		int Min = 0;
		int Max = 100;
		
		if(statusEngine){
		this.kmStand += Min + (int)(Math.random() * ((Max - Min) + 1));
		}
	}

	
	@Override
	public void move(int distance) {
		if(this.statusEngine){
		this.kmStand += distance;
		}
	}
	
	@Override
	public void move(int distance,boolean statusEngine) {
		if(statusEngine){
		this.kmStand += distance;
		}
	}
}
