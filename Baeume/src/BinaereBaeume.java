/**
 * @Author Marco Hoppe
 */
public class BinaereBaeume {

	public BaumKnoten wurzel;

	public BinaereBaeume() {
		// Konstruktor erzeugt leeren Baum
		wurzel = null;
	}

	public void einfügen(BaumKnoten neu) {
		// fügt Knoten neu an die richtige Stelle ein

		// 1. Fall: Baum ist noch leer
		if (wurzel == null) {
			wurzel = neu;
		} else {
			// sonst rekursiv durch
			einfügen(wurzel, neu);
		}
	}

	private void einfügen(BaumKnoten spitze, BaumKnoten neu) {
		// fügt Knoten neu an die richtige Stelle unter Teilbaum spitze ein

		if (spitze.daten > neu.daten) {
			// links einfügen
			if (spitze.links == null) {
				// neu einfach anhängen
				spitze.links = neu;
			} else {
				// neu im linken Unterbaum unterbringen
				einfügen(spitze.links, neu);
			}
		} else {
			// rechts einfügen
			if (spitze.rechts == null) {
				// neu einfach anhängen
				spitze.rechts = neu;
			} else {
				// neu im rechten Unterbaum unterbringen
				einfügen(spitze.rechts, neu);
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
