/**
 * 
 */
package de.marco.composite;

/**
 * @Author Marco Hoppe
 */
public abstract class AbstrakteKomponente {

	/**
	 * diese Methode muss in den konkreten Komponentklassen und im Kompositum �berschrieben werden
	 * 
	 * (a) in den konkreten Komponentklassen f�hrt diese zur Ausgabe
	 * (b) im Komositum f�hrt dies zur "Durchforstung" der Kindknoten
	 */
	public abstract void methodeA();

}
