//LÖSUNG HERR BAUER
package de.marco;

public class Schueler {
	
	private static int number = 0;
	private int id;
	private String vorname;
	private String nachname;
	
	Schueler() {
		this.id = Schueler.number;
		this.nachname = "kein Nachname";
		Schueler.number++;
	}
	
	Schueler(int id, String nachname) {
		this.id = id;
		this.nachname = nachname;
		Schueler.number++;
	}

	public Schueler(int id, String vorname, String nachname) {
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		Schueler.number++;
	}

	@Override
	public String toString() {
		if( this.vorname != null) {
			return "Schueler Name: " + vorname + " " + nachname + " hat die ID: " +id;
		} else {
			return "Schueler Name: " + nachname + " hat die ID: " +id;	
		}
	}

	public int getID(){
		return this.id;
	}
	
	
	
	

}
