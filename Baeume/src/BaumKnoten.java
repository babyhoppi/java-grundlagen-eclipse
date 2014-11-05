/**
 * @Author Marco Hoppe
 */
public class BaumKnoten {

	public int daten;
	public BaumKnoten links;
	public BaumKnoten rechts;

	// einfacher Konstruktor
	public BaumKnoten(int n) {
		daten = n;
		// hat noch keinen linken oder rechten Partner
		links = null;
		rechts = null;
	}

	// Konstruktor mit Zielen
	public BaumKnoten(int n, BaumKnoten l, BaumKnoten r) {
		daten = n;
		links = l;
		rechts = r;
	}
}
