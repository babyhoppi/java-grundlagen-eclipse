/**
 * @Author Marco Hoppe
 */
public class BinaereBaeume {

	public BaumKnoten wurzel;

	public BinaereBaeume() {
		// Konstruktor erzeugt leeren Baum
		wurzel = null;
	}

	public void einf�gen(BaumKnoten neu) {
		// f�gt Knoten neu an die richtige Stelle ein

		// 1. Fall: Baum ist noch leer
		if (wurzel == null) {
			wurzel = neu;
		} else {
			// sonst rekursiv durch
			einf�gen(wurzel, neu);
		}
	}

	private void einf�gen(BaumKnoten spitze, BaumKnoten neu) {
		// f�gt Knoten neu an die richtige Stelle unter Teilbaum spitze ein

		if (spitze.daten > neu.daten) {
			// links einf�gen
			if (spitze.links == null) {
				// neu einfach anh�ngen
				spitze.links = neu;
			} else {
				// neu im linken Unterbaum unterbringen
				einf�gen(spitze.links, neu);
			}
		} else {
			// rechts einf�gen
			if (spitze.rechts == null) {
				// neu einfach anh�ngen
				spitze.rechts = neu;
			} else {
				// neu im rechten Unterbaum unterbringen
				einf�gen(spitze.rechts, neu);
			}
		}
	}

	public String toString() {
		if (wurzel != null) {
			return toString(wurzel);
		} else {
			return "<leerer Baum>";
		}
	}

	private String toString(BaumKnoten b) {
		String s = "";

		if (b.links != null) {
			s += toString(b.links);
		}
		s += b.daten + "\n";
		if (b.rechts != null) {
			s += toString(b.rechts);
		}
		return s;
	}
}
