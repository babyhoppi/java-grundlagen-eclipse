package de.marco.decorator;

public class MainApp {

	public static void main(String[] args) {
		/**
		 * Test unseres Doekorier-Musters
		 * 
		 */
		
		Car autoA = new Car("BMW", "schwarz", 250);
		
		// Die Daten für das Auto ausgeben, falls es 8 Tage gemietet wird
		System.out.println("autoA: " + autoA.getManufacturer() + ", " + autoA.getMaxSpeed() + " km/h, " + autoA.getDailyRate(8)+ " Euro");
		
		Spoiler prollAuto = new Spoiler(autoA);
		System.out.println("prollAuto:  " + prollAuto.getManufacturer() + ", " + prollAuto.getMaxSpeed() + " km/h, " + prollAuto.getDailyRate(8)+ " Euro");
	
		Spoiler oberProllAuto = new Spoiler(prollAuto);
		System.out.println("oberProllAuto:  " + oberProllAuto.getManufacturer() + ", " + oberProllAuto.getMaxSpeed() + " km/h, " + oberProllAuto.getDailyRate(8)+ " Euro");
	
	
		Breitreifen breitreifenAuto = new Breitreifen(oberProllAuto);
		System.out.println("breitreifenAuto:  " + breitreifenAuto.getManufacturer() + ", " + breitreifenAuto.getMaxSpeed() + " km/h, " + breitreifenAuto.getDailyRate(8)+ " Euro");
		
	}

}
