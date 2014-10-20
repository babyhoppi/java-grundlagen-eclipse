/**
 * 
 */
package autobeispiel;

/**
 * @Author Marco Hoppe
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class AutoBeispielComperator {
	
	public static void main(String[] args) {
		HoppeCar steini = new HoppeCar(0,0);
		System.out.println(steini);
		
		HoppeCar steve = new HoppeCar(0,0);
		System.out.println(steve);
		System.out.println("JETZT TreeSet nach Kilometerstand");
		//das erste TreeSet wird nach dem Kilometerstand sortiert
		TreeSet<HoppeCar> thcMileage = new TreeSet<>(new MileageComperator());
		for(int i=0;i<20;i++){
			thcMileage.add(new HoppeCar(i+20, i+10));
		}
		for (HoppeCar hc : thcMileage){
			System.out.println(hc);
		}
		
		System.out.println("JETZT ABSTEIGEND");
		//...wie sieht es denn mit umgekehrter Reihenfolge aus?
		Iterator<HoppeCar> itHc = thcMileage.descendingIterator();
		
		//wir lassen vom ersten bis zum letzten Element durch den "Iterator" iterieren
		while(itHc.hasNext()){
			System.out.println(itHc.next());
			
		}
		
		System.out.println("JETZT TreeSet nach Motorleistung");
		//das zweite TreeSet wird nach der Motorleistung sortiert
		TreeSet<HoppeCar> thcHorsepower = new TreeSet<>(new HorsePowerComperator());
		for(int i=0;i<20;i++){
			thcHorsepower.add(new HoppeCar(i+20, i+40));
		}
		for (HoppeCar hp : thcHorsepower){
			System.out.println(hp);
		}
		
		System.out.println("JETZT ABSTEIGEND");
		//...wie sieht es denn mit umgekehrter Reihenfolge aus?
		Iterator<HoppeCar> itHp = thcMileage.descendingIterator();
		
		//wir lassen vom ersten bis zum letzten Element durch den "Iterator" iterieren
		while(itHp.hasNext()){
			System.out.println(itHp.next());
			
		}
	}
}
