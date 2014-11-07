/**
 * 
 */
package de.marco.beobachter;

/**
 * @Author Marco Hoppe
 */
public class IntervallInspektion implements Observer {

	private int nextInspectionAt;
	private int intervall;
	
	
	
	/**
	 * Wir geben an, wann die erste Intervallinspektion fällig ist und 
	 * anschließend: in welchen km_Intervall wiederkehrend die Inspektion erfolgen soll.
	 * 
	 * @param nextInspectionAt
	 * @param intervall
	 */
	public IntervallInspektion(int nextInspectionAt, int intervall) {

		this.nextInspectionAt = nextInspectionAt;
		this.intervall = intervall;
	}

	@Override
	public void update(Observable o) {
		if (((Car) o).getMileage() % 2500 == 0) {
			System.out.println("IntervallInspektionTESTTTTT");
		}
		
		if (((Car) o).getMileage() >= this.nextInspectionAt) {
			System.out.println("IntervallInspektion bei: " + this.nextInspectionAt + " km");
			this.nextInspectionAt +=intervall;
		}

	}

}
