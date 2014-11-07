package de.marco.iterator;

/**
 * @Author Marco Hoppe
 */
public interface MyIterator<E> {

	public E getCurrent();
	
	public void next();
	
	public void rewind();
	
	public boolean valid();
}
