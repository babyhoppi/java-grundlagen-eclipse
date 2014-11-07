package de.marco.iterable;

import java.util.Iterator;

/**
 * @Author Marco Hoppe
 */
public class MengenIterator implements Iterator<Integer>{

	private int[] copy;
	
	private int position = 0;
	public MengenIterator(int [] orginal) {
		this.copy = orginal;
	}
	
	@Override
	public boolean hasNext() {
		return this.position < this.copy.length;
	}

	@Override
	public Integer next() {
		
		return this.copy[position++];
	}

}
