/**
 * 
 */
package de.marco.iterable;

import java.util.Iterator;

/**
 * @Author Marco Hoppe
 */
public class Menge implements Iterable<Integer> {

	private int[] werte = {1,2,5,7,9,10};

	@Override
	public Iterator<Integer> iterator() {
		return new MengenIterator(werte);
	}
	

}
