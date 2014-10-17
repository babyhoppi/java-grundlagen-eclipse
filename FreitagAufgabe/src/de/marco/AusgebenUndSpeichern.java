package de.marco;

import java.util.ArrayList;
import java.util.List;

public class AusgebenUndSpeichern {	

	/**
	 * @param ausgabeFormat
	 * @param carListe
	 * 
	 * alle Autos der Liste ausgeben a) Screen b) Datei
	 */
	public static void ausgebenAufScreen(int ausgabeFormat, List<Car> carListe, Car car) {
		// TODO Auto-generated method stub
		try {
			switch (ausgabeFormat) {
				default:
				case 0:
					System.out.println("Es wurde keine Auswahl getroffen.");
					break;
				case 1:
						System.out.println(car.getClass().getName());
						System.out.println(car.kmStand);
					break;
				case 2:
					break;
				case 3:
					System.out.println(car.getClass().getName());
					
					break;
				case 4:
					for(Car element:carListe){
						System.out.println(element.kmStand);
					}
					break;
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
