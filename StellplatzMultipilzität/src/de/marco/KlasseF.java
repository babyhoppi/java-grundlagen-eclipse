//LÖSUNG HERR BAUER
package de.marco;

public class KlasseF {
	
	private static int number = 0;
	private int id;
	
	KlasseF() {
		this.id = KlasseF.number;
		KlasseF.number++;
	}

	@Override
	public String toString() {
		return "KlasseF [id=" + id + "]";
	}
	
	

}
