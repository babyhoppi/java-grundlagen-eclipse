/**
 * 
 */
package de.marco.AufgabeFahrzeuge;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Marco Hoppe
 */
public class AusgabeDatei {

	PrintWriter autoListe = null;

	// wir benoetigen eine Positionsvariable
	private int position = 0;

	/**
	 * @param string
	 * @return 
	 * @throws IOException
	 */
	public AusgabeDatei ausgebenInDatei(Car car,String dateiName) {

		try {
			this.autoListe = new PrintWriter(new FileWriter(dateiName, true),true);
			autoListe.println(car.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (autoListe != null) {
				autoListe.close();
			}
		}return null;
	}
	
}
