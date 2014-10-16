package de.marco;

import java.util.ArrayList;
import java.util.List;

public class AusgebenUndSpeichern extends Car {
	List<Car> tmp;
	// - 20 Autos in einer ArryList speichern
	public void erzeugen() {
		List<Car> carListe = new ArrayList<>();
		tmp = carListe;
		for(int i = 0; i < 20; i++){
			int kmStand = (int)(Math.random()*100);
			carListe.add(new Car(kmStand));
		}	
	}
	
	// - alle Autos der Liste ausgeben a) Screen b) Datei
	public void ausgebenAufScreen() {
		for(Car element:tmp){
			System.out.println(element.kmStand);
		}
	}
}
