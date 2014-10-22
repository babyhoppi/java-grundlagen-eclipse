//LÖSUNG HERR BAUER
package de.marco;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Kurs {
	// max vier Elemente ind er Kurs verwalten lassen
	//private static final int max = 4;
	private TreeMap<Integer,Schueler> teilnehmer;
	private Schueler schueler;
	
	/**
	 * Konstruktor erzeugt einen neuen, leeren Container	
	 */
	public Kurs(){
		this.teilnehmer = new TreeMap<Integer, Schueler>();
	}

	public void einschreiben(Schueler s) {
		this.teilnehmer.put(s.getID(), s);
	}
	
	public void ausschreiben(Schueler s) {
		this.teilnehmer.remove(s.getID(), s);
	}
	
	public void auflisten() {
		for (Integer elem : teilnehmer.keySet()) {
			schueler = teilnehmer.get(elem);
            System.out.println(elem + " - " + schueler);
        } 
	}
	
	
}
