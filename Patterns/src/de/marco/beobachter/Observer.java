/**
 * 
 */
package de.marco.beobachter;

/**
 * @Author Marco Hoppe
 */
public interface Observer {

	/**
	 * Beobachter müssen informiert werden können von dem beobachteteb Objekt
	 * 
	 * @param o
	 */
	public void update(Observable o);
}
