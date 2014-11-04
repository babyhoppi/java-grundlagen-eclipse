package de.marco.adapterPattern;

public class MainApp {

	public static void main(String[] args) {
		/**
		 * Test unseres Doekorier-Musters
		 * 
		 */
		
		Automobile bmw = new Automobile("BMW", "schwarz",0, 250);
		Vehicle car = new Adapter(bmw);
		
		// Die Daten für das Auto ausgeben, falls es 8 Tage gemietet wird
		System.out.println("autoA: " + car.getColor() + ", " 
		+ car.getMaxSpeed() + " km/h, " + car.getManufacturer()+ " ," + car.getMileage());
		
		System.out.println(bmw.getFarbe());
		
	}

}
