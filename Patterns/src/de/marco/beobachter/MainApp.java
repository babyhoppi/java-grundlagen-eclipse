/**
 * 
 */
package de.marco.beobachter;

/**
 * @Author Marco Hoppe
 */
public class MainApp {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car auto = new Car("BMW", "rot", 250);
		
		auto.attach(new ErstInspektion());
		auto.attach(new IntervallInspektion(3500, 2500));
		auto.moveForward(1200);
		auto.moveForward(6801);

	}

}
