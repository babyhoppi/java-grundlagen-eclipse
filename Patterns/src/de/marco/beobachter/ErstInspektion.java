/**
 * 
 */
package de.marco.beobachter;

/**
 * @Author Marco Hoppe
 */
public class ErstInspektion implements Observer {

	@Override
	public void update(Observable o) {
		if (((Car) o).getMileage() >= 1000) {
			System.out.println("Erstinspektion");

			// nach erfolgter Erstinspektion das Auto nicht weiter beobachten
			o.detach(this);
		}
	}
}
