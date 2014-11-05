/**
 * 
 */
package de.marco.beobachter;

/**
 * @Author Marco Hoppe
 */
public interface Observer {

	/**
	 * Beobachter m�ssen informiert werden k�nnen von dem beobachteteb Objekt
	 * 
	 * @param o
	 */
	public void update(Observable o);
}
