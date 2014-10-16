package de.marco.java.ausnahmen;
/**
 * 
 */

/**
 * @Author Marco Hoppe
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//....
			if(!true) {
				throw new NoDataFoundException("keine Daten gefunden");
			} else {
				throw new FileNotFoundException("Datei xyz nicht gefunden");
			}
			//....
		} catch (NoDataFoundException e) {
			//spezielle Fehlerbehandlung, falls keine Daten gefunden worden sind
		} catch (FileNotFoundException e) {
			//spezielle Fehlerbehandlung, falls die Datei nicht gefunden worden ist
		} catch (Exception e) {
			//allgemeine Fehlerbehandlung, für alle sonstigen Fehler
		}
		
		

	}

}
