/**
 * 
 */
package de.marco.generics;

/**
 * @Author Marco Hoppe
 */
public class EineAndereBox {

		
	/**
	 * eine generische Methode, deren Typparameter auf die Parameter 
	 * der Methode angewendet wird
	 * 
	 * Damit wird sichergestellt, dass die beiden Parameter der Methode
	 * den gleichen generischen Typ verwenden und damit die privaten 
	 * Attribute von "MeineBox" den gleichen Datentyp besitzen
	 * und vergleichbar sind.
	 * 
	 * @param <T>
	 * @param mb1
	 * @param mb2
	 * @return
	 */
	public static <T> boolean vergleiche(MeineBox<T> mb1, MeineBox<T> mb2) {
		
		return mb1.getValue().equals(mb2.getValue());
			
	}
}
