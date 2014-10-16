/**
 * 
 */
package de.marco.java.ausnahmen;

/**
 * @Author Marco Hoppe
 */
public class NoDataFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4049118239326032276L;

	/**
	 * @param message
	 */
	public NoDataFoundException(String message) {
		super(message);
	}
}
