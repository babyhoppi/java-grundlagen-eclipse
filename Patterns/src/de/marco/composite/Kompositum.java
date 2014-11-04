/**
 * 
 */
package de.marco.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.print.attribute.standard.RequestingUserName;

/**
 * @Author Marco Hoppe
 */
public class Kompositum extends AbstrakteKomponente {

	Map<Integer, AbstrakteKomponente> kindKnoten = null;

	public Kompositum() {
		// durch den Konstruktor wird eine leere Liste für die Kindkontoen
		// erzeugt
		this.kindKnoten = new TreeMap<>();
	}

	/**
	 * die Methode fügt neue Kindknoten hinzu
	 * 
	 * Kindknoten dürfen alle Objekte von Klassen sein, die von
	 * AbstrakteKomponente abgeleitet sind (Polymorphie)
	 * 
	 * k darf sein: DebuggerEmail, DebuggerSMS, DebuggerLogfile ODER Kompositum
	 * 
	 * @param k
	 */
	public void hinzufuegen(Integer key, AbstrakteKomponente k) {

		this.kindKnoten.put(key, k);

	}

	/**
	 * die Methode entfernt einen Kindknoten aus dem Komositum
	 * 
	 * TODO entfernen muss ggf. auch die Unterknoten untersuchen
	 * 
	 * @param k
	 */
	public boolean entfernen(Integer key) {

		// falls keine Kindknoten da sind .....
		if (this.kindKnoten.containsKey(key)) {
			this.kindKnoten.remove(key);
			return true;
		} else {
			Set<Integer> keySet = this.kindKnoten.keySet();

			for (Integer i : keySet) {
				if (this.getClass() == this.kindKnoten.get(i).getClass()) {
					Kompositum k = (Kompositum) this.kindKnoten.get(i);
					if (k.entfernen(key)) {
						return true;
					}
				}
			}
			return false;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.marco.composite.AbstrakteKomponente#methodeA()
	 */
	@Override
	public void methodeA() {
		// Set ist wieder Iterierbar und kann mit der ForEach durchsucht werden
		
		//hole alle Schlüssel aus dem aktuellen Kompositums
		Set<Integer> keySet = this.kindKnoten.keySet();
		// wir lassen **ALLE** abstrakten Komponenten die Methode a ausführen,
		// d.h. im Falle eines Debuggers folgt eine Ausgabe
		// im Falle eines Kompositum lässt das dann wieder alle abstrakten
		// Komponenten
		// die MethodeA() ausführen
		for (Integer i : keySet ) {
			this.kindKnoten.get(i).methodeA();
		}

	}

}
