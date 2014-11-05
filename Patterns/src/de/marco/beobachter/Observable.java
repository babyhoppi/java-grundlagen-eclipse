/**
 * 
 */
package de.marco.beobachter;

/**
 * @Author Marco Hoppe
 */
public interface Observable {
	
	/**
	 * Beobachter können sich registrieren.
	 * 
	 * @param o
	 */
	public void attach(Observer o);
	/**
	 * Beobachter können sich abmelden.
	 * 
	 * @param o
	 */
	public void detach(Observer o);
	/**
	 * Beobachter müssen informiert werden.
	 * 
	 * @param o
	 */
	public void inform();

}
