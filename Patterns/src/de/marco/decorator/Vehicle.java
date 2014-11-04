/**
 * 
 */
package de.marco.decorator;

/**
 * @Author Marco Hoppe
 */
public interface Vehicle {
	
	public void startEngine();
	public void stopEngine();
	public void moveForward(int miles);
	public int getMileage();
	public int getDailyRate(int days);
	public String getManufacturer();
	public String getColor();
	public int getMaxSpeed();

}
