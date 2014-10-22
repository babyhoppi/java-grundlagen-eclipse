package de.marco;


public class Singleton {
	/**
	 * in dieser Klassenvariable speichern wir die erzeugte Instanz der Klasse
	 */
	private static final Singleton instance = new Singleton();
	/**
	 * Der Konstruktor der Klasse wird "privatiesiert"
	 */
	private Singleton(){
		
	}
	
	/**
	 * Die Kopiermethode wird geschützt
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
