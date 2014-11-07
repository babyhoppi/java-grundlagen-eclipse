/**
 * 
 */
package de.marco.beobachter;

import java.util.Comparator;

/**
 * @Author Marco Hoppe
 */
public class ObserverComperator implements Comparator<Observer>{
	
	
	/*
	 * Die Observer müssen vergleichbar sein, damit sie in dem TreeSet gespeichert werden können.
	 */
	@Override
	public int compare(Observer o1, Observer o2) {
		// TODO Auto-generated method stub
		return o1.hashCode() - o2.hashCode();
	}

}
