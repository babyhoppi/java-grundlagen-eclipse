/**
 * 
 */
package de.marco.composite;

/**
 * @Author Marco Hoppe
 */
public abstract class AbstrakteKomponente {

	/**
	 * diese Methode muss in den konkreten Komponentklassen und im Kompositum überschrieben werden
	 * 
	 * (a) in den konkreten Komponentklassen führt diese zur Ausgabe
	 * (b) im Komositum führt dies zur "Durchforstung" der Kindknoten
	 */
	public abstract void methodeA();

}
