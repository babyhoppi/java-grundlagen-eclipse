package de.marco;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> carListe = new ArrayList<>();
		for(int i = 0; i < 20; i++){
			int kmStand = (int)(Math.random()*100);
			carListe.add(new Car(kmStand));
		}	
		//for(Car element:carListe){
		//	System.out.println(element.kmStand + " 2 Eintrag: " + element.distance);
		//}
		
		System.out.println(carListe.get(3).kmStand);
		System.out.println(carListe.get(3).statusEngine);
		
		carListe.get(3).startEngine(2000);
		carListe.get(3).move(5000);
		//carListe.get(3).stopEngine();
		
		System.out.println(carListe.get(3).kmStand);
		System.out.println(carListe.get(3).statusEngine);
	}
}
