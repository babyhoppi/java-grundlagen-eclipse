package de.marco;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.imageio.IIOException;

public class MainApp {

	public static void main(String[] args) throws ExceptionKlasse {
		
		/*
		 * Angabe von KfZ-Daten
		 */
		int kfzEintrag = 19;			// welches Auto aus der Liste soll fahren
		int gewuenschteDistance =500;	// welche Distance soll das Auto zuruecklegen
		boolean statusEngine = true;	// ist der Motor an oder aus
		int ausgabeFormat = 4; 			// Für Screen die 1 eingeben. Für Datei die 2 und für 
										// beides die 3 bei der 4 erhalten sie Die komplette Liste
		int anzahlDerFahrten = 5;

		// Es wird eine Liste vom Typ Car erstellt mit x Einträge
		List<Car> carListe = new ArrayList<>();
		int Min = 0;
		int Max = 100;
		for(int i = 0; i < 20; i++){
			int kmStand = Min + (int)(Math.random() * ((Max - Min) + 1));
			carListe.add(new Car(kmStand));
		}	
				
		if(ausgabeFormat >0){
			System.out.println("Wieviele Fahrten soll das Fahrzeug machen?");
			Scanner eingabeFahrten = new Scanner(System.in);
			try {
				anzahlDerFahrten = eingabeFahrten.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Sie haben keine Zahl eingegeben! Es wird eine Fahrt angenommen.");
				anzahlDerFahrten = 1;
			}
			
			while (anzahlDerFahrten > 0){
				System.out.println("Welche Distance soll das Fahrzeug zurücklegen?");
				Scanner eingabe = new Scanner(System.in);
				try{
					gewuenschteDistance = eingabe.nextInt();
					carListe.get(kfzEintrag).move(gewuenschteDistance,statusEngine);
					AusgebenUndSpeichern.ausgebenAufScreen(ausgabeFormat, carListe, carListe.get(kfzEintrag));
					anzahlDerFahrten--; 
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Sie haben keine Zahl eingegeben! Es wird eine Fahrt von 0 Kilometer angenommen.");
					anzahlDerFahrten--;
					if(anzahlDerFahrten==0){
						System.out.println("Wieviele Fahrten soll das Fahrzeug machen?");
					}
				}
				
			}
		}else{
				carListe.get(kfzEintrag).move(gewuenschteDistance,statusEngine);
				AusgebenUndSpeichern.ausgebenAufScreen(ausgabeFormat, carListe, carListe.get(kfzEintrag));
			}System.out.println("Das Programm endet hier!!!!!");
	}
	
	
}
