/**
 * 
 */
package de.marco.beobachter;

/**
 * @Author Marco Hoppe
 */
public interface Observable {
	
	/**
	 * Beobachter k�nnen sich registrieren.
	 * 
	 * @param o
	 */
	public void attach(Observer o);
	/**
	 * Beobachter k�nnen sich abmelden.
	 * 
	 * @param o
	 */
	public void detach(Observer o);
	/**
	 * Beobachter m�ssen informiert werden.
	 * 
	 * @param o
	 */
	public void inform();

}
