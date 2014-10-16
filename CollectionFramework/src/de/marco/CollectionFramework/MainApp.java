/**
 * 
 */
package de.marco.CollectionFramework;

import java.util.List;
import java.util.ArrayList;

/**
 * @Author Marco Hoppe
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intListe = new ArrayList<>();
		
		for(int i=0; i<20;i++){
			intListe.add((int)(Math.random()*100));
		}
		
		// in einer Art foreach-Schleife wollen wir die Listenelemente ausgeben
		for(Integer element: intListe) {
			System.out.println(element);
		}
		
		// Prüfen, ob die Liste leer ist
		System.out.println("Die Liste ist leer: " + intListe.isEmpty());
		
		// Prüfen, ob ein Wert in der Liste leer ist
				System.out.println("Die Liste enthält den Wert 10: " + intListe.contains(10));
		// Die Größe der Liste ausgeben
				System.out.println("Die Liste hat " + intListe.size() + " Elemente");
		// Das erste Element der Liste entfernen
				intListe.remove(0);
				System.out.println("Die Liste hat " + intListe.size() + " Elemente");
		// eine Teilliste extrahieren
				List<Integer> subList	= intListe.subList(0, 5);
				for(Integer element: subList){
					System.out.println(element);					
				}
				
	}

}
