//LÖSUNG HERR BAUER
package de.marco;

import java.util.ArrayList;
import java.util.List;

public class KlasseE {
	// max vier Elemente ind er KlasseE verwalten lassen
	private static final int max = 4;
	private List<KlasseF> container = null;
	
	/**
	 * Konstruktor erzeugt einen neuen, leeren Container	
	 */
	public KlasseE(){
		this.container = new ArrayList<>();
	}

	/**
	 * erstellt eine neue Verbindung zwischen einen Objekt der KlasseE und einem Objekt der KlasseF
	 * @param objF
	 */
	public void setLink(KlasseF objF) {
		//falls der Container schon voll ist, dann wird nichts mehr hinzugefügt
		if(this.container.size() < KlasseE.max) {
			this.container.add(objF);
		}
	}
	
	/**
	 * liefert ein Array, das alle Links zu Objekten der KlasseD enthält
	 * 
	 * @return
	 */
	public KlasseF[] getAllLink() {
		// TODO Auto-generated method stub
		return this.container.toArray(new KlasseF[container.size()]);
		
	}
	/**
	 * entfernt einen Link zwischen Objekten der KlasseE und KlasseF
	 * @param objF
	 */
	public void removeLink(KlasseF objF){
		if ( this.container.contains(objF)){
			this.container.remove(objF);
		}
	}
	
}
